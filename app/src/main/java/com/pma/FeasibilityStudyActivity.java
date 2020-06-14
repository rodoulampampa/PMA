package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FeasibilityStudyActivity extends AppCompatActivity {

    Button button;
    EditText editq1ans;
    EditText editq2ans;
    EditText editq3ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feasibility_study);

        button = (Button)findViewById(R.id.Save);
        editq1ans = (EditText)findViewById(R.id.q1ans);
        editq2ans = (EditText)findViewById(R.id.q2ans);
        editq3ans = (EditText)findViewById(R.id.q3ans);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        if (editq1ans.getText().toString().equals("") || editq2ans.getText().toString().equals("") || editq3ans.getText().toString().equals(""))
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(FeasibilityStudyActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("Please fill in all the fields.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) < (15000) && Float.parseFloat(editq2ans.getText().toString()) <= (10) && Float.parseFloat(editq3ans.getText().toString()) <= (10))
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(FeasibilityStudyActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("Your project is definitely feasible.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) < (15000) || Float.parseFloat(editq2ans.getText().toString()) <= (15) || Float.parseFloat(editq3ans.getText().toString()) <= (15))
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(FeasibilityStudyActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("Your project is feasible.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                        else if (Float.parseFloat(editq1ans.getText().toString()) >= (15000) || Float.parseFloat(editq2ans.getText().toString()) >= (30) || Float.parseFloat(editq3ans.getText().toString()) >= (30))
                        {
                            // setup the alert builder
                            AlertDialog.Builder builder = new AlertDialog.Builder(FeasibilityStudyActivity.this);
                            builder.setTitle("Result:");
                            builder.setMessage("Your project isn't feasible.");

                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                    }
                });
    }
}

