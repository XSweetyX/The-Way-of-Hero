package com.example.project.MenuClasses;

import static com.example.project.GameClasses.Interface.Global.global;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project.GameClasses.Interface.ResultActivity;
import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.R;

public class LoseActivity extends BaseActivity{

    Button continuelbut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lose);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        MediaPlayer mmPlayer = MediaPlayer.create(LoseActivity.this, R.raw.mainsound);
        continuelbut = findViewById(R.id.continue_lose_but);

        continuelbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoseActivity.this, MapActivity.class));
                mmPlayer.start();
                global.flag=true;
                LoseActivity.this.finish();
            }
        });
    }

}
