package com.example.huascar.calculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.huascar.calculator.databinding.ActivityMainBinding;
import com.example.huascar.calculator.models.Calculator;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Calculator calculator = new Calculator();


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        }

        public void onNumberClick(View view) {
            Button button = (Button) view;
            String result = this.getButtonText(button);


            int number = Integer.parseInt(result);
            calculator.numberClick(number);
            this.setValueView(result);
        }

        public void onOperatorClick(View view) {
            Button button = (Button) view;
            String value = this.getButtonText(button);
            char val = value.charAt(0);
            calculator.operatorClick(val);
            String result = String.valueOf(calculator.getRunningTotal());

            this.setValueView(result);
            if (val == '=') {
                this.setValueView(result);
            }

        }

        public void onClearClick (View view) {
            Button button = (Button) view;
            String value = this.getButtonText(button);

            binding.editText.setText("0");
            calculator.clearClick();
        }

        String getButtonText(Button button) {
            String result = button.getText().toString();
            return result;
        }

        void setValueView(String value) {
                binding.editText.setText(value);
        }
}
