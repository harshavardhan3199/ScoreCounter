package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView teamAScore,teamBScore;
    int scoreA=0,scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

    }
    public void buttonA1(View view)
    {
        scoreA+=3;
        displayAScore( scoreA );
    }
    public void buttonA2(View view)
    {
        scoreA += 2;
        displayAScore( scoreA );
    }
    public void buttonA3(View view)
    {
        scoreA+=1;
        displayAScore( scoreA );
    }


    public void displayAScore(int score)
    {
        teamAScore=(TextView)findViewById( R.id.teamAScore );
        teamAScore.setText(  String.valueOf( score ));
    }
    public void buttonB1(View view)
    {
        scoreB+=3;
        displayBScore( scoreB );
    }
    public void buttonB2(View view)
    {
        scoreB += 2;
        displayBScore( scoreB );
    }
    public void buttonB3(View view)
    {
        scoreB+=1;
        displayBScore( scoreB );
    }


    public void displayBScore(int score)
    {
        teamBScore=(TextView)findViewById( R.id.teamBScore );
        teamBScore.setText(  String.valueOf( score ));
    }
    public void resetScore(View view)
    {
        scoreA=0;
        scoreB=0;
        displayAScore( scoreA );
        displayBScore( scoreB );
    }


}
