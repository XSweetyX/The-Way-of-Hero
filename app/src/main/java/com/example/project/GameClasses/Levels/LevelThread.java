package com.example.project.GameClasses.Levels;

import static com.example.project.GameClasses.Entities.Enemies.CursedDummy.cDBitmap;
import static com.example.project.GameClasses.Entities.Enemies.Demon.demonBitmap;
import static com.example.project.GameClasses.Entities.Enemies.Dragon.dragonBitmap;
import static com.example.project.GameClasses.Entities.Enemies.Enemy.eBitmap;
import static com.example.project.GameClasses.Entities.Enemies.Ghost.ghostBitmap;
import static com.example.project.GameClasses.Entities.Enemies.Ghoul.ghoulBitmap;
import static com.example.project.GameClasses.Entities.Enemies.MegaDog.megaDogBitmap;
import static com.example.project.GameClasses.Entities.Enemies.Slime.slimeBitmap;
import static com.example.project.GameClasses.Entities.Enemies.StrangeCat.strangeCatBitamp;
import static com.example.project.GameClasses.Entities.Enemies.Zombie.zombieBitmap;
import static com.example.project.GameClasses.Entities.Enemies.СursedMage.cursedMageBitmap;
import static com.example.project.GameClasses.Interface.Global.BITMAPKEY;
import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Interface.ItemStorage.hm;
import static com.example.project.GameClasses.Levels.LevelView.demon;
import static com.example.project.GameClasses.Levels.LevelView.dragon;
import static com.example.project.GameClasses.Levels.LevelView.dummy;
import static com.example.project.GameClasses.Levels.LevelView.ghost;
import static com.example.project.GameClasses.Levels.LevelView.ghoul;
import static com.example.project.GameClasses.Levels.LevelView.megaDog;
import static com.example.project.GameClasses.Levels.LevelView.player;
import static com.example.project.GameClasses.Levels.LevelView.slime;
import static com.example.project.GameClasses.Levels.LevelView.strangeCat;
import static com.example.project.GameClasses.Levels.LevelView.zombie;
import static com.example.project.GameClasses.Levels.LevelView.сursedMage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;

import com.example.project.GameClasses.Entities.Enemies.Enemy;
import com.example.project.GameClasses.Entities.Enemies.Slime;
import com.example.project.GameClasses.GameBackend.MyService;
import com.example.project.MenuClasses.MapActivity;
import com.example.project.MenuClasses.Organizer;
import com.example.project.R;

public class LevelThread extends Thread{


    private SurfaceHolder surfaceHolder;
    public static Canvas canvas;

    private  volatile boolean running = true;//флаг для остановки потока

    public static Bitmap playerbitmap;

    private Bitmap resizedBitmap;

    private Bitmap backgroundBitmap;

    public static Paint backgroundPaint = new Paint();

    private int towardPointX;

    private int towardPointY;

    private MapActivity mapActivity = new MapActivity();

    public LevelView levelView;

    private Organizer organizer = new Organizer();

    public static Bitmap treestickBitmap ;
    public static Bitmap wizardbody1Bitmap;
    public static Bitmap panBitmap;
    public static Bitmap slimeswordBitmap;
    public static Bitmap obsidiansword1Bitmap;
    public static Bitmap ironarmorBitmap;
    public static Bitmap goldenarmorBitmap;
    public static Bitmap slimearmorBitmap;
    public static Bitmap crimsonscytheBitmap;








    public LevelThread(Context context, SurfaceHolder surfaceHolder, LevelView levelView) {

        this.levelView = levelView;

        //получаем статическую сслку на context.getResources для Bitmap предметов.


        backgroundBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.level11bg);
        resizedBitmap=Bitmap.createScaledBitmap(backgroundBitmap, 2500, 2000, true);

        playerbitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.playernew);

        // Items
        treestickBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.treestick);
        wizardbody1Bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.darkwizardsuit);
        panBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.pan);
        slimeswordBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.slimesword);
        obsidiansword1Bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.obsidiansword);
        crimsonscytheBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.crimsonscythe);
        ironarmorBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ironarmor);
        goldenarmorBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.goldenarmor);
        slimearmorBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.slimearmor);



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
                    case 3:
                        canvas.drawBitmap(cDBitmap,dummy.getEX(),dummy.getEY(),backgroundPaint);

                        break;
                    case 4:
                        canvas.drawBitmap(strangeCatBitamp,strangeCat.getEX(),strangeCat.getEY(),backgroundPaint);

                        break;
                    case 5:
                        canvas.drawBitmap(megaDogBitmap,megaDog.getEX(),megaDog.getEY(),backgroundPaint);

                        break;
                    case 6:
                        canvas.drawBitmap(ghostBitmap,ghost.getEX(),ghost.getEY(),backgroundPaint);

                        break;
                    case 7:
                        canvas.drawBitmap(ghoulBitmap,ghoul.getEX(),ghoul.getEY(),backgroundPaint);

                        break;
                    case 8:
                        canvas.drawBitmap(cursedMageBitmap,сursedMage.getEX(),сursedMage.getEY(),backgroundPaint);

                        break;
                    case 9:
                        canvas.drawBitmap(dragonBitmap,dragon.getEX(),dragon.getEY(),backgroundPaint);

                        break;
                    case 10:
                        canvas.drawBitmap(demonBitmap,demon.getEX(),demon.getEY(),backgroundPaint);

                        break;
                }
                canvas.drawBitmap(playerbitmap,player.getPlayerX(),player.getPlayerY(),backgroundPaint);
                /*
                  try{


                }catch (Exception e){}
                 */

                //рисуем картинки  предметов в игре
                if(global.playerItems.getItemOneBitmap(3)!=null){
                    canvas.drawBitmap( global.playerItems.getItemOneBitmap(3),player.getPlayerX()+46,player.getPlayerY()+72,backgroundPaint);
                }
                if(global.playerItems.getItemOneBitmap(4)!=null){
                    canvas.drawBitmap( global.playerItems.getItemOneBitmap(4),player.getPlayerX()+46,player.getPlayerY()+72,backgroundPaint);
                }
                if(global.playerItems.getItemOneBitmap(8)!=null){
                    canvas.drawBitmap( global.playerItems.getItemOneBitmap(8),player.getPlayerX()+46,player.getPlayerY()+72,backgroundPaint);
                }



            }finally {

                    surfaceHolder.unlockCanvasAndPost(canvas);

            }

        }
    }

    public void setRunning(boolean b){
        running = b;
    }

}
