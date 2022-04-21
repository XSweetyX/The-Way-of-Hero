package com.example.project.GameClasses.Entities;

import static com.example.project.GameClasses.Interface.Global.global;
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
    public int health = 10;
    public int pDamage =3;
    public int AbilityPoints = 3;


    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    private int playerX = 300;
    private int playerY = 850;

    //public boolean playerIsAttacked;

    public int getHealth(Player player) {
        return player.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPDamage() {
        return pDamage;
    }

    public void setDamage(int damage) {
        this.pDamage = damage;
    }

    public int getAbilityPoints() {
        return AbilityPoints;
    }

    public void setAbilityPoints(int abilityPoints) {
        AbilityPoints = abilityPoints;
    }


    public Player(){

    }



    public void getDamage(int dmg){
        health-=dmg;

    }

    public void AttackEnemy(Enemy enemy){

            enemy.getDamage(pDamage);




            this.PDefend();

    }
    public void PDefend(){
        global.attackOrganizer.setPlayerIsAttacking(false);
    }


}
