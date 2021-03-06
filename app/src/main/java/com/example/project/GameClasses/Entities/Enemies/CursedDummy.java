package com.example.project.GameClasses.Entities.Enemies;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.project.GameClasses.Levels.LevelThread;
import com.example.project.R;

public class CursedDummy extends Enemy {
    private long lastDrawNanoTime =-1;
    public static Bitmap cDBitmap;

    public CursedDummy(Context context){
        eDamage = 2;
        eHealth = 15;


        cDBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.dummy);
    }
    public void CDupdate(Canvas canvas, Context context) {//Все ресурсы и объекты для рисования брать из Level1l1Tread
        LevelThread.canvas = canvas;//обязательно передать canvas из tread
        long now = System.nanoTime();
        //System.out.println("Updated");
        if (this.eHealth<=0){
            cDBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ripstone);
            canvas.drawBitmap(cDBitmap,this.getEX(),this.getEY()-50, LevelThread.backgroundPaint);

        }
        // Never once did draw.
        if (lastDrawNanoTime == -1) {
            lastDrawNanoTime = now;
        }
    }
}
