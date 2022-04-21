package com.example.project.GameClasses.Entities.Enemies;

import static com.example.project.GameClasses.Levels.LevelThread.backgroundPaint;
import static com.example.project.GameClasses.Levels.LevelThread.canvas;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;
import androidx.core.content.res.ResourcesCompat;

import com.example.project.GameClasses.Levels.LevelThread;
import com.example.project.GameClasses.Levels.LevelView;
import com.example.project.R;

public class Slime extends Enemy{
    private long lastDrawNanoTime =-1;

    public static Bitmap slimeBitmap;



    public Slime(Context context){
        eDamage = 1;
        eHealth = 10;

        //this.update();
        slimeBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.slime);

    }


    public void Supdate(Canvas canvas, Context context) {//Все ресурсы и объекты для рисования брать из Level1l1Tread
        LevelThread.canvas = canvas;//обязательно передать canvas из tread
        long now = System.nanoTime();
        //System.out.println("Updated");
        if (this.eHealth<=0){
            slimeBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.ripstone);
            canvas.drawBitmap(slimeBitmap,this.getEX(),this.getEY(), LevelThread.backgroundPaint);

        }
        // Never once did draw.
        if (lastDrawNanoTime == -1) {//Важная строчка (хз зачем нужна , но без неё не работает )
            lastDrawNanoTime = now;
        }
    }

}
