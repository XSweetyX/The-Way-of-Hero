package com.example.project.GameClasses.Levels;

import static com.example.project.GameClasses.Entities.Player.X2damage;
import static com.example.project.GameClasses.Interface.Global.AbilityPoints;
import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Interface.Global.pDamage;
import static com.example.project.GameClasses.Levels.LevelView.demon;
import static com.example.project.GameClasses.Levels.LevelView.dragon;
import static com.example.project.GameClasses.Levels.LevelView.dummy;
import static com.example.project.GameClasses.Levels.LevelView.ghost;
import static com.example.project.GameClasses.Levels.LevelView.ghoul;
import static com.example.project.GameClasses.Levels.LevelView.megaDog;
import static com.example.project.GameClasses.Levels.LevelView.objectLevelThread;
import static com.example.project.GameClasses.Levels.LevelView.player;
import static com.example.project.GameClasses.Levels.LevelView.slime;
import static com.example.project.GameClasses.Interface.Global.randomize;
import static com.example.project.GameClasses.Levels.LevelView.strangeCat;
import static com.example.project.GameClasses.Levels.LevelView.zombie;
import static com.example.project.GameClasses.Levels.LevelView.сursedMage;
import static com.example.project.GameClasses.Interface.Global.health;
import static com.example.project.MenuClasses.InventoryActivity.secondHealth;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.example.project.GameClasses.GameBackend.MyService;
import com.example.project.GameClasses.GameBackend.ZombieThemeSound;
import com.example.project.GameClasses.Interface.ResultActivity;
import com.example.project.MenuClasses.BaseActivity;
import com.example.project.MenuClasses.InventoryActivity;
import com.example.project.MenuClasses.LoseActivity;
import com.example.project.MenuClasses.MenuActivity;
import com.example.project.MenuClasses.SplashActivity;
import com.example.project.R;

import java.util.Random;

public class LevelMainActivity extends BaseActivity {

    MediaPlayer mwPlayer;
    MediaPlayer mlPlayer;
    int min = 1;
    int max = 9;
    int diff = max - min;

    TextView playerHealthView;
    TextView enemyHealthView;
    TextView enemyDamageTakenView;
    Random random = new Random();
    int randint;

    public void takeLose(){
        mlPlayer.start();
        AbilityPoints=1;
        objectLevelThread.setRunning(false);
        startActivity(new Intent(LevelMainActivity.this, LoseActivity.class));
        secondHealth =health;
        LevelMainActivity.this.finish();
    }
    public void takeVictory(){
        mwPlayer.start();
        AbilityPoints=1;
        randomize =true;
        Toast.makeText(getApplicationContext(), "You Won", Toast.LENGTH_SHORT).show();
        randint = random.nextInt(diff + 1);
        global.itemStorage.addItem( randint);
        objectLevelThread.setRunning(false);
        Intent intent = new Intent(LevelMainActivity.this, ResultActivity.class);
        intent.putExtra("rI",randint);
        startActivity(intent);


        secondHealth =health;
        System.out.println("Okey");
        LevelMainActivity.this.finish();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean flag = false;

        setContentView(R.layout.lavel1_1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        MediaPlayer mhPlayer = MediaPlayer.create(LevelMainActivity.this, R.raw.hitsound);
        mwPlayer = MediaPlayer.create(LevelMainActivity.this, R.raw.winsound);
        mlPlayer = MediaPlayer.create(LevelMainActivity.this, R.raw.losesound);
        MediaPlayer m1Player = MediaPlayer.create(LevelMainActivity.this, R.raw.slimetheme);
        MediaPlayer m2Player = MediaPlayer.create(LevelMainActivity.this, R.raw.zombie);
        MediaPlayer m3Player = MediaPlayer.create(LevelMainActivity.this, R.raw.dummytheme);
        MediaPlayer m4Player = MediaPlayer.create(LevelMainActivity.this, R.raw.strangecattheme);
        MediaPlayer m5Player = MediaPlayer.create(LevelMainActivity.this, R.raw.megadogtheme);
        MediaPlayer m6Player = MediaPlayer.create(LevelMainActivity.this, R.raw.ghost);
        MediaPlayer m7Player = MediaPlayer.create(LevelMainActivity.this, R.raw.ghoultheme);
        MediaPlayer m8Player = MediaPlayer.create(LevelMainActivity.this, R.raw.cursedmagetheme);
        MediaPlayer m9Player = MediaPlayer.create(LevelMainActivity.this, R.raw.dragontheme);
        MediaPlayer m10Player = MediaPlayer.create(LevelMainActivity.this, R.raw.demontheme);
        playerHealthView = findViewById(R.id.textView2);
        enemyHealthView = findViewById(R.id.enemy_hp_view);
        enemyDamageTakenView = findViewById(R.id.enemy_damage_taken_view);
        Button skill1 = findViewById(R.id.skill1);
        Button skill2 = findViewById(R.id.skill2);
        Button skill3 = findViewById(R.id.skill3);
        ImageView ap1_1 =findViewById(R.id.imageView2);
        ImageView ap2_1 =findViewById(R.id.imageView3);
        ImageView ap2_2 =findViewById(R.id.imageView4);
        ImageView ap3_1 =findViewById(R.id.imageView5);
        ImageView ap3_2 =findViewById(R.id.imageView6);
        ImageView ap3_3 =findViewById(R.id.imageView7);
        secondHealth=health;

        ap1_1.setImageResource(R.drawable.abilityisactivated);
        ap2_1.setImageResource(R.drawable.abilityisactivated);
        ap3_1.setImageResource(R.drawable.abilityisactivated);
        ap2_2.setImageResource(R.drawable.abilityisnotactivated);
        ap3_2.setImageResource(R.drawable.abilityisnotactivated);
        ap3_3.setImageResource(R.drawable.abilityisnotactivated);
        playerHealthView.setText(""+secondHealth);
        skill2.setEnabled(false);
        skill3.setEnabled(false);




        switch (global.organizer.getCurrentlevel()) {
            case 1:

                m1Player.start();
                m1Player.setLooping(true);
                break;
            case 2:

                m2Player.start();
                m2Player.setLooping(true);
                break;
            case 3:

                m3Player.start();
                m3Player.setLooping(true);
                break;
            case 4:

                m4Player.start();
                m4Player.setLooping(true);
                break;
            case 5:

                m5Player.start();
                m5Player.setLooping(true);
                break;

            case 6:

                m6Player.start();
                m6Player.setLooping(true);
                break;
            case 7:

                m7Player.start();
                m7Player.setLooping(true);
                break;
            case 8:

                m8Player.start();
                m8Player.setLooping(true);
                break;
            case 9:

                m9Player.start();
                m9Player.setLooping(true);
                break;
            case 10:

                m10Player.start();
                m10Player.setLooping(true);
                break;
        }

        skill1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                switch (global.organizer.getCurrentlevel()){
                    case 1:
                        enemyHealthView.setText(""+slime.getEHealth(slime));

                        player.AttackEnemy(slime);
                        enemyHealthView.setText(""+slime.getEHealth(slime));
                        enemyDamageTakenView.setText("-"+pDamage);
                        AbilityPoints++;
                        mhPlayer.start();
                        Handler handler1_1 = new Handler();
                        handler1_1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                slime.attackPlayer(player);
                                mhPlayer.start();
                                playerHealthView.setText(""+secondHealth);
                            }
                        }, 1000);


                        Toast.makeText(getApplicationContext(), "" + LevelView.slime.getEHealth(slime), Toast.LENGTH_SHORT).show();
                        if (LevelView.slime.getEHealth(slime) <= 0) {
                            m1Player.stop();
                            global.nextLevel=2;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m1Player.stop();
                            LevelMainActivity.this.takeLose();

                        }







                        break;
                    case 2:
                        enemyHealthView.setText(""+zombie.getEHealth(zombie));

                        player.AttackEnemy(zombie);

                        enemyHealthView.setText(""+zombie.getEHealth(zombie));
                        enemyDamageTakenView.setText("-"+pDamage);
                        AbilityPoints++;
                        mhPlayer.start();
                        Handler handler1 = new Handler();
                        handler1.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                zombie.attackPlayer(player);
                                mhPlayer.start();
                                playerHealthView.setText(""+secondHealth);
                            }
                        }, 1000);


                        Toast.makeText(getApplicationContext(), "" + LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();

                        if (LevelView.zombie.getEHealth(zombie) <= 0) {
                            m2Player.stop();
                            global.nextLevel=3;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m2Player.stop();
                            LevelMainActivity.this.takeLose();

                        }
                        break;
                    case 3:
                        enemyHealthView.setText(""+dummy.getEHealth(dummy));
                        player.AttackEnemy(dummy);
                        enemyHealthView.setText(""+dummy.getEHealth(dummy));
                        enemyDamageTakenView.setText("-"+pDamage);
                        AbilityPoints++;
                        mhPlayer.start();
                        Handler handler2 = new Handler();
                        handler2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dummy.attackPlayer(player);
                                mhPlayer.start();
                                playerHealthView.setText(""+secondHealth);
                            }
                        }, 1000);


                        Toast.makeText(getApplicationContext(), "" + LevelView.dummy.getEHealth(dummy), Toast.LENGTH_SHORT).show();

                        if (LevelView.dummy.getEHealth(dummy) <= 0) {
                            m3Player.stop();
                            global.nextLevel=4;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m3Player.stop();
                            LevelMainActivity.this.takeLose();

                        }
                        break;
                    case 4:
                        enemyHealthView.setText(""+strangeCat.getEHealth(strangeCat));

                        player.AttackEnemy(strangeCat);
                        enemyHealthView.setText(""+strangeCat.getEHealth(strangeCat));
                        mhPlayer.start();
                        enemyDamageTakenView.setText("-"+pDamage);
                        AbilityPoints++;
                        Handler handler3= new Handler();
                        handler3.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                strangeCat.attackPlayer(player);
                                mhPlayer.start();
                                playerHealthView.setText(""+secondHealth);
                            }
                        }, 1000);


                        Toast.makeText(getApplicationContext(), "" + LevelView.strangeCat.getEHealth(strangeCat), Toast.LENGTH_SHORT).show();
                        if (LevelView.strangeCat.getEHealth(strangeCat) <= 0) {
                            m4Player.stop();
                            global.nextLevel=5;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m4Player.stop();
                            LevelMainActivity.this.takeLose();

                        }
                        break;
                    case 5:
                        enemyHealthView.setText(""+megaDog.getEHealth(megaDog));
                        player.AttackEnemy(megaDog);
                        enemyHealthView.setText(""+megaDog.getEHealth(megaDog));
                        enemyDamageTakenView.setText("-"+pDamage);
                        AbilityPoints++;
                        mhPlayer.start();
                        Handler handler4= new Handler();
                        handler4.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                megaDog.attackPlayer(player);
                                mhPlayer.start();
                                playerHealthView.setText(""+secondHealth);
                            }
                        }, 1000);


                        Toast.makeText(getApplicationContext(), "" + LevelView.megaDog.getEHealth(megaDog), Toast.LENGTH_SHORT).show();

                        if (LevelView.megaDog.getEHealth(megaDog) <= 0) {
                            m5Player.stop();
                            global.nextLevel=6;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m5Player.stop();
                            LevelMainActivity.this.takeLose();

                        }
                        break;
                    case 6:
                        enemyHealthView.setText(""+ghost.getEHealth(ghost));
                        player.AttackEnemy(ghost);
                        enemyHealthView.setText(""+ghost.getEHealth(ghost));
                        enemyDamageTakenView.setText("-"+pDamage);
                        AbilityPoints++;
                        mhPlayer.start();
                        Handler handler5= new Handler();
                        handler5.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ghost.attackPlayer(player);
                                mhPlayer.start();
                                playerHealthView.setText(""+secondHealth);
                            }
                        }, 1000);


                        Toast.makeText(getApplicationContext(), "" + LevelView.ghost.getEHealth(ghost), Toast.LENGTH_SHORT).show();
                        if (LevelView.ghost.getEHealth(ghost) <= 0) {
                            m6Player.stop();
                            global.nextLevel=7;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m6Player.stop();
                            LevelMainActivity.this.takeLose();

                        }
                        break;
                    case 7:
                        enemyHealthView.setText(""+ghoul.getEHealth(ghoul));
                        player.AttackEnemy(ghoul);
                        enemyHealthView.setText(""+ghoul.getEHealth(ghoul));
                        enemyDamageTakenView.setText("-"+pDamage);
                        AbilityPoints++;
                        mhPlayer.start();
                        Handler handler6= new Handler();
                        handler6.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ghoul.attackPlayer(player);
                                mhPlayer.start();
                                playerHealthView.setText(""+secondHealth);
                            }
                        }, 1000);


                        Toast.makeText(getApplicationContext(), "" + LevelView.ghoul.getEHealth(ghoul), Toast.LENGTH_SHORT).show();

                        if (LevelView.ghoul.getEHealth(ghoul) <= 0) {
                            m7Player.stop();
                            global.nextLevel=8;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m7Player.stop();
                            LevelMainActivity.this.takeLose();

                        }
                        break;
                    case 8:
                        enemyHealthView.setText(""+сursedMage.getEHealth(сursedMage));
                        player.AttackEnemy(сursedMage);
                        enemyHealthView.setText(""+сursedMage.getEHealth(сursedMage));
                        enemyDamageTakenView.setText("-"+pDamage);
                        AbilityPoints++;
                        mhPlayer.start();
                        Handler handler7= new Handler();
                        handler7.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                сursedMage.attackPlayer(player);
                                mhPlayer.start();
                                playerHealthView.setText(""+secondHealth);
                            }
                        }, 1000);


                        Toast.makeText(getApplicationContext(), "" + LevelView.сursedMage.getEHealth(сursedMage), Toast.LENGTH_SHORT).show();

                        if (LevelView.сursedMage.getEHealth(сursedMage) <= 0) {
                            m8Player.stop();
                            global.nextLevel=9;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m8Player.stop();
                            LevelMainActivity.this.takeLose();

                        }

                        break;
                    case 9:
                        enemyHealthView.setText(""+dragon.getEHealth(dragon));
                        player.AttackEnemy(dragon);
                        enemyHealthView.setText(""+dragon.getEHealth(dragon));
                        enemyDamageTakenView.setText("-"+pDamage);
                        AbilityPoints++;
                        mhPlayer.start();
                        Handler handler8= new Handler();
                        handler8.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                dragon.attackPlayer(player);
                                mhPlayer.start();
                                playerHealthView.setText(""+secondHealth);
                            }
                        }, 1000);


                        Toast.makeText(getApplicationContext(), "" + LevelView.dragon.getEHealth(dragon), Toast.LENGTH_SHORT).show();

                        if (LevelView.dragon.getEHealth(dragon) <= 0) {
                            m9Player.stop();
                            global.nextLevel=10;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m9Player.stop();
                            LevelMainActivity.this.takeLose();

                        }

                        break;
                    case 10:
                        enemyHealthView.setText(""+demon.getEHealth(demon));
                        player.AttackEnemy(demon);
                        enemyHealthView.setText(""+demon.getEHealth(demon));
                        enemyDamageTakenView.setText("-"+pDamage);
                        AbilityPoints++;
                        mhPlayer.start();
                        Handler handler9= new Handler();
                        handler9.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                demon.attackPlayer(player);
                                mhPlayer.start();
                                playerHealthView.setText(""+secondHealth);
                            }
                        }, 1000);


                        Toast.makeText(getApplicationContext(), "" + LevelView.demon.getEHealth(demon), Toast.LENGTH_SHORT).show();
                        if (LevelView.demon.getEHealth(demon) <= 0) {
                            m10Player.stop();
                            global.nextLevel=2;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m10Player.stop();
                            LevelMainActivity.this.takeLose();

                        }
                        break;

                }

                switch (AbilityPoints){
                    case 1:
                        ap1_1.setImageResource(R.drawable.abilityisactivated);
                        ap2_1.setImageResource(R.drawable.abilityisactivated);
                        ap3_1.setImageResource(R.drawable.abilityisactivated);
                        ap2_2.setImageResource(R.drawable.abilityisnotactivated);
                        ap3_2.setImageResource(R.drawable.abilityisnotactivated);
                        ap3_3.setImageResource(R.drawable.abilityisnotactivated);
                        skill2.setEnabled(false);
                        skill3.setEnabled(false);
                        break;
                    case 2:
                        ap1_1.setImageResource(R.drawable.abilityisactivated);
                        ap2_1.setImageResource(R.drawable.abilityisactivated);
                        ap3_1.setImageResource(R.drawable.abilityisactivated);
                        ap2_2.setImageResource(R.drawable.abilityisactivated);
                        ap3_2.setImageResource(R.drawable.abilityisactivated);
                        ap3_3.setImageResource(R.drawable.abilityisnotactivated);
                        skill2.setEnabled(true);
                        skill3.setEnabled(false);
                        break;


                    case 3:
                        ap1_1.setImageResource(R.drawable.abilityisactivated);
                        ap2_1.setImageResource(R.drawable.abilityisactivated);
                        ap3_1.setImageResource(R.drawable.abilityisactivated);
                        ap2_2.setImageResource(R.drawable.abilityisactivated);
                        ap3_2.setImageResource(R.drawable.abilityisactivated);
                        ap3_3.setImageResource(R.drawable.abilityisactivated);
                        skill2.setEnabled(true);
                        skill3.setEnabled(true);
                        break;

                }



            }
        });
        skill2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (global.organizer.getCurrentlevel()){
                    case 1:
                        enemyHealthView.setText(""+slime.getEHealth(slime));
                        player.AttackEnemyX2(slime);
                        mhPlayer.start();
                        slime.attackPlayer(player);

                        Toast.makeText(getApplicationContext(), "" + LevelView.slime.getEHealth(slime), Toast.LENGTH_SHORT).show();
                        enemyHealthView.setText(""+slime.getEHealth(slime));
                        playerHealthView.setText(""+secondHealth);
                        enemyDamageTakenView.setText("-"+X2damage);
                        if (LevelView.slime.getEHealth(slime) <= 0) {
                            m1Player.stop();
                            global.nextLevel=2;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m1Player.stop();
                            LevelMainActivity.this.takeLose();

                        }








                        break;
                    case 2:
                        enemyHealthView.setText(""+zombie.getEHealth(zombie));
                        player.AttackEnemyX2(zombie);
                        mhPlayer.start();
                        zombie.attackPlayer(player);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();
                        enemyHealthView.setText(""+zombie.getEHealth(zombie));
                        playerHealthView.setText(""+secondHealth);
                        enemyDamageTakenView.setText("-"+X2damage);
                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            global.nextLevel=3;
                            m2Player.stop();
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m2Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 3:
                        enemyHealthView.setText(""+dummy.getEHealth(dummy));
                        player.AttackEnemyX2(dummy);
                        mhPlayer.start();
                        dummy.attackPlayer(player);
                        Toast.makeText(getApplicationContext(), ""+LevelView.dummy.getEHealth(dummy), Toast.LENGTH_SHORT).show();
                        enemyHealthView.setText(""+dummy.getEHealth(dummy));
                        playerHealthView.setText(""+secondHealth);
                        enemyDamageTakenView.setText("-"+X2damage);

                        if(LevelView.dummy.getEHealth(dummy)<=0){
                            m3Player.stop();
                            global.nextLevel=4;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m3Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 4:
                        enemyHealthView.setText(""+strangeCat.getEHealth(strangeCat));
                        player.AttackEnemyX2(strangeCat);
                        mhPlayer.start();
                        strangeCat.attackPlayer(player);
                        playerHealthView.setText(""+secondHealth);
                        Toast.makeText(getApplicationContext(), ""+LevelView.strangeCat.getEHealth(strangeCat), Toast.LENGTH_SHORT).show();
                        enemyHealthView.setText(""+strangeCat.getEHealth(strangeCat));
                        enemyDamageTakenView.setText("-"+X2damage);

                        if(LevelView.strangeCat.getEHealth(strangeCat)<=0){
                            m4Player.stop();
                            global.nextLevel=5;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m4Player.stop();
                            LevelMainActivity.this.takeLose();
                        }

                        break;
                    case 5:
                        enemyHealthView.setText(""+megaDog.getEHealth(megaDog));
                        player.AttackEnemyX2(megaDog);
                        mhPlayer.start();
                        megaDog.attackPlayer(player);
                        playerHealthView.setText(""+secondHealth);
                        Toast.makeText(getApplicationContext(), ""+LevelView.megaDog.getEHealth(megaDog), Toast.LENGTH_SHORT).show();
                        enemyHealthView.setText(""+megaDog.getEHealth(megaDog));
                        enemyDamageTakenView.setText("-"+X2damage);


                        if(LevelView.megaDog.getEHealth(megaDog)<=0){
                            m5Player.stop();
                            global.nextLevel=6;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m5Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 6:
                        enemyHealthView.setText(""+ghost.getEHealth(ghost));
                        player.AttackEnemyX2(ghost);
                        mhPlayer.start();
                        ghost.attackPlayer(player);
                        playerHealthView.setText(""+secondHealth);
                        Toast.makeText(getApplicationContext(), ""+LevelView.ghost.getEHealth(ghost), Toast.LENGTH_SHORT).show();
                        enemyHealthView.setText(""+ghost.getEHealth(ghost));
                        enemyDamageTakenView.setText("-"+X2damage);


                        if(LevelView.ghost.getEHealth(ghost)<=0){
                            m6Player.stop();
                            global.nextLevel=7;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m6Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 7:
                        enemyHealthView.setText(""+ghoul.getEHealth(ghoul));
                        player.AttackEnemyX2(ghoul);
                        mhPlayer.start();
                        ghoul.attackPlayer(player);
                        playerHealthView.setText(""+secondHealth);
                        Toast.makeText(getApplicationContext(), ""+LevelView.ghoul.getEHealth(ghoul), Toast.LENGTH_SHORT).show();
                        enemyHealthView.setText(""+ghoul.getEHealth(ghoul));
                        enemyDamageTakenView.setText("-"+X2damage);




                        if(LevelView.ghoul.getEHealth(ghoul)<=0){
                            m7Player.stop();
                            global.nextLevel=8;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m7Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 8:
                        enemyHealthView.setText(""+сursedMage.getEHealth(сursedMage));
                        player.AttackEnemyX2(сursedMage);
                        mhPlayer.start();
                        сursedMage.attackPlayer(player);
                        playerHealthView.setText(""+secondHealth);
                        Toast.makeText(getApplicationContext(), ""+LevelView.сursedMage.getEHealth(сursedMage), Toast.LENGTH_SHORT).show();
                        enemyHealthView.setText(""+сursedMage.getEHealth(сursedMage));
                        enemyDamageTakenView.setText("-"+X2damage);


                        if(LevelView.сursedMage.getEHealth(сursedMage)<=0){
                            m8Player.stop();
                            global.nextLevel=9;
                            LevelMainActivity.this.takeVictory();

                        }else if(secondHealth<=0){
                            m8Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 9:
                        enemyHealthView.setText(""+dragon.getEHealth(dragon));

                        player.AttackEnemyX2(dragon);
                        mhPlayer.start();
                        dragon.attackPlayer(player);
                        playerHealthView.setText(""+secondHealth);
                        Toast.makeText(getApplicationContext(), ""+LevelView.dragon.getEHealth(dragon), Toast.LENGTH_SHORT).show();
                        enemyHealthView.setText(""+dragon.getEHealth(dragon));
                        enemyDamageTakenView.setText("-"+X2damage);


                        if(LevelView.dragon.getEHealth(dragon)<=0){
                            m9Player.stop();
                            global.nextLevel=10;
                            LevelMainActivity.this.takeVictory();


                        }else if(secondHealth<=0){
                            m9Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 10:
                        enemyHealthView.setText(""+demon.getEHealth(demon));

                        player.AttackEnemyX2(demon);
                        mhPlayer.start();
                        demon.attackPlayer(player);
                        playerHealthView.setText(""+secondHealth);
                        Toast.makeText(getApplicationContext(), ""+LevelView.demon.getEHealth(demon), Toast.LENGTH_SHORT).show();
                        enemyHealthView.setText(""+demon.getEHealth(demon));
                        enemyDamageTakenView.setText("-"+X2damage);


                        if(LevelView.demon.getEHealth(demon)<=0){
                            m10Player.stop();
                            LevelMainActivity.this.takeVictory();

                        }else if(secondHealth<=0){
                            m10Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;

                }
                AbilityPoints=1;

                skill2.setEnabled(false);
                ap1_1.setImageResource(R.drawable.abilityisactivated);
                ap2_1.setImageResource(R.drawable.abilityisactivated);
                ap3_1.setImageResource(R.drawable.abilityisactivated);
                ap2_2.setImageResource(R.drawable.abilityisnotactivated);
                ap3_2.setImageResource(R.drawable.abilityisnotactivated);
                ap3_3.setImageResource(R.drawable.abilityisnotactivated);


            }
        });
        skill3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondHealth+=20;
                playerHealthView.setText(""+secondHealth);

                AbilityPoints=1;
                skill2.setEnabled(false);
                skill3.setEnabled(false);
                ap1_1.setImageResource(R.drawable.abilityisactivated);
                ap2_1.setImageResource(R.drawable.abilityisactivated);
                ap3_1.setImageResource(R.drawable.abilityisactivated);
                ap2_2.setImageResource(R.drawable.abilityisnotactivated);
                ap3_2.setImageResource(R.drawable.abilityisnotactivated);
                ap3_3.setImageResource(R.drawable.abilityisnotactivated);

            }
        });



        secondHealth =health;




    }

    public TextView getHealthView(){
        return playerHealthView;
    }
    public boolean getRandomizeInfo(){
        return randomize;
    }
    public void setRandomize(boolean c){
        randomize =c;
    }
    public  int getChanceInfo(){
        return randint;
    }

}
