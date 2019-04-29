package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds 3 points for Team A.
     */
    public void addThreeForTeamA(View view) {
        displayForTeamA(3);
    }

    /**
     * Adds 2 points for Team A.
     */
    public void addTwoForTeamA(View view) {
        displayForTeamA(2);
    }

    /**
     * Adds 1 point for Team A.
     */
    public void addOneForTeamA(View view) {
        displayForTeamA(1);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}

