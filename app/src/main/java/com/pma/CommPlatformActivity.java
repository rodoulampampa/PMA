package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class CommPlatformActivity extends AppCompatActivity {

    Button button;
    RadioGroup group1;
    RadioGroup group2;
    RadioGroup group3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comm_platform);

        button = (Button)findViewById(R.id.Save);
        group1 = (RadioGroup) findViewById(R.id.radio_group_1);
        group2 = (RadioGroup) findViewById(R.id.radio_group_2);
        group3 = (RadioGroup) findViewById(R.id.radio_group_3);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        boolean a, b, c;

                        switch(group1.getCheckedRadioButtonId())
                        {
                            case R.id.q1_1:
                            {
                                a = true;
                                break;
                            }

                            case R.id.q1_2:
                            {
                                a = false;
                                break;
                            }

                            default:
                            {
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(CommPlatformActivity.this);
                                builder.setTitle("Result:");
                                builder.setMessage("Please fill in all the fields.");

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                            }
                        }

                        switch(group2.getCheckedRadioButtonId())
                        {
                            case R.id.q2_1:
                            {
                                b = true;
                                break;
                            }

                            case R.id.q2_2:
                            {
                                b = false;
                                break;
                            }

                            default:
                            {
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(CommPlatformActivity.this);
                                builder.setTitle("Result:");
                                builder.setMessage("Please fill in all the fields.");

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                            }
                        }
                        switch(group3.getCheckedRadioButtonId())
                        {
                            case R.id.q3_1:
                            {
                                c = true;
                                break;
                            }

                            case R.id.q3_2:
                            {
                                c = false;
                                break;
                            }

                            default:
                            {
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(CommPlatformActivity.this);
                                builder.setTitle("Result:");
                                builder.setMessage("Please fill in all the fields.");

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                            }
                        }

                        if (a && !b)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CommPlatformActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (a && b)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CommPlatformActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CommPlatformActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                    }
                });
            }
    }
