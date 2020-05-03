package com.example.android.footballscores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Team A
    // Button add goal to team A
    public void addGoalToTeamA(View view) {
        goalsTeamA += 1;
        displayGoalTeamA(goalsTeamA);
    }

    // Button add foul to team A
    public void addfoulToTeamA(View view) {
        foulsTeamA += 1;
        displayFoulTeamA(foulsTeamA);
    }

    // display goal for team A
    public void displayGoalTeamA(int goal) {
        ((TextView) findViewById(R.id.teamA_score)).setText(String.valueOf(goal));
    }

    // display foul for team A
    public void displayFoulTeamA(int foul) {
        ((TextView) findViewById(R.id.teamA_foul)).setText(String.valueOf(foul));
    }

    // Team B
    // Button add goal to team B
    public void addGoalToTeamB(View view) {
        goalsTeamB += 1;
        displayGoalTeamB(goalsTeamB);
    }

    // Button add foul to team B
    public void addfoulToTeamB(View view) {
        foulsTeamB += 1;
        displayFoulTeamB(foulsTeamB);
    }

    // display goal for team B
    public void displayGoalTeamB(int goal) {
        ((TextView) findViewById(R.id.teamB_score)).setText(String.valueOf(goal));
    }

    // display foul for team B
    public void displayFoulTeamB(int foul) {
        ((TextView) findViewById(R.id.teamB_foul)).setText(String.valueOf(foul));
    }

    public void reset(View view) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayGoalTeamA(goalsTeamA);
        displayFoulTeamA(foulsTeamA);
        displayGoalTeamB(goalsTeamB);
        displayFoulTeamB(foulsTeamB);
    }


}
