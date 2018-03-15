package com.example.huascar.calculator;

import android.view.View;

import com.example.huascar.calculator.models.Calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by huascar on 25/02/2018.
 */

public class MainActivityTest {

    private MainActivity mainActivity;

    @Before
    public void before() {
        mainActivity = new MainActivity();
    }


    @Test
    public void OnNumberClick(View view) throws Exception {
        mainActivity.onNumberClick(buttonSeven);
        assertEquals(7, mainActivity.calculator.getRunningTotal());
    }

    @Test
    public void OnOperatorClick(View view) throws exception {
        mainActivity.onOperatorClick(buttonAdd)
        assertEquals('+', mainActivity.onOperatorClick(buttonAdd);
    }

    @Test
    public void onClearClick(View view) throws exception {
        assertEquals();
    }
}
