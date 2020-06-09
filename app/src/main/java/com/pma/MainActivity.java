package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the "Suggest me a project" button */
    public void prop_projects_screen(View view) {
        Intent intent = new Intent(this, ProposedProjectsActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Suggest a name for my project" button */
    public void proj_name_screen(View view) {
        Intent intent = new Intent(this, ProjectNameActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Profile" ImageButton*/
    public void profile_screen(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Calendar" ImageButton*/
    public void calendar_screen(View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Search" ImageButton*/
    public void search_screen(View view) {
        Intent intent = new Intent(this, SearchableActivity.class);
        startActivity(intent);
    }
}