/* This activity is the main activity in the program and is the jumping off point into other aspects of the app.
*   The code below creates the links between the title screen, level select screen, and high score screen.
 */

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

        // Line 24 connects the button variable declared above with the levelSelect button on screen
        levelSelect = findViewById(R.id.levelSelect);
        // Line 26 makes a call to the openLevelSelectActivity() method when the user presses the levelSelect button
        levelSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLevelSelectActivity();
            }
        });

        // Lines 34 and 35 accomplish the same as 24 and 26 above.
        highScore = findViewById(R.id.highScore);
        highScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHighScoreActivity();
            }
        });
    }

    // The following two methods open the screens referenced in their names
    private void openLevelSelectActivity() {
        Intent intent = new Intent(this, LevelSelectActivity.class);
        startActivity(intent);
    }

    private void openHighScoreActivity() {
        Intent intent = new Intent(this, HighScoreActivity.class);
        startActivity(intent);
    }
}