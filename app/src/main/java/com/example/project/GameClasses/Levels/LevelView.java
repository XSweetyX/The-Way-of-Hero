package com.example.project.GameClasses.Levels;

import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Levels.LevelThread.canvas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.example.project.GameClasses.Entities.Enemies.CursedDummy;
import com.example.project.GameClasses.Entities.Enemies.Demon;
import com.example.project.GameClasses.Entities.Enemies.Dragon;
import com.example.project.GameClasses.Entities.Enemies.Enemy;
import com.example.project.GameClasses.Entities.Enemies.Ghost;
import com.example.project.GameClasses.Entities.Enemies.Ghoul;
import com.example.project.GameClasses.Entities.Enemies.MegaDog;
import com.example.project.GameClasses.Entities.Enemies.Slime;
import com.example.project.GameClasses.Entities.Enemies.StrangeCat;
import com.example.project.GameClasses.Entities.Enemies.Zombie;
import com.example.project.GameClasses.Entities.Enemies.СursedMage;
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
    public static StrangeCat strangeCat;
    public static MegaDog megaDog;
    public static Dragon dragon;
    public static CursedDummy dummy;
    public static СursedMage сursedMage;
    public static Ghost ghost;
    public static Ghoul ghoul;
    public static Demon demon;




    public LevelView(Context context, AttributeSet attributeSet) {
        //обязателен конструктор с атрибутами

        super(context);
        getHolder().addCallback(this);
        megaDog =new MegaDog(getContext());
        strangeCat = new StrangeCat(getContext());
        zombie = new Zombie(getContext());
        slime =new Slime(getContext());
        player = new Player();
        dragon =new Dragon(getContext());
        dummy =new CursedDummy(getContext());
        сursedMage =new СursedMage(getContext());
        ghost =new Ghost(getContext());
        ghoul =new Ghoul(getContext());
        demon =new Demon(getContext());
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
            case 3:this.dummy.CDupdate(canvas,getContext());
                break;
            case 4:this.strangeCat.SCupdate(canvas,getContext());
                break;
            case 5:this.megaDog.MDupdate(canvas,getContext());
                break;
            case 6:this.ghost.GhostUpdate(canvas,getContext());
                break;
            case 7:this.ghoul.Gupdate(canvas,getContext());
                break;
            case 8:this.сursedMage.CMupdate(canvas,getContext());
                break;
            case 9:this.dragon.DragonUpdate(canvas,getContext());
                break;
            case 10:this.demon.Dupdate(canvas,getContext());
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

