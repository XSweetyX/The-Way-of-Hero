package com.example.project.GameClasses.Entities.Enemies;

import static com.example.project.GameClasses.Entities.Enemies.Slime.slimeBitmap;
import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Levels.LevelThread.backgroundPaint;
import static com.example.project.GameClasses.Levels.LevelThread.canvas;
import static com.example.project.GameClasses.Levels.LevelView.player;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.widget.TextView;

import com.example.project.GameClasses.Entities.Player;
import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.R;

public class Enemy {
    public int eHealth;
    public int eDamage;
    private int eX= 1200;
    private int eY = 650;

    public static Bitmap eBitmap = slimeBitmap;
    TextView playerHealthView123;

    public Enemy(){
    }
    public void getDamage(int dmg){
        eHealth-=dmg;

    }
    public void attackPlayer(Player player){


                player.getDamage(eDamage);
                global.attackOrganizer.setPlayerIsAttacking(true);












    }
    public int getEX() {
        return eX;
    }
    public int getEY() {
        return eY;
    }
    public int getEHealth(Enemy enemy){
        return enemy.eHealth;
    }
}
