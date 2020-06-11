package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class RiskAssessmentActivity extends AppCompatActivity {

    Button button;
    EditText editq1ans;
    RadioGroup group1;
    RadioGroup group2;
    RadioGroup group3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risk_assessment);

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
                                AlertDialog.Builder builder = new AlertDialog.Builder(RiskAssessmentActivity.this);
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
                                AlertDialog.Builder builder = new AlertDialog.Builder(RiskAssessmentActivity.this);
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
                                // setup the alert builder
                                AlertDialog.Builder builder = new AlertDialog.Builder(RiskAssessmentActivity.this);
                                builder.setTitle("Result:");
                                builder.setMessage("Please fill in all the fields.");

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                        }

                        if (editq1ans.getText().toString().equals("") )
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(RiskAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("Please fill in all the fields.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) > 8)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(RiskAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("You have many team members in your team.\n\n" +
                                    " I would suggest that you consider the possibility of splitting into two subgroups that communicate with each " +
                                    "other when required.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) <= 8 && !a && b)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(RiskAssessmentActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Project purpose and need is not well-defined.\n\n" +
                                    "2) Project design and deliverable definition is incomplete." +
                                    "3) Project schedule is not clearly defined or understood." +
                                    "4) No control over client priorities." +
                                    "5) Estimating and/or scheduling errors. " +
                                    "6) Pressure to arbitrarily reduce task durations and or run tasks in parallel which would increase risk of errors." +
                                    "7) Delay in earlier project phases jeopardizes ability to meet fixed date. " +
                                    "8) Added workload or time requirements because of new direction, policy, or statute." +
                                    "9) Inadequate customer testing." +
                                    "10) Legal action delays or pauses project. " +
                                    "11) Customer refuses to approve deliverables/milestones or delays approval, putting pressure on project manager to 'work at risk'." +
                                    "12) Theft of materials, intellectual property or equipment." +
                                    "13) Extreme weather leads to loss of resources, materials, premises etc.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) <= 8 && a && !b && c)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(RiskAssessmentActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Τeam break.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) <= 8 && a && !b && !c)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(RiskAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("1) Τeam break.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(RiskAssessmentActivity.this);
                            builder.setTitle("Results:");
                            builder.setMessage("1) Team break.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                    }
                });
        }
    }
