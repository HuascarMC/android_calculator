package com.example.huascar.calculator;

import com.example.huascar.calculator.models.Calculator;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by huascar on 19/02/2018.
 */

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void numberClick() throws Exception {
        calculator.numberClick(7);
        assertEquals(7, calculator.getRunningTotal());
    }

    @Test
    public void additionTest() throws Exception {
        calculator.add(2);
        assertEquals(2, calculator.getRunningTotal());
    }

    @Test
    public void subtractionTest() throws Exception {
        calculator.subtract(4);
        System.out.print(calculator.getRunningTotal());
        assertEquals(-4, calculator.getRunningTotal());
    }

    @Test
    public void multiplyTest() throws Exception {
        calculator.numberClick(3);
        calculator.multiply(5);
        assertEquals(15, calculator.getRunningTotal());
    }

    @Test
    public void divideTest() throws Exception {
//        assertEquals();
    }

    @Test
    public void runningTotalTest() throws Exception {
//        assertEquals();
    }

    @Test
    public void clearClickTest() throws Exception {
//        assertEquals();
    }
}
