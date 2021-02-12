package ru.geeekbrains.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Long num1;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(v -> numberButton(button0));
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> numberButton(button1));

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> numberButton(button2));

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> numberButton(button3));

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(v -> numberButton(button4));

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(v -> numberButton(button5));

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(v -> numberButton(button6));

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(v -> numberButton(button7));

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(v -> numberButton(button8));

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(v -> numberButton(button9));

        Button button_clear = findViewById(R.id.button_clear);
        button_clear.setOnClickListener(v -> clearButton());

        Button button_add = findViewById(R.id.button_addition);
        button_add.setOnClickListener(v -> num1 = operatorButton(button_add));

        Button button_div = findViewById(R.id.button_division);
        button_div.setOnClickListener(v -> num1 = operatorButton(button_div));

        Button button_multi = findViewById(R.id.button_multi);
        button_multi.setOnClickListener(v -> num1 = operatorButton(button_multi));

        Button button_sub = findViewById(R.id.button_subtraction);
        button_sub.setOnClickListener(v -> num1 = operatorButton(button_sub));

        Button button_equals = findViewById(R.id.button_equals);
        button_equals.setOnClickListener(v -> equalsButton(button_equals));

    }

    protected void numberButton (Button b){
        String value = textView.getText() + (String) b.getText();
        textView.setText(value);
    }

    protected Long operatorButton (Button b){
        String value = (String) textView.getText();
        operator = (String) b.getText();
        textView.setText(null);
        return Long.parseLong(value);
    }

    protected void equalsButton (Button b){
        long result;
        Long num2 = Long.parseLong((String) textView.getText());
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                result = num1 / num2;
                break;
        }
        String value = num1 + operator + num2 + b.getText() + result;
        textView.setText(value);
    }

    protected void clearButton (){
        textView.setText(null);
    }

}