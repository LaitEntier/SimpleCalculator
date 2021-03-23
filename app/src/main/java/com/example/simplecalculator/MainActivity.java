package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonDecimal, buttonC, buttonEqual;
    TextView display;
    boolean add, sub, multiply, divide;
    float mValueOne, mValueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);

        display = (TextView) findViewById(R.id.display);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(null);
                display.setText(display.getText() + "9");

            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().equals("")) {
                    display.setText("");
                    popUp("Entrez d'abord une valeur");
                } else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    add = true;
                    display.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().equals("")) {
                    display.setText("");
                    popUp("Entrez d'abord une valeur");
                } else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    sub = true;
                    display.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().equals("")) {
                    display.setText("");
                    popUp("Entrez d'abord une valeur");
                } else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    multiply = true;
                    display.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().equals("")) {
                    display.setText("");
                    popUp("Entrez d'abord une valeur");
                } else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    divide = true;
                    display.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().equals("")) {
                    display.setText("");
                    popUp("Entrez d'abord une valeur");
                } else {
                    mValueTwo = Float.parseFloat(display.getText() + "");

                    if (add == true) {
                        display.setText(mValueOne + mValueTwo + "");
                        add = false;
                    }

                    if (sub == true) {
                        display.setText(mValueOne - mValueTwo + "");
                        sub = false;
                    }

                    if (multiply == true) {
                        display.setText(mValueOne * mValueTwo + "");
                        multiply = false;
                    }

                    if (divide == true) {
                        display.setText(mValueOne / mValueTwo + "");
                        divide = false;
                    }
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + ".");
            }
        });
    }

    public void popUp(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}