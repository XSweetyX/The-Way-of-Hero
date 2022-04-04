package com.example.project.GameClasses.Levels;

import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Levels.LevelThread.canvas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.example.project.GameClasses.Entities.Enemies.Enemy;
import com.example.project.GameClasses.Entities.Enemies.Slime;
import com.example.project.GameClasses.Entities.Enemies.Zombie;
import com.example.project.GameClasses.Entities.Player;
import com.example.project.MenuClasses.MapActivity;
import com.example.project.MenuClasses.Organizer;

public class LevelView extends SurfaceView implements SurfaceHolder.Callback {
    public static LevelThread objectLevelThread;
    public static Player player;
    private Enemy enemy = new Enemy();
    private MapActivity mapActivity = new MapActivity();
    public static Slime slime;
    public static Zombie zombie;




    public LevelView(Context context, AttributeSet attributeSet) {
        //обязателен конструктор с атрибутами

        super(context);
        getHolder().addCallback(this);
        zombie = new Zombie(getContext());
        slime =new Slime(getContext());
        player = new Player();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        // создание SurfaceView

        objectLevelThread = new LevelThread(getContext(),getHolder(),this);
        objectLevelThread.start();
    }







    public void update()  {
        switch (global.organizer.getCurrentlevel()){
            case 1:this.slime.Supdate(canvas,getContext());
            break;
            case 2:this.zombie.Zupdate(canvas,getContext());
                break;
        }
    }



    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        // изменение размеров SurfaceView
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        // уничтожение SurfaceView
        objectLevelThread.requestStop();
        boolean retry = true;
        while (retry) {
            try {
                objectLevelThread.join();
                retry = false;
            } catch (InterruptedException e) {
                //
            }
        }
    }

}

