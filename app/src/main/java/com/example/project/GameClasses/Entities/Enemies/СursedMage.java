package com.example.project.GameClasses.Entities.Enemies;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.project.GameClasses.Levels.LevelThread;
import com.example.project.R;

public class СursedMage extends Enemy{
    private long lastDrawNanoTime =-1;
    public static Bitmap cursedMageBitmap;

    public СursedMage(Context context){
        eDamage = 5;
        eHealth = 80;


        cursedMageBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.cursedmage);
    }
    public void CMupdate(Canvas canvas, Context context) {//Все ресурсы и объекты для рисования брать из Level1l1Tread
        LevelThread.canvas = canvas;//обязательно передать canvas из tread
        long now = System.nanoTime();
        //System.out.println("Updated");
        if (this.eHealth<=0){
            cursedMageBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ripstone);
            canvas.drawBitmap(cursedMageBitmap,this.getEX(),this.getEY()-250, LevelThread.backgroundPaint);

        }
        // Never once did draw.
        if (lastDrawNanoTime == -1) {
            lastDrawNanoTime = now;
        }
    }

}
