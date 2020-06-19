package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class TeamManagementToolActivity extends AppCompatActivity {

    Button button;
    EditText editq1ans;
    RadioGroup group1;
    RadioGroup group2;
    RadioGroup group3;
    RadioGroup group4;
    RadioGroup group5;
    RadioGroup group6;
    RadioGroup group7;
    RadioGroup group8;
    RadioGroup group9;
    RadioGroup group10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_management_tool);

        button = (Button)findViewById(R.id.Save);
        editq1ans = (EditText) findViewById(R.id.q1ans);
        group1 = (RadioGroup) findViewById(R.id.radio_group_1);
        group2 = (RadioGroup) findViewById(R.id.radio_group_2);
        group3 = (RadioGroup) findViewById(R.id.radio_group_3);
        group4 = (RadioGroup) findViewById(R.id.radio_group_4);
        group5 = (RadioGroup) findViewById(R.id.radio_group_5);
        group6 = (RadioGroup) findViewById(R.id.radio_group_6);
        group7 = (RadioGroup) findViewById(R.id.radio_group_7);
        group8 = (RadioGroup) findViewById(R.id.radio_group_8);
        group9 = (RadioGroup) findViewById(R.id.radio_group_9);
        group10 = (RadioGroup) findViewById(R.id.radio_group_10);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view) {
                        boolean q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
                        switch (group1.getCheckedRadioButtonId()) {
                            case R.id.q2_1: {
                                q1 = true;
                                break;
                            }

                            case R.id.q2_2: {
                                q1 = false;
                                break;
                            }

                            default: {
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                                builder.setMessage("Please fill in all the fields.")
                                        .setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                            }
                        }

                        switch (group2.getCheckedRadioButtonId()) {
                            case R.id.q3_1: {
                                q2 = true;
                                break;
                            }

                            case R.id.q3_2: {
                                q2 = false;
                                break;
                            }

                            default: {
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                                builder.setMessage("Please fill in all the fields.")
                                        .setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                            }
                        }

                        switch (group3.getCheckedRadioButtonId()) {
                            case R.id.q4_1: {
                                q3 = true;
                                break;
                            }

                            case R.id.q4_2: {
                                q3 = false;
                                break;
                            }

                            default:
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                                builder.setMessage("Please fill in all the fields.")
                                        .setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                        }
                        switch (group4.getCheckedRadioButtonId()) {
                            case R.id.q5_1: {
                                q4 = true;
                                break;
                            }

                            case R.id.q5_2: {
                                q4 = false;
                                break;
                            }

                            default:
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                                builder.setMessage("Please fill in all the fields.")
                                        .setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                        }
                        switch (group5.getCheckedRadioButtonId()) {
                            case R.id.q6_1: {
                                q5 = true;
                                break;
                            }

                            case R.id.q6_2: {
                                q5 = false;
                                break;
                            }

                            default:
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                                builder.setMessage("Please fill in all the fields.")
                                        .setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                        }
                        switch (group6.getCheckedRadioButtonId()) {
                            case R.id.q7_1: {
                                q6 = true;
                                break;
                            }

                            case R.id.q7_2: {
                                q6 = false;
                                break;
                            }

                            default:
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                                builder.setMessage("Please fill in all the fields.")
                                        .setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                        }
                        switch (group7.getCheckedRadioButtonId()) {
                            case R.id.q8_1: {
                                q7 = true;
                                break;
                            }

                            case R.id.q8_2: {
                                q7 = false;
                                break;
                            }

                            default:
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                                builder.setMessage("Please fill in all the fields.")
                                        .setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                        }
                        switch (group8.getCheckedRadioButtonId()) {
                            case R.id.q9_1: {
                                q8 = true;
                                break;
                            }

                            case R.id.q9_2: {
                                q8 = false;
                                break;
                            }

                            default:
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                                builder.setMessage("Please fill in all the fields.")
                                        .setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                        }
                        switch (group9.getCheckedRadioButtonId()) {
                            case R.id.q10_1: {
                                q9 = true;
                                break;
                            }

                            case R.id.q10_2: {
                                q9 = false;
                                break;
                            }

                            default:
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                                builder.setMessage("Please fill in all the fields.")
                                        .setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                        }
                        switch (group10.getCheckedRadioButtonId()) {
                            case R.id.q11_1: {
                                q10 = true;
                                break;
                            }

                            case R.id.q11_2: {
                                q10 = false;
                                break;
                            }

                            default:
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                                builder.setMessage("Please fill in all the fields.")
                                        .setCancelable(false)
                                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                                startActivity(intent);
                                            }
                                        });

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                        }

                        if (editq1ans.getText().toString().equals("")) {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                            builder.setMessage("Please fill in all the fields.")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) >= 11) {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("You have many team members in your team.\n\n" +
                                    " I would suggest that you consider the possibility of splitting into two subgroups that communicate with each " +
                                    "other when required.")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) >= 3 && Float.parseFloat(editq1ans.getText().toString()) < 11 && q1 && q2 && !q3 && q4 && q7 && q8 && !q9) {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Airtable \n\n" +
                                    " 2) JetBrains YouTRack \n\n")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) >= 3 && Float.parseFloat(editq1ans.getText().toString()) < 11 && q1 && q2 && !q3 && !q4 && q5 && !q6 && q7 && !q8 && q9) {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Trello \n\n" +
                                    " 2) TeamWork \n\n")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) >= 3 && Float.parseFloat(editq1ans.getText().toString()) < 11 && q1 && q2 && q3 && !q4 && !q5 && q6 && q7 && q8 && !q9) {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Asana \n\n" +
                                    " 2) JIRA \n\n" +
                                    " 3) GSuite \n\n")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) >= 3 && Float.parseFloat(editq1ans.getText().toString()) < 11 && q1 && q2 && q7 && q8 && q9 && q10) {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Monday.com \n\n" +
                                    " 2) ClickUp \n\n" +
                                    " 3) Wrike \n\n")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
                                            startActivity(intent);
                                        }
                                    });

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(TeamManagementToolActivity.this);
                            builder.setMessage("Something went wrong. Please try again.")
                                    .setCancelable(false)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            Intent intent = new Intent(TeamManagementToolActivity.this, ProjectActivity.class);
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