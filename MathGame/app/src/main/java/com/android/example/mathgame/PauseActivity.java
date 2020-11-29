package com.android.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PauseActivity extends AppCompatActivity {
    private Button returnToScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pause);

        returnToScore = (Button) findViewById(R.id.button7);
        returnToScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScoreActivity();
            }
        });
    }

    public void openScoreActivity() {
        Intent intent = new Intent(this, ScoreActivity.class);
        startActivity(intent);
    }
} // button7