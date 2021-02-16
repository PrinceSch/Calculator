package ru.geeekbrains.calculator;

import android.widget.Button;
import android.widget.TextView;

public class CalculatorLogic implements CalcLogic {

    private String operator;
    private Long num1;

    @Override
    public void numberButton(Button b, TextView t) {
        String value = t.getText() + (String) b.getText();
        t.setText(value);
    }

    @Override
    public void operatorButton(Button b, TextView t) {
        String value = (String) t.getText();
        operator = (String) b.getText();
        t.setText(null);
        num1 = Long.parseLong(value);
    }

    @Override
    public void equalsButton(Button b, TextView t) {
        long result;
        Long num2 = Long.parseLong((String) t.getText());
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
        t.setText(value);
    }

    @Override
    public void clearButton(TextView t) {
        t.setText(null);
    }
}
