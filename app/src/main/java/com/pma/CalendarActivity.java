package com.pma;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
    }
    /** Called when the user taps the Floating Action Button */
    public void add_events_screen(View view) {
        Intent intent = new Intent(this, AddEventsActivity.class);
        startActivity(intent);
    }
}