package com.example.huascar.calculator.models;

/**
 * Created by huascar on 14/02/2018.
 */

public class Calculator {
    private String previousOperator; // the last operator the user clicked
    private int previousTotal;       // the total of the previous operation
    private int newTotal;         // whether the previous operation has just been calculated
    private int runningTotal;
}
