package com.pma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SearchableActivity extends AppCompatActivity {

    SearchView mySearchView;
    ListView  myList;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mySearchView = (SearchView) findViewById(R.id.Search);
        myList = (ListView) findViewById(R.id.mylist);

        list = new ArrayList<String>();

        list.add("Team Management Tool");
        list.add("Design Tool");
        list.add("Communication Platform");
        list.add("Cost Assessment");
        list.add("Risk Assessment");
        list.add("Team Risk Assessment");
        list.add("Feasibility Study");
        list.add("Feedback");
        list.add("Team Building Games");
        list.add("Suggest a project");
        list.add("Suggest a name for my project");
        list.add("Profile");
        list.add("Calendar");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        myList.setAdapter(adapter);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (((TextView) view).getText() == "Team Management Tool")
                {
                    Intent intent = new Intent(view.getContext(), TeamManagementToolActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Design Tool")
                {
                    Intent intent = new Intent(view.getContext(), DesignToolActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Communication Platform")
                {
                    Intent intent = new Intent(view.getContext(), CommPlatformActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Cost Assessment")
                {
                    Intent intent = new Intent(view.getContext(), CostAssessmentActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Risk Assessment")
                {
                    Intent intent = new Intent(view.getContext(), RiskAssessmentActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Team Risk Assessment")
                {
                    Intent intent = new Intent(view.getContext(), TeamRiskAssessmentActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Feasibility Study")
                {
                    Intent intent = new Intent(view.getContext(), FeasibilityStudyActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Feedback")
                {
                    Intent intent = new Intent(view.getContext(), FeedbackActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Team Building Games")
                {
                    Intent intent = new Intent(view.getContext(), TeamBuildingGameActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Suggest a project")
                {
                    Intent intent = new Intent(view.getContext(), ProposedProjectsActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Suggest a name for my project")
                {
                    Intent intent = new Intent(view.getContext(), ProjectNameActivity.class);
                    startActivity(intent);
                }
                else if (((TextView) view).getText() == "Profile")
                {
                    Intent intent = new Intent(view.getContext(), ProfileActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(view.getContext(), CalendarActivity.class);
                    startActivity(intent);
                }
            }
        });

        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
