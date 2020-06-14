package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.pma.MyProjectsActivity.projects;
import static com.pma.MyProjectsActivity.storeProjects;

public class Add_a_project extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_a_project);
    }

    public void saveProject(View view){
        final EditText etName = findViewById(R.id.project_name);
        final EditText etDescription = findViewById(R.id.project_description);

        String name = etName.getText().toString();
        String desc = etDescription.getText().toString();

        if(desc.equals("")){
            // setup the alert builder
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Result:");
            builder.setMessage("Please fill in the description.");

            // create and show the alert dialog
            AlertDialog dialog = builder.create();
            dialog.show();
            return;
        }

        Project newProject = new Project(name, desc);
        projects.add(newProject);
        storeProjects(projects, this);
    }
}