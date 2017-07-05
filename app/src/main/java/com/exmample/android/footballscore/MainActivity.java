package com.exmample.android.footballscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int teamAScore;
    private int teamBScore;
    private TextView teamAScoreTV;
    private TextView teamBScoreTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScoreTV = (TextView) findViewById(R.id.team_a_score_tv);
        teamBScoreTV = (TextView) findViewById(R.id.team_b_score_tv);
    }

    public void addOneForTeamA(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    public void addTwoForTeamA(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void addThreeForTeamA(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void addSixForTeamA(View view) {
        teamAScore += 6;
        displayForTeamA(teamAScore);
    }


    public void addOneForTeamB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void addTwoForTeamB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void addThreeForTeamB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void addSixForTeamB(View view) {
        teamBScore += 6;
        displayForTeamB(teamBScore);
    }


    private void displayForTeamA(int score) {
        teamAScoreTV.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score) {
        teamBScoreTV.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
