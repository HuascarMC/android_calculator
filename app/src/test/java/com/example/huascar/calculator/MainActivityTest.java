package com.example.huascar.calculator;

import android.annotation.SuppressLint;
import android.test.AndroidTestCase;
import android.view.LayoutInflater;
import android.view.View;

import com.example.huascar.calculator.models.Calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by huascar on 25/02/2018.
 */

public class MainActivityTest extends AndroidTestCase {

    private MainActivity mainActivity;
    private View customView;


    @SuppressLint("InflateParams")
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        customView = LayoutInflater.from(getContext())
                .inflate(R.layout.activity_main, null);
    }


    @Before
    public void before() {
        mainActivity = new MainActivity();
    }


    @Test
    public void OnNumberClickTest() throws Exception {
        mainActivity.onNumberClick(customView.findViewById(9));
        assertEquals(7, mainActivity.calculator.getRunningTotal());
    }

    @Test
    public void OnOperatorClickTest() throws Exception {
        mainActivity.onOperatorClick(mainActivity.binding.buttonAdd);
        assertEquals('+', mainActivity.calculator.getPreviousOperator());
    }

    @Test
    public void onClearClickTest() throws Exception {
        mainActivity.onClearClick(mainActivity.binding.buttonClear);
        assertEquals(0, mainActivity.calculator.getRunningTotal());
    }

    @Test
    public void getButtonTextTest() throws Exception {
        String buttonText = mainActivity.getButtonText(mainActivity.binding.buttonEight);
        assertEquals(8, buttonText);
    }

    @Test
    public void setValueViewTest() throws Exception {
        mainActivity.setValueView("TEST");
        assertEquals("TEST", mainActivity.binding.editText.getText());
    }
}
