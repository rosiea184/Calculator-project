package com.example.calculator_wizes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter = findViewById(R.id.button_settings);
        enter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                openNewActivity();
            }
        });



    }

    public void openNewActivity{}
}
