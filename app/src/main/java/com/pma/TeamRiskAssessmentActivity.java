package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class TeamRiskAssessmentActivity extends AppCompatActivity {

    Button button;
    EditText editq1ans;
    RadioGroup group1;
    RadioGroup group2;
    RadioGroup group3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_risk_assessment);

        button = (Button)findViewById(R.id.Save);
        editq1ans = (EditText) findViewById(R.id.q1ans);
        group1 = (RadioGroup) findViewById(R.id.radio_group_1);
        group2 = (RadioGroup) findViewById(R.id.radio_group_2);
        group3 = (RadioGroup) findViewById(R.id.radio_group_3);


        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Log.i("EditText Value = ", editq1ans.getText().toString());
                        boolean a, b, c ;
                        switch(group1.getCheckedRadioButtonId())
                        {
                            case R.id.q2_1:
                                {
                                    a = true;
                                    break;
                                }

                            case R.id.q2_2:
                                {
                                    a = false;
                                    break;
                                }

                            default:
                                {
                                    // setup the alert builder
                                    AlertDialog.Builder builder = new AlertDialog.Builder(TeamRiskAssessmentActivity.this);
                                    builder.setMessage("Please fill in all the fields.")
                                            .setCancelable(false)
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int id) {
                                                    Intent intent = new Intent(TeamRiskAssessmentActivity.this, ProjectActivity.class);
                                                    startActivity(intent);
                                                }
                                            });

                                    // create and show the alert dialog
                                    AlertDialog dialog = builder.create();
                                    dialog.show();
                                    return;
                                }
                        }

                        switch(group2.getCheckedRadioButtonId())
                        {
                            case R.id.q3_1:
                                {
                                    b = true;
                                    break;
                                }

                            case R.id.q3_2:
                                {
                                    b = false;
                                    break;
                                }

                            default:
                                {
                                    // setup the alert builder
                                    AlertDialog.Builder builder = new AlertDialog.Builder(TeamRiskAssessmentActivity.this);
                                    builder.setMessage("Please fill in all the fields.")
                                            .setCancelable(false)
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int id) {
                                                    Intent intent = new Intent(TeamRiskAssessmentActivity.this, ProjectActivity.class);
                                                    startActivity(intent);
                                                }
                                            });

                                    // create and show the alert dialog
                                    AlertDialog dialog = builder.create();
                                    dialog.show();
                                    return;
                                }
                        }

                        switch(group3.getCheckedRadioButtonId())
                        {
                            case R.id.q4_1:
                                {
                                    c = true;
                                    break;
                                }

                            case R.id.q4_2:
                                {
                                    c = false;
                                    break;
                                }

                            default:
                                c = true;
                        }

                        if (editq1ans.getText().toString().equals("") )
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamRiskAssessmentActivity.this);
                            builder.setMessage("Please fill in all the fields.")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamRiskAssessmentActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) > 8)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamRiskAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("You have many team members in your team.\n\n" +
                                    " I would suggest that you consider the possibility of splitting into two subgroups that communicate with each " +
                                    "other when required.")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamRiskAssessmentActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) <= 8 && !a && b)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamRiskAssessmentActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Τeam break.\n\n" +
                                    "2) Group member inactivity.\n\n" +
                                    "3) Intense group disagreements.\n\n" +
                                    "4) Decision-making risk.\n\n" +
                                    "5) Wariness risk.\n\n" +
                                    "6) Intra-task deadlock risk.\n\n")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamRiskAssessmentActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) <= 8 && a && !b && c)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamRiskAssessmentActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Τeam break.\n\n" +
                                    "2) Group member inactivity.\n\n" +
                                    "3) Improper division of tasks.\n\n" +
                                    "4) Intense group disagreements.\n\n" +
                                    "5) Interpersonal conflict risk.\n\n" +
                                    "6) Intra-task deadlock risk.\n\n")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamRiskAssessmentActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) <= 8 && a && !b && !c)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamRiskAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("1) Τeam break.\n\n" +
                                    "2) Group member inactivity.\n\n" +
                                    "3) Improper division of tasks.\n\n" +
                                    "4) Interpersonal conflict risk.\n\n" +
                                    "5) Intra-task deadlock risk.\n\n" +
                                    "6) Coordination risk.\n\n")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamRiskAssessmentActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamRiskAssessmentActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Team break.\n\n" +
                                    "2) Coordination risk.\n\n" +
                                    "3) Improper division of tasks.\n\n" +
                                    "4) Intra-task deadlock risk.\n\n" +
                                    "5) Group member inactivity.\n\n" +
                                    "6) Decision-making risk.\n\n" +
                                    "7) Wariness risk.\n\n")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamRiskAssessmentActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                    }
                });
            }
    }