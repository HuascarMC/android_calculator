package com.example.huascar.calculator.models;

/**
 * Created by huascar on 14/02/2018.
 */

public class Calculator {
    private char previousOperator = ' '; // the last operator the user clicked
    private int previousTotal;   // the total of the previous operation
    private boolean newTotal;        // whether the previous operation has just been calculated
    private int runningTotal;
    private boolean previousTotalChange = false;


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

        this.runningTotal = number;
    }

    public void operatorClick(char operator) {
        if ((this.previousOperator != ' ') & (this.previousTotalChange)) {

            switch (operator) {

                case '+':
                    this.add(this.runningTotal);
                    this.handleOperator(operator);
//                    break;
                case '-':
                    this.subtract(this.runningTotal);
                    this.handleOperator(operator);
                    break;
                case '*':
                    this.multiply(this.runningTotal);
                    this.handleOperator(operator);
                    break;
                case '/':
                    this.divide(this.runningTotal);
                    this.handleOperator(operator);
                    break;
            }
        }
        this.handleOperator(operator);

    }

    private void handleOperator(char operator) {
        System.out.print(operator);
        if (operator == '=') {
            this.previousOperator = ' ';
        } else {
            this.previousOperator = operator;
        }

        this.previousTotal = this.runningTotal;
        this.newTotal = true;
        this.previousTotalChange = true;
    }

    public void clearClick() {
        if (this.runningTotal == 0) {
            this.previousOperator = ' ';
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

    public char getPreviousOperator() {
        return previousOperator;
    }


    public boolean getNewTotal() { return this.newTotal; }
}