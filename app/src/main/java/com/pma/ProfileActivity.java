package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String name;

        // Sydnesh se bash dedomenwn kai orismos ths metablhths name
        // Estw name = xenos
        name = "xenos";

        TextView nameTextView = findViewById(R.id.name_text_view);
        nameTextView.setText(name);


    }

    /** Called when the user taps the "Project(Project Name)" in the "Profile" ImageButton*/
    public void project_screen(View view) {
        Intent intent = new Intent(this, ProjectActivity.class);
        startActivity(intent);
    }

    public void onProfileEdit(View view){
//        Intent intent = new Intent(this, ProfileEditActivity.class);
//        startActivity(intent);
    }
}
