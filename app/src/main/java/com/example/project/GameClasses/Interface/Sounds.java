package com.example.project.GameClasses.Interface;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
public class Sounds extends Service {
    private static final String TAG = "Sounds";
    MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {




    }
    public void playIntro(){

    }
    @Override
    public void onDestroy() {

        player.stop();
    }

    @Override
    public void onStart(Intent intent, int startid) {

        player.start();
    }
}
