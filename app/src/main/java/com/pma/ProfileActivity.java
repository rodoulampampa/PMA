package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    /** Called when the user taps the "Project(Project Name)" in the "Profile" ImageButton*/
    public void project_screen(View view) {
        Intent intent = new Intent(this, ProjectActivity.class);
        startActivity(intent);
    }
}
