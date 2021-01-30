package ru.geeekbrains.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*выбрал LinearLayout просто потому, что мне он показался самым оптимальным вариантом.
    * более гибкий, чем Table или Grid, Frame вообще для этой цели не подходил,
    * Constraint менее удобно настраивать под это дело
    * upd. а вот при добавлении картинки не смог придумать другой способ, кроме FrameLayout :D*/
}