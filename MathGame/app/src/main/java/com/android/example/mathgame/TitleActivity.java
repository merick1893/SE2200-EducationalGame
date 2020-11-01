package com.android.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitleActivity extends AppCompatActivity {
    private Button levelSelect;
    private Button highScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        levelSelect = findViewById(R.id.levelSelect);
        levelSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLevelSelectActivity();
            }
        });

        highScore = findViewById(R.id.highScore);
        highScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHighScoreActivity();
            }
        });
    }

    private void openLevelSelectActivity() {
        Intent intent = new Intent(this, LevelSelectActivity.class);
        startActivity(intent);
    }

    private void openHighScoreActivity() {
        Intent intent = new Intent(this, HighScoreActivity.class);
        startActivity(intent);
    }
}