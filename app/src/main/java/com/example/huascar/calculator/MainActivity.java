package com.example.huascar.calculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.huascar.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private double valueOne = Double.NaN;
    private double valueTwo;
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char CURRENT_ACTION;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        }

        public void onClick(View view) {
            Button button = (Button) view;
            String result = this.getButtonText(button);
            this.setValueView(result);
        }

        private String getButtonText(Button button) {
            String result = button.getText().toString();
            return result;
        }

        private void setValueView(String value){
            binding.editText.setText(binding.editText.getText() + value);
        }
}
