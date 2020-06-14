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

                        if (a && !b && !c)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CommPlatformActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Gmail.\n\n" +
                                    "2) Google Hangouts.\n\n" +
                                    "3) Facebook Workplace.\n\n" +
                                    "4) Cisco Webex Teams.\n\n" +
                                    "5) Zoho Cliq.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (!a && b && !c)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CommPlatformActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Microsoft Teams.\n\n" +
                                    "2) CA Flowdock.\n\n" +
                                    "3) Amazon Chime.\n\n" +
                                    "4) Discord.\n\n" +
                                    "5) Ryver.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (!a && !b && c)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CommPlatformActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Chatwork.\n\n" +
                                    "2) Slack.\n\n" +
                                    "3) Twist.\n\n" +
                                    "4) Flock.\n\n" +
                                    "5) Mattermost.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CommPlatformActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("The answers you have given do not match. Please change the answers you have given in the fields.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                    }
                });
            }
    }