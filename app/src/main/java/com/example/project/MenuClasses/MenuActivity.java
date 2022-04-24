package com.example.project.MenuClasses;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.project.GameClasses.GameBackend.MyService;
import com.example.project.MenuClasses.MapActivity;

import com.example.project.R;

public class MenuActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        //начало проиргрывания
        startService(new Intent(this, MyService.class));


        MediaPlayer mmPlayer = MediaPlayer.create(MenuActivity.this, R.raw.mainsound);
        Button playButton= (Button) findViewById(R.id.playButton);
        Button stopButton = (Button) findViewById(R.id.stopButton);
        final TextView StartGame = (TextView)findViewById(R.id.start);
        final TextView GameSettings = (TextView)findViewById(R.id.settings);
        final TextView AboutGame = (TextView)findViewById(R.id.about);
        //final TextView QuickGame = (TextView)findViewById(R.id.quick);
        final TextView ExitGame = (TextView)findViewById(R.id.exit);
        
        StartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mmPlayer.start();
                startActivity(new Intent(MenuActivity.this, MapActivity.class));
                MenuActivity.this.finish();
                //конец проигрывания при переходе на новую активность
                stopService(new Intent(MenuActivity.this, MyService.class));
            }
        });
        GameSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mmPlayer.start();
                startActivity(new Intent(MenuActivity.this, SettingActivity.class));
                MenuActivity.this.finish();
                //конец проигрывания при переходе на новую активность
                stopService(new Intent(MenuActivity.this, MyService.class));
            }
        });


        AboutGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmPlayer.start();
                startActivity(new Intent(MenuActivity.this, HelpActivity.class));
                MenuActivity.this.finish();
            }
        });




        //реализация кнопок звука
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mmPlayer.start();
                startService(new Intent(MenuActivity.this,MyService.class));
            }
        });
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mmPlayer.start();
                stopService(new Intent(MenuActivity.this, MyService.class));
            }
        });



    }

    //конец проигрывания при выходе из приложения
    public void onBackPressed() {
        stopService(new Intent(this, MyService.class));
    }






    }
