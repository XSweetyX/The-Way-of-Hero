package com.example.project.GameClasses.Entities.Enemies;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.project.GameClasses.Levels.LevelThread;
import com.example.project.R;

public class Ghost extends Enemy{
    private long lastDrawNanoTime =-1;
    public static Bitmap ghostBitmap;

    public Ghost(Context context){
        eDamage = 10;
        eHealth = 200;


        ghostBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ghost);
    }
    public void GhostUpdate(Canvas canvas, Context context) {//Все ресурсы и объекты для рисования брать из Level1l1Tread
        LevelThread.canvas = canvas;//обязательно передать canvas из tread
        long now = System.nanoTime();
        //System.out.println("Updated");
        if (this.eHealth<=0){
            ghostBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ripstone);
            canvas.drawBitmap(ghostBitmap,this.getEX(),this.getEY(), LevelThread.backgroundPaint);

        }
        // Never once did draw.
        if (lastDrawNanoTime == -1) {//Важная строчка (хз зачем нужна , но без неё не работает )
            lastDrawNanoTime = now;
        }
    }

}
