package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;

import java.util.Calendar;

public class AddEventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_events);
        add_an_event();
    }

    public void add_an_event() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 27);
        calendar.set(Calendar.MONTH, 4);
        calendar.set(Calendar.YEAR, 2020);

        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra(CalendarContract.Events.TITLE, "");
        intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, calendar.getTime().getTime());
        intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,calendar.getTime().getTime());
        intent.putExtra(CalendarContract.Events.ALL_DAY, false);
        intent.putExtra(CalendarContract.Events.DESCRIPTION,"");
        startActivity(intent);
    }
}