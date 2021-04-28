package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity<mSubtract> extends AppCompatActivity {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_calc, btn_dec, btn_clear;
    EditText value;
    float value1;
    float value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.zero);
        btn_1 = (Button) findViewById(R.id.one);
        btn_2 = (Button) findViewById(R.id.two);
        btn_3 = (Button) findViewById(R.id.three);
        btn_4 = (Button) findViewById(R.id.four);
        btn_5 = (Button) findViewById(R.id.five);
        btn_6 = (Button) findViewById(R.id.six);
        btn_7 = (Button) findViewById(R.id.seven);
        btn_8 = (Button) findViewById(R.id.eight);
        btn_9 = (Button) findViewById(R.id.nine);
        btn_Add = (Button) findViewById(R.id.plus);
        btn_Sub = (Button) findViewById(R.id.minus);
        btn_Mul = (Button) findViewById(R.id.multiply);
        btn_Div = (Button) findViewById(R.id.divide);
        btn_calc = (Button) findViewById(R.id.equal);
        btn_clear = (Button) findViewById(R.id.clear);
        btn_dec = (Button) findViewById(R.id.decimal);
        value = (EditText) findViewById(R.id.edText1);


    btn_0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+"0");
        }
    });
    btn_1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+"1");
        }
    });
    btn_2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+"2");
        }
    });
    btn_3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+"3");
        }
    });
    btn_4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+"4");
        }
    });
    btn_5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+"5");
        }
    });
    btn_6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+"6");
        }
    });
    btn_7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+"7");
        }
    });
    btn_8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+"8");
        }
    });
    btn_9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+"9");
        }
    });
    btn_Add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value1 = Float.parseFloat(value.getText() + "");
            mAddition = true ;
            value.setText(null);
        }

    });
    btn_Sub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value1 = Float.parseFloat(value.getText() + "");
            mSubtract = true;
            value.setText(null);
        }


    });
    btn_Mul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value1 = Float.parseFloat(value.getText() + "");
            mMultiplication = true ;
            value.setText(null);
        }

    });
    btn_Div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value1 = Float.parseFloat(value.getText() + "");
            mDivision = true;
            value.setText(null);
        }
    });
    btn_calc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value2 = Float.parseFloat(value.getText() + "");

            if (mAddition == true){

                value.setText(value1 + value2 +"");
                mAddition=false;
            }


            if (mSubtract == true){
                value.setText(value1 - value2 +"");
                mSubtract=false;
            }

            if (mMultiplication == true){
                value.setText(value1 * value2 + "");
                mMultiplication=false;
            }

            if (mDivision == true){
                value.setText(value1 / value2+"");
                mDivision=false;
            }
        }
    });
    btn_clear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText("");
        }
    });
    btn_dec.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value.setText(value.getText()+".");
        }
    });


    }
}