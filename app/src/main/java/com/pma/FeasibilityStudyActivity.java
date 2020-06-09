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
                        Log.i("EditText Value = ", editq1ans.getText().toString());
                        Log.i("EditText Value = ", editq2ans.getText().toString());
                        Log.i("EditText Value = ", editq3ans.getText().toString());

                        // setup the alert builder
                        AlertDialog.Builder builder = new AlertDialog.Builder(FeasibilityStudyActivity.this);
                        builder.setTitle("Result");

                        if (Float.parseFloat(editq1ans.getText().toString()) >= (15000) && Float.parseFloat(editq2ans.getText().toString()) >= (30) && Float.parseFloat(editq3ans.getText().toString()) >= (30))
                        {
                            // create and show the alert dialog
                            AlertDialog dialog = builder.create();
                            dialog.show();
                        }
                    }
                });
    }
}

