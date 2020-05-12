package com.example.tictactoe_game;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button but1, but2, but3, but4, but5, but6, but7, but8, but9, reset;
    TextView title, winner;
    ArrayList<Button> arr;
    int chance = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = findViewById(R.id.button1);
        but2 = findViewById(R.id.button2);
        but3 = findViewById(R.id.button3);
        but4 = findViewById(R.id.button4);
        but5 = findViewById(R.id.button5);
        but6 = findViewById(R.id.button6);
        but7 = findViewById(R.id.button7);
        but8 = findViewById(R.id.button8);
        but9 = findViewById(R.id.button9);
        reset = findViewById(R.id.reset);
        winner = findViewById(R.id.winner);
        arr = new ArrayList();

        arr.add(but1);
        arr.add(but2);
        arr.add(but3);
        arr.add(but4);
        arr.add(but5);
        arr.add(but6);
        arr.add(but7);
        arr.add(but8);
        arr.add(but9);

        for (Button b : arr) {
            b.setOnClickListener(this);
        }

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but1.setText("");
                but2.setText("");
                but3.setText("");
                but4.setText("");
                but5.setText("");
                but6.setText("");
                but7.setText("");
                but8.setText("");
                but9.setText("");
                winner.setText("");
            }
        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button1:
                if (but1.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        but1.setText("O");
                        result();
                    } else {
                        chance = 0;
                        but1.setText("X");
                        result();
                    }
                }
                break;

            case R.id.button2:
                if (but2.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        but2.setText("O");
                        result();
                    } else {
                        chance = 0;
                        but2.setText("X");
                        result();
                    }
                }
                break;

            case R.id.button3:
                if (but3.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        but3.setText("O");
                        result();
                    } else {
                        chance = 0;
                        but3.setText("X");
                        result();
                    }
                }
                break;

            case R.id.button4:
                if (but4.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        but4.setText("O");
                        result();
                    } else {
                        chance = 0;
                        but4.setText("X");
                        result();
                    }
                }
                break;

            case R.id.button5:
                if (but5.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        but5.setText("O");
                        result();
                    } else {
                        chance = 0;
                        but5.setText("X");
                        result();
                    }
                }
                break;

            case R.id.button6:
                if (but6.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        but6.setText("O");
                        result();
                    } else {
                        chance = 0;
                        but6.setText("X");
                        result();
                    }
                }
                break;

            case R.id.button7:
                if (but7.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        but7.setText("O");
                        result();
                    } else {
                        chance = 0;
                        but7.setText("X");
                        result();
                    }
                }
                break;

            case R.id.button8:
                if (but8.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        but8.setText("O");
                        result();
                    } else {
                        chance = 0;
                        but8.setText("X");
                        result();
                    }
                }
                break;

            case R.id.button9:
                if (but9.getText().toString().equals("")) {
                    if (chance == 0) {
                        chance = 1;
                        but9.setText("O");
                        result();
                    } else {
                        chance = 0;
                        but9.setText("X");
                        result();
                    }
                }


        }
    }

    public void result() {
        if (but1.getText().toString().equals("X") && but2.getText().toString().equals("X") && but3.getText().toString().equals("X")) {
            winner.setText(" X wins !! ");


        } else if (but4.getText().toString().equals("X") && but5.getText().toString().equals("X") && but6.getText().toString().equals("X")) {
            winner.setText(" X wins !! ");

        } else if (but7.getText().toString().equals("X") && but8.getText().toString().equals("X") && but9.getText().toString().equals("X")) {
            winner.setText(" X wins !! ");

        }
        if (but1.getText().toString().equals("X") && but4.getText().toString().equals("X") && but7.getText().toString().equals("X")) {
            winner.setText(" X wins !! ");

        }
        if (but2.getText().toString().equals("X") && but5.getText().toString().equals("X") && but8.getText().toString().equals("X")) {
            winner.setText(" X wins !! ");
        }
        if (but3.getText().toString().equals("X") && but6.getText().toString().equals("X") && but9.getText().toString().equals("X")) {
            winner.setText(" X wins !! ");

        } else if (but1.getText().toString().equals("O") && but2.getText().toString().equals("O") && but3.getText().toString().equals("O")) {
            winner.setText(" O wins !! ");

        } else if (but4.getText().toString().equals("O") && but5.getText().toString().equals("O") && but6.getText().toString().equals("O")) {
            winner.setText(" O wins !! ");

        } else if (but7.getText().toString().equals("O") && but8.getText().toString().equals("O") && but9.getText().toString().equals("O")) {
            winner.setText(" O wins !! ");

        }
        if (but1.getText().toString().equals("O") && but4.getText().toString().equals("O") && but7.getText().toString().equals("O")) {
            winner.setText(" O wins !! ");

        }
        if (but2.getText().toString().equals("O") && but5.getText().toString().equals("O") && but8.getText().toString().equals("O")) {
            winner.setText(" O wins !! ");

        }
        if (but3.getText().toString().equals("O") && but6.getText().toString().equals("O") && but9.getText().toString().equals("O")) {
            winner.setText(" O wins !! ");

        } else if (but1.getText().toString().equals("X") && but5.getText().toString().equals("X") && but9.getText().toString().equals("X")) {
            winner.setText(" X wins !! ");

        } else if (but3.getText().toString().equals("X") && but5.getText().toString().equals("X") && but7.getText().toString().equals("X")) {
            winner.setText(" X wins !! ");

        } else if (but1.getText().toString().equals("O") && but5.getText().toString().equals("O") && but9.getText().toString().equals("O")) {
            winner.setText(" O wins !! ");

        } else if (but3.getText().toString().equals("O") && but5.getText().toString().equals("O") && but7.getText().toString().equals("O")) {
            winner.setText(" O wins !! ");

        }


    }
}