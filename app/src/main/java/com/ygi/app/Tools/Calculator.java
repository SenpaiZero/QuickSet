package com.ygi.app.Tools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ygi.app.R;

public class Calculator extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private Button clear;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = 'x';
    private final char DIVISION = '÷';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(val1) + " - ");
                info.setText(null);
                }catch (NumberFormatException e) {
                    Toast.makeText(getBaseContext(), "Please input a number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + " + ");
                info.setText(null);
                }catch (NumberFormatException e) {
                    Toast.makeText(getBaseContext(), "Please input a number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1) + " x ");
                info.setText(null);
                }catch (NumberFormatException e) {
                    Toast.makeText(getBaseContext(), "Please input a number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + " ÷ ");
                info.setText(null);
                }catch (NumberFormatException e) {
                    Toast.makeText(getBaseContext(), "Please input a number", Toast.LENGTH_SHORT).show();
                }
            }
        });


            equal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        compute();
                        ACTION = EQU;
                        result.setText(result.getText().toString() + String.valueOf(val2) + " = " + String.valueOf(val1));
                    }catch (NumberFormatException e) {
                        Toast.makeText(getBaseContext(), "Please input a number", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() > 0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });

    }

    private void setupUIViews(){

        zero = (Button) findViewById(R.id.button2);
        one = (Button) findViewById(R.id.button5);
        two = (Button) findViewById(R.id.button6);
        three = (Button) findViewById(R.id.button7);
        four = (Button) findViewById(R.id.button9);
        five = (Button) findViewById(R.id.button10);
        six = (Button) findViewById(R.id.button11);
        seven = (Button) findViewById(R.id.button13);
        eight = (Button) findViewById(R.id.button14);
        nine = (Button) findViewById(R.id.button15);
        sub = (Button) findViewById(R.id.button12);
        div = (Button) findViewById(R.id.button18);
        mul = (Button) findViewById(R.id.button16);
        add = (Button) findViewById(R.id.button8);
        info = (TextView) findViewById(R.id.info);
        result = (TextView) findViewById(R.id.result);
        equal = (Button) findViewById(R.id.button4);
        clear = (Button) findViewById(R.id.button116);
    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());

            switch(ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQU:
                    break;
            }
        }
        else{
            val1 = Double.parseDouble(info.getText().toString());
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

