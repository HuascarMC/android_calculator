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
            this.setValueView("0");
        }

        public void onNumberClick(View view) {
            Button button = (Button) view;
            String result = this.getButtonText(button);
            if (calculator.getNewTotal()) {
                this.setValueView(result);
            }

            int number = Integer.parseInt(result);
            calculator.numberClick(number);
        }

        public void onOperatorClick(View view) {
            Button button = (Button) view;
            String value = this.getButtonText(button);

            calculator.operatorClick(value);
            String result = String.valueOf(calculator.getRunningTotal());
            if ( calculator.getNewTotal() )
                this.setValueView(result);
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

        void setValueView(String value){
            binding.editText.setText(value);
        }
}
