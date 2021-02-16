package ru.geeekbrains.calculator;

import android.widget.Button;
import android.widget.TextView;

public interface CalcLogic {
    void numberButton(Button b, TextView t);
    void operatorButton (Button b, TextView t);
    void equalsButton (Button b, TextView t);
    void clearButton (TextView t);
}
