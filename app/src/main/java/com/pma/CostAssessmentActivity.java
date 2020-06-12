package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class CostAssessmentActivity extends AppCompatActivity {

    Button button;
    EditText editq2ans;
    RadioGroup group1;
    RadioGroup group2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost_assessment);

        button = (Button)findViewById(R.id.Save);
        editq2ans = (EditText) findViewById(R.id.q2ans);
        group1 = (RadioGroup) findViewById(R.id.radio_group_1);
        group2 = (RadioGroup) findViewById(R.id.radio_group_2);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        boolean a, b;
                        int people = -1;

                        try{
                            people = Integer.parseInt(editq2ans.getText().toString());
                        }catch(NumberFormatException e) {
                            e.printStackTrace();
                        }

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
                                AlertDialog.Builder builder = new AlertDialog.Builder(CostAssessmentActivity.this);
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
                                AlertDialog.Builder builder = new AlertDialog.Builder(CostAssessmentActivity.this);
                                builder.setTitle("Result:");
                                builder.setMessage("Please fill in all the fields.");

                                // create and show the alert dialog
                                AlertDialog dialog = builder.create();
                                dialog.show();
                                return;
                            }
                        }

                        if (a && !b && editq2ans.getText().toString().equals(""))
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CostAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("To estimate the cost, consider only the cost of the equipment that you will need, the man-hours of the team members and any surprises.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (a && b && editq2ans.getText().toString().equals(""))
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CostAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("To estimate the cost, consider the cost of the equipment that you will need, the man-hours of the team members and any surprises.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (editq2ans.getText().toString().equals("") && !b || editq2ans.getText().toString().equals("") && b)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CostAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("Please fill in all the fields.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (a && !b && !editq2ans.getText().toString().equals(""))
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CostAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("Question 2 should not be answered according to the choice you have made in question 1, so to estimate the cost you must remove this answer.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (a && b && !editq2ans.getText().toString().equals(""))
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CostAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("Question 2 should not be answered according to the choice you have made in question 1, so to estimate the cost you must remove this answer.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq2ans.getText().toString()) <= 10 && b)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CostAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("To estimate the cost, consider the man-hours of the team members, the man-hours of the specialized staff and any surprises.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq2ans.getText().toString()) <= 10 && !a && !b)
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CostAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("To estimate the cost, consider the man-hours of the team members, the man-hours of the specialized staff, the cost of the equipment that you will need" +
                                            "and any surprises.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(CostAssessmentActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("Are you sure you need so many staff to develop the project? Think about how you can manage your existing staff properly, without the need for more.\n\n");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                    }
                });
        }
    }