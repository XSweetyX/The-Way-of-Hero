package com.example.project.GameClasses.Entities;

import static com.example.project.GameClasses.Interface.Global.AbilityPoints;
import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Interface.Global.health;
import static com.example.project.GameClasses.Interface.Global.pDamage;
import static com.example.project.MenuClasses.InventoryActivity.secondHealth;

import static com.example.project.GameClasses.Levels.LevelThread.playerbitmap;

import android.app.Application;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.widget.Toast;

import com.example.project.GameClasses.Entities.Enemies.Enemy;
import com.example.project.GameClasses.Levels.LevelThread;
import com.example.project.R;

public class Player {





    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    private int playerX = 300;
    private int playerY = 650;

    //public boolean playerIsAttacked;

    public void getDamage(int dmg){
        secondHealth-=dmg;

    }

    public void AttackEnemy(Enemy enemy){

            enemy.getDamage(pDamage);




            this.PDefend();

    }
    public void PDefend(){
        global.attackOrganizer.setPlayerIsAttacking(false);
    }


}
