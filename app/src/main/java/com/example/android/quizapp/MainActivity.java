package com.example.android.quizapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    TextView tv1, tv2, tv3;
    RadioButton a, b, c, d;
    Button bt;
    RadioGroup rg;
    int questionNumber, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.name);
        tv1 = (TextView) findViewById(R.id.question);
        tv2 = (TextView) findViewById(R.id.response);
        tv3 = (TextView) findViewById(R.id.score);
        rg = (RadioGroup) findViewById(R.id.optionGroup);
        a = (RadioButton) findViewById(R.id.option1);
        b = (RadioButton) findViewById(R.id.option2);
        c = (RadioButton) findViewById(R.id.option3);
        d = (RadioButton) findViewById(R.id.option4);
        bt = (Button) findViewById(R.id.next);
        questionNumber = 0;
        score = 0;

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter your name first.",
                            Toast.LENGTH_LONG).show();
                } else {
                    //. start quiz
                    quiz(view);
                }
            }
        });
    }

    public void quiz(View v) {
        switch (questionNumber) {
            case 0: {
                rg.setVisibility(View.VISIBLE);
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                tv2.setText("");
                tv3.setText("");
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                ed1.setEnabled(true);
                bt.setText(R.string.next);
                score = 0;
                tv1.setText(R.string.question_one);
                a.setText("1847");
                b.setText("1963");
                c.setText("1850");
                d.setText("1960");
                questionNumber = 1;
                break;
            }
            case 1: {
                ed1.setEnabled(false);
                tv1.setText("2.Who is the first Nigerian President");
                a.setText("Mohammed Buhari");
                b.setText("Lal Mohammed");
                c.setText("Nnamdi Azikiwe");
                d.setText("Goodluck Jonathan");
                if (d.isChecked()) {
                    tv2.setText("Right Answer");
                    score = score + 10;
                } else {
                    tv2.setText("Wrong Answer D was Right Answer");
                }
                questionNumber = 2;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 2: {
                tv1.setText("3.The Planet Earth has how many Moons");
                a.setText("2");
                b.setText("5");
                c.setText("3");
                d.setText("1");
                if (c.isChecked()) {
                    score = score + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer C was Right Answer");
                }
                questionNumber = 3;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 3: {
                tv1.setText("4.The biggest Ocean in the world");
                a.setText("River Nile");
                b.setText("Atlantic Ocean");
                c.setText("Pacific Ocean");
                d.setText("River Misisipi");
                if (d.isChecked()) {
                    score = score + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer D was Right Answer");
                }
                questionNumber = 4;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 4: {
                tv1.setText("5.Which of the following is a figure of Speech");
                a.setText("Noun");
                b.setText("Oxymoron");
                c.setText("Tale");
                d.setText("story");
                if (c.isChecked()) {
                    score = score + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer C was Right Answer");
                }
                questionNumber = 5;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 5: {
                tv1.setText("6.Which of the following is a search Engine");
                a.setText("Google");
                b.setText("Facebook");
                c.setText("Twitter");
                d.setText("Instagram");
                if (b.isChecked()) {
                    score = score + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer B was Right Answer");
                }
                questionNumber = 6;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 6: {
                tv1.setText("7.Which one of the following numbers is an Even number:");
                a.setText("5");
                b.setText("15");
                c.setText("16");
                d.setText("21");
                if (a.isChecked()) {
                    score = score + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer A was Right Answer");
                }
                questionNumber = 7;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 7: {
                tv1.setText("8.Which one of the following numbers is a prime number:");
                a.setText("12");
                b.setText("15");
                c.setText("17");
                d.setText("21");
                if (c.isChecked()) {
                    score = score + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer C was Right Answer");
                }
                questionNumber = 8;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 8: {
                tv1.setText("9.What is the only mammal on Earth that can actively fly?");
                a.setText("Bat");
                b.setText("Eagle");
                c.setText("Vulture");
                d.setText("Fly");
                if
                        (c.isChecked()) {
                    score = score + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer C was Right Answer");
                }
                questionNumber = 9;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 9: {
                tv1.setText("10.Who is known as the world's fastest 1000m sprinter?");
                a.setText("Messi");
                b.setText("Usain Bolt");
                c.setText("jack wheel");
                d.setText("Pingali Venkayya");
                if
                        (a.isChecked()) {
                    score = score + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText(R.string.a_right_answer);
                }
                questionNumber = 10;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                bt.setText(R.string.finish);
                break;
            }

            case 10: {
                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                if (b.isChecked()) {
                    score = score + 10;
                    tv2.setText(R.string.right_answer);
                } else {
                    tv2.setText(R.string.wrong_answer);
                }
                tv3.setText(String.format(getString(R.string.final_grade_display), ed1.getText(), score));

                // if score is Above 50 you passed
                if (score >= 50) {
                    tv3.append("\nYou passed");
                } else {
                    tv3.append("\nYou failed");
                }

                bt.setText(R.string.restart);
                questionNumber = 0;
                break;
            }


        }
    }
}