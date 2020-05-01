package android.example.americanfootballcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**initial global variables for teamA and teamB scores**/
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**displays the score for TeamA**/
    public void displayScoreTeamA(int scoreTeamA) {
        TextView displayTeamAScore = findViewById(R.id.score_Display_TeamA);
        displayTeamAScore.setText(String.valueOf(scoreTeamA));
    }

    /**adds six points to teamA score**/
    public void touchdownTeamA(View view) {
        scoreTeamA += 6;

        displayScoreTeamA(scoreTeamA);
    }

    /**adds one point to teamA score**/
    public void extraPointTeamA(View view) {
        scoreTeamA += 1;

        displayScoreTeamA(scoreTeamA);
    }

    /**adds two points to teamA score**/
    public void twoPointConvTeamA(View view) {
        scoreTeamA += 2;

        displayScoreTeamA(scoreTeamA);
    }

    /**adds three points to teamA score**/
    public void fieldGoalTeamA(View view) {
        scoreTeamA += 3;

        displayScoreTeamA(scoreTeamA);
    }

    /**adds two points to teamA score**/
    public void safetyTeamA(View view) {
        scoreTeamA += 2;

        displayScoreTeamA(scoreTeamA);
    }

    /**Resets both teamA and TeamB score to zero(0)**/
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);

    }

    /**displays teamB score**/
    public void displayScoreTeamB(int scoreTeamB) {

        TextView displayTeamBScore = findViewById(R.id.score_Display_TeamB);
        displayTeamBScore.setText(String.valueOf(scoreTeamB));

    }

    /**adds six points to teamB score**/
    public void touchdownTeamB(View view) {
        scoreTeamB += 6;

        displayScoreTeamB(scoreTeamB);
    }

    /**adds one point to teamB score**/
    public void extraPointTeamB(View view) {
        scoreTeamB += 1;

        displayScoreTeamB(scoreTeamB);
    }

    /**adds two points to teamB score**/
    public void twoPointConvTeamB(View view) {
        scoreTeamB += 2;

        displayScoreTeamB(scoreTeamB);
    }

    /**adds three points to teamB score**/
    public void fieldGoalTeamB(View view) {
        scoreTeamB += 3;

        displayScoreTeamB(scoreTeamB);
    }

    /**adds two points to teamB score**/
    public void safetyTeamB(View view) {
        scoreTeamB += 2;

        displayScoreTeamB(scoreTeamB);
    }



}
