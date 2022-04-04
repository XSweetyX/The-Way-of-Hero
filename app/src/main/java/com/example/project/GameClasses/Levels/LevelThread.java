package com.example.project.GameClasses.Levels;

import static com.example.project.GameClasses.Entities.Enemies.Enemy.eBitmap;
import static com.example.project.GameClasses.Entities.Enemies.Slime.slimeBitmap;
import static com.example.project.GameClasses.Entities.Enemies.Zombie.zombieBitmap;
import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Levels.LevelView.player;
import static com.example.project.GameClasses.Levels.LevelView.slime;
import static com.example.project.GameClasses.Levels.LevelView.zombie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;

import com.example.project.GameClasses.Entities.Enemies.Enemy;
import com.example.project.GameClasses.Entities.Enemies.Slime;
import com.example.project.MenuClasses.MapActivity;
import com.example.project.MenuClasses.Organizer;
import com.example.project.R;

public class LevelThread extends Thread{


    private SurfaceHolder surfaceHolder;
    public static Canvas canvas;

    private  volatile boolean running = true;//флаг для остановки потока

    private Bitmap playerbitmap;

    private Bitmap resizedBitmap;

    private Bitmap backgroundBitmap;

    public static Paint backgroundPaint = new Paint();

    private int towardPointX;

    private int towardPointY;

    private MapActivity mapActivity = new MapActivity();

    public LevelView levelView;

    private Organizer organizer = new Organizer();





    public LevelThread(Context context, SurfaceHolder surfaceHolder, LevelView levelView) {

        this.levelView = levelView;

        backgroundBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.level11bg);
        resizedBitmap=Bitmap.createScaledBitmap(backgroundBitmap, 2500, 2000, true);

        playerbitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.playernew);





        this.surfaceHolder = surfaceHolder;
    }

    public void setTowardPoint(int x, int y) {
        towardPointX = x;
        towardPointY = y;
    }

    public void requestStop() {
        running = false;
    }


    @Override
    public void run() {



        while (running) {




            try {
                // рисование на canvas
                canvas = this.surfaceHolder.lockCanvas();
                synchronized (canvas)  {
                    this.levelView.update();
                }
                canvas.drawBitmap(resizedBitmap,0,0,backgroundPaint);
                switch (global.organizer.getCurrentlevel()){
                    case 1:
                        canvas.drawBitmap(slimeBitmap,slime.getEX(),slime.getEY(),backgroundPaint);

                        break;
                    case 2:
                        canvas.drawBitmap(zombieBitmap,zombie.getEX(),zombie.getEY(),backgroundPaint);

                        break;
                }
                canvas.drawBitmap(playerbitmap,player.getPlayerX(),player.getPlayerY(),backgroundPaint);
            }finally {

                    surfaceHolder.unlockCanvasAndPost(canvas);

            }

        }
    }

    public void setRunning(boolean b){
        running = b;
    }

}
