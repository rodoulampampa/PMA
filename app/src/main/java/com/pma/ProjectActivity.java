package com.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
    }
    /** Called when the user taps the "Team Management Tool" Button*/
    public void team_man_tool_screen(View view) {
        Intent intent = new Intent(this, TeamManagementToolActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Design Tool" Button*/
    public void design_tool_screen(View view) {
        Intent intent = new Intent(this, DesignToolActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Feasibility Study" Button*/
    public void feasibility_study_screen(View view) {
        Intent intent = new Intent(this, FeasibilityStudyActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Communication Platform" Button*/
    public void commun_platform_screen(View view) {
        Intent intent = new Intent(this, CommPlatformActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Feedback" Button*/
    public void feedback_screen(View view) {
        Intent intent = new Intent(this, FeedbackActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Games" Button*/
    public void games_screen(View view) {
        Intent intent = new Intent(this, TeamBuildingGameActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Cost Assessment" Button*/
    public void cost_assessment_screen(View view) {
        Intent intent = new Intent(this, CostAssessmentActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Risk Assessment" Button*/
    public void risk_assessment_screen(View view) {
        Intent intent = new Intent(this, RiskAssessmentActivity.class);
        startActivity(intent);
    }
    /** Called when the user taps the "Team Risk Assessment" Button*/
    public void team_risk_assessment_screen(View view) {
        Intent intent = new Intent(this, TeamRiskAssessmentActivity.class);
        startActivity(intent);
    }
}
