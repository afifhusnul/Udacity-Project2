package com.example.android.scorekeeper;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Track score for Team A
    private int scoreTeamA = 0;
    private int offSideA = 0;
    private int freeKickA = 0;
    private int cornerKickA = 0;
    private int foulsA = 0;

    //Track score for Team B
    private int scoreTeamB = 0;
    private int offSideB = 0;
    private int freeKickB = 0;
    private int cornerKickB = 0;
    private int foulsB = 0;

    // Score text color
    TextView TxtChangeA;
    TextView TxtChangeB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Change Text Score color
        TxtChangeA = (TextView) findViewById(R.id.team_a_score);
        TxtChangeB = (TextView) findViewById(R.id.team_b_score);
    }

    /**
     * Displays the given score for Team A.
     */
    // Score - Goal
    public void scoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void submitAScore(View view) {
        scoreTeamA = scoreTeamA + 1;
        scoreForTeamA(scoreTeamA);
        changeColorScore();
    }

    // Offside
    public void offsideForTeamA(int offside) {
        TextView offsideView = (TextView) findViewById(R.id.team_a_offside_view);
        offsideView.setText(String.valueOf(offside));
    }

    public void submitAOffside(View view) {
        offSideA = offSideA + 1;
        offsideForTeamA(offSideA);
    }

    // Free Kick
    public void freekickForTeamA(int freekick) {
        TextView freekickView = (TextView) findViewById(R.id.team_a_freekick_view);
        freekickView.setText(String.valueOf(freekick));
    }

    public void submitAFreeKick(View view) {
        freeKickA = freeKickA + 1;
        freekickForTeamA(freeKickA);
    }

    // Corner Kick
    public void cornerForTeamA(int cornerkick) {
        TextView cornerkickView = (TextView) findViewById(R.id.team_a_cornerkick_view);
        cornerkickView.setText(String.valueOf(cornerkick));
    }

    public void submitACornerKick(View view) {
        cornerKickA = cornerKickA + 1;
        cornerForTeamA(cornerKickA);
    }

    // Fouls
    public void foulsForTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls_view);
        foulsView.setText(String.valueOf(fouls));
    }

    public void submitAFouls(View view) {
        foulsA = foulsA + 1;
        foulsForTeamA(foulsA);
    }

    /**
     * Displays the given score for Team B.
     */
    // Score - Goal
    public void scoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void submitBScore(View view) {
        scoreTeamB = scoreTeamB + 1;
        scoreForTeamB(scoreTeamB);
        changeColorScore();
    }

    // Offside
    public void offsideForTeamB(int offside) {
        TextView offsideView = (TextView) findViewById(R.id.team_b_offside_view);
        offsideView.setText(String.valueOf(offside));
    }

    public void submitBOffside(View view) {
        offSideB = offSideB + 1;
        offsideForTeamB(offSideB);
    }

    // Free Kick
    public void freekickForTeamB(int freekick) {
        TextView freekickView = (TextView) findViewById(R.id.team_b_freekick_view);
        freekickView.setText(String.valueOf(freekick));
    }

    public void submitBFreeKick(View view) {
        freeKickB = freeKickB + 1;
        freekickForTeamB(freeKickB);
    }

    // Corner Kick
    public void cornerForTeamB(int cornerkick) {
        TextView cornerkickView = (TextView) findViewById(R.id.team_b_cornerkick_view);
        cornerkickView.setText(String.valueOf(cornerkick));
    }

    public void submitBCornerKick(View view) {
        cornerKickB = cornerKickB + 1;
        cornerForTeamB(cornerKickB);
    }

    // Fouls
    public void foulsForTeamB(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls_view);
        foulsView.setText(String.valueOf(fouls));
    }

    public void submitBFouls(View view) {
        foulsB = foulsB + 1;
        foulsForTeamB(foulsB);
    }

    /**
     * Reset text color
     */
    public void changeColorScore() {
        if (scoreTeamA > scoreTeamB) {
            TxtChangeA.setTextColor(Color.GREEN);
            TxtChangeB.setTextColor(Color.RED);
        } else if (scoreTeamA < scoreTeamB) {
            TxtChangeB.setTextColor(Color.GREEN);
            TxtChangeA.setTextColor(Color.RED);
        } else {
            TxtChangeA.setTextColor(Color.BLACK);
            TxtChangeB.setTextColor(Color.BLACK);
        }
    }

    /**
     * Reset button
     */
    public void submitReset(View view) {
        // Reset numbers for Team A
        scoreTeamA = 0;
        offSideA = 0;
        freeKickA = 0;
        cornerKickA = 0;
        foulsA = 0;

        scoreForTeamA(scoreTeamA);
        offsideForTeamA(offSideA);
        freekickForTeamA(freeKickA);
        cornerForTeamA(cornerKickA);
        foulsForTeamA(foulsA);
        TxtChangeA.setTextColor(Color.BLACK);

        // Reset numbers for Team B
        scoreTeamB = 0;
        offSideB = 0;
        freeKickB = 0;
        cornerKickB = 0;
        foulsB = 0;

        scoreForTeamB(scoreTeamB);
        offsideForTeamB(offSideB);
        freekickForTeamB(freeKickB);
        cornerForTeamB(cornerKickB);
        foulsForTeamB(foulsB);
        TxtChangeB.setTextColor(Color.BLACK);
    }
}
