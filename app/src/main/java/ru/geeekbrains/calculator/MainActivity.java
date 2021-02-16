package ru.geeekbrains.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    CalculatorLogic calculatorLogic = new CalculatorLogic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(v -> calculatorLogic.numberButton(button0, textView));

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> calculatorLogic.numberButton(button1, textView));

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> calculatorLogic.numberButton(button2, textView));

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> calculatorLogic.numberButton(button3, textView));

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(v -> calculatorLogic.numberButton(button4, textView));

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(v -> calculatorLogic.numberButton(button5, textView));

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(v -> calculatorLogic.numberButton(button6, textView));

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(v -> calculatorLogic.numberButton(button7, textView));

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(v -> calculatorLogic.numberButton(button8, textView));

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(v -> calculatorLogic.numberButton(button9, textView));

        Button button_clear = findViewById(R.id.button_clear);
        button_clear.setOnClickListener(v -> calculatorLogic.clearButton(textView));

        Button button_add = findViewById(R.id.button_addition);
        button_add.setOnClickListener(v -> calculatorLogic.operatorButton(button_add, textView));

        Button button_div = findViewById(R.id.button_division);
        button_div.setOnClickListener(v -> calculatorLogic.operatorButton(button_div, textView));

        Button button_multi = findViewById(R.id.button_multi);
        button_multi.setOnClickListener(v -> calculatorLogic.operatorButton(button_multi, textView));

        Button button_sub = findViewById(R.id.button_subtraction);
        button_sub.setOnClickListener(v -> calculatorLogic.operatorButton(button_sub, textView));

        Button button_equals = findViewById(R.id.button_equals);
        button_equals.setOnClickListener(v -> calculatorLogic.equalsButton(button_equals, textView));

    }

}