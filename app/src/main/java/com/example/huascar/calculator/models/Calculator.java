package com.example.huascar.calculator.models;

/**
 * Created by huascar on 14/02/2018.
 */

public class Calculator {
    private String previousOperator; // the last operator the user clicked
    private int previousTotal = 0;   // the total of the previous operation
    private boolean newTotal;        // whether the previous operation has just been calculated
    private int runningTotal = 0;
    

    public void add(int number) {
        this.runningTotal = (this.previousTotal + number);
    }

    public void subtract(int number) {
        this.runningTotal = (this.previousTotal - number);
    }

    public void multiply(int number) {
        this.runningTotal = (this.previousTotal * number);
    }

    public void divide(int number) {
        this.runningTotal = (this.previousTotal / number);
    }

    public void numberClick(int number) {

        if (this.runningTotal == 0 || this.newTotal) {
            this.runningTotal = 0;
            this.newTotal = false;
        }

        this.runningTotal = this.runningTotal + number;
    }

    public void operatorClick(String operator) {
        switch (operator) {
            case "+":
                this.add(this.runningTotal);
                break;
            case "-":
                this.subtract(this.runningTotal);
                break;
            case "*":
                this.multiply(this.runningTotal);
                break;
            case "/":
                this.divide(this.runningTotal);
                break;
        }

        if (operator == "=") {
            this.previousOperator = null;
        } else {
            this.previousOperator = operator;
        }

        System.out.println(this.runningTotal);
        this.previousTotal = this.runningTotal;
        this.newTotal = true;
    }

    public void clearClick() {
        if (this.runningTotal == 0) {
            this.previousOperator = null;
            this.previousTotal = 0;
        }
        this.runningTotal = 0;
    }

    public int getRunningTotal() {
        return runningTotal;
    }

    public int getPreviousTotal() {
        return previousTotal;
    }

    public String getPreviousOperator() {
        return previousOperator;
    }
}