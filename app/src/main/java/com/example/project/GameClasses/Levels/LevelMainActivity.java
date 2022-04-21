package com.example.project.GameClasses.Levels;

import static com.example.project.GameClasses.Interface.Global.global;
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

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project.GameClasses.GameBackend.MyService;
import com.example.project.GameClasses.GameBackend.ZombieThemeSound;
import com.example.project.GameClasses.Interface.ResultActivity;
import com.example.project.MenuClasses.BaseActivity;
import com.example.project.MenuClasses.LoseActivity;
import com.example.project.MenuClasses.MenuActivity;
import com.example.project.MenuClasses.SplashActivity;
import com.example.project.R;

import java.util.Random;

public class LevelMainActivity extends BaseActivity {


    int min = 0;
    int max = 8;
    int diff = max - min;
    TextView playerHealthView;
    Random random = new Random();
    int randint;
    public void takeLose(){
        objectLevelThread.setRunning(false);
        startActivity(new Intent(LevelMainActivity.this, LoseActivity.class));

        LevelMainActivity.this.finish();
    }
    public void takeVictory(){
        randomize =true;
        Toast.makeText(getApplicationContext(), "You Won", Toast.LENGTH_SHORT).show();
        randint = random.nextInt(diff + 1);
        global.itemStorage.addItem( randint);
        objectLevelThread.setRunning(false);
        Intent intent = new Intent(LevelMainActivity.this, ResultActivity.class);
        intent.putExtra("rI",randint);
        startActivity(intent);



        System.out.println("Okey");
        LevelMainActivity.this.finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.lavel1_1);

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
        Button skill1 = findViewById(R.id.skill1);
        Button skill2 = findViewById(R.id.skill2);
        Button skill3 = findViewById(R.id.skill3);
        playerHealthView.setText(""+player.getHealth(player));
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
                        player.AttackEnemy(slime);

                        slime.attackPlayer(player);

                        Toast.makeText(getApplicationContext(), "" + LevelView.slime.getEHealth(slime), Toast.LENGTH_SHORT).show();

                        playerHealthView.setText(""+player.getHealth(player));
                        if (LevelView.slime.getEHealth(slime) <= 0) {
                            m1Player.stop();
                            global.nextLevel=2;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m1Player.stop();
                            LevelMainActivity.this.takeLose();

                        }








                        break;
                    case 2:
                        player.AttackEnemy(zombie);
                        zombie.attackPlayer(player);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();

                        playerHealthView.setText(""+player.getHealth(player));//допиши в остальных частях
                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            global.nextLevel=3;
                            m2Player.stop();
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m2Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 3:
                        player.AttackEnemy(dummy);
                        dummy.attackPlayer(player);
                        Toast.makeText(getApplicationContext(), ""+LevelView.dummy.getEHealth(dummy), Toast.LENGTH_SHORT).show();
                        playerHealthView.setText(""+player.getHealth(player));

                        if(LevelView.dummy.getEHealth(dummy)<=0){
                            m3Player.stop();
                            global.nextLevel=4;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m3Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 4:
                        player.AttackEnemy(strangeCat);
                        strangeCat.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.strangeCat.getEHealth(strangeCat), Toast.LENGTH_SHORT).show();


                        if(LevelView.strangeCat.getEHealth(strangeCat)<=0){
                            m4Player.stop();
                            global.nextLevel=5;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m4Player.stop();
                            LevelMainActivity.this.takeLose();
                        }

                        break;
                    case 5:
                        player.AttackEnemy(megaDog);
                        megaDog.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.megaDog.getEHealth(megaDog), Toast.LENGTH_SHORT).show();


                        if(LevelView.megaDog.getEHealth(megaDog)<=0){
                            m5Player.stop();
                            global.nextLevel=6;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m5Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 6:
                        player.AttackEnemy(ghost);
                        ghost.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.ghost.getEHealth(ghost), Toast.LENGTH_SHORT).show();


                        if(LevelView.ghost.getEHealth(ghost)<=0){
                            m6Player.stop();
                            global.nextLevel=7;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m6Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 7:
                        player.AttackEnemy(ghoul);
                        ghoul.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.ghoul.getEHealth(ghoul), Toast.LENGTH_SHORT).show();


                        if(LevelView.ghoul.getEHealth(ghoul)<=0){
                            m7Player.stop();
                            global.nextLevel=8;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m7Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 8:
                        player.AttackEnemy(сursedMage);
                        сursedMage.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.сursedMage.getEHealth(сursedMage), Toast.LENGTH_SHORT).show();


                        if(LevelView.сursedMage.getEHealth(сursedMage)<=0){
                            m8Player.stop();
                            global.nextLevel=9;
                            LevelMainActivity.this.takeVictory();

                        }else if(LevelView.player.getHealth(player)<=0){
                            m8Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 9:
                        player.AttackEnemy(dragon);
                        dragon.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.dragon.getEHealth(dragon), Toast.LENGTH_SHORT).show();


                        if(LevelView.dragon.getEHealth(dragon)<=0){
                            m9Player.stop();
                            global.nextLevel=10;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m9Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 10:
                        player.AttackEnemy(demon);
                        demon.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.demon.getEHealth(demon), Toast.LENGTH_SHORT).show();


                        if(LevelView.demon.getEHealth(demon)<=0){
                            m10Player.stop();
                            LevelMainActivity.this.takeVictory();

                        }else if(LevelView.player.getHealth(player)<=0){
                            m10Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;

                }





            }
        });
        skill2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (global.organizer.getCurrentlevel()){
                    case 1:
                        player.AttackEnemy(slime);

                        slime.attackPlayer(player);

                        Toast.makeText(getApplicationContext(), "" + LevelView.slime.getEHealth(slime), Toast.LENGTH_SHORT).show();

                        playerHealthView.setText(""+player.getHealth(player));
                        if (LevelView.slime.getEHealth(slime) <= 0) {
                            m1Player.stop();
                            global.nextLevel=2;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m1Player.stop();
                            LevelMainActivity.this.takeLose();

                        }








                        break;
                    case 2:
                        player.AttackEnemy(zombie);
                        zombie.attackPlayer(player);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();

                        playerHealthView.setText(""+player.getHealth(player));//допиши в остальных частях
                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            global.nextLevel=3;
                            m2Player.stop();
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m2Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 3:
                        player.AttackEnemy(dummy);
                        dummy.attackPlayer(player);
                        Toast.makeText(getApplicationContext(), ""+LevelView.dummy.getEHealth(dummy), Toast.LENGTH_SHORT).show();
                        playerHealthView.setText(""+player.getHealth(player));

                        if(LevelView.dummy.getEHealth(dummy)<=0){
                            m3Player.stop();
                            global.nextLevel=4;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m3Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 4:
                        player.AttackEnemy(strangeCat);
                        strangeCat.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.strangeCat.getEHealth(strangeCat), Toast.LENGTH_SHORT).show();


                        if(LevelView.strangeCat.getEHealth(strangeCat)<=0){
                            m4Player.stop();
                            global.nextLevel=5;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m4Player.stop();
                            LevelMainActivity.this.takeLose();
                        }

                        break;
                    case 5:
                        player.AttackEnemy(megaDog);
                        megaDog.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.megaDog.getEHealth(megaDog), Toast.LENGTH_SHORT).show();


                        if(LevelView.megaDog.getEHealth(megaDog)<=0){
                            m5Player.stop();
                            global.nextLevel=6;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m5Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 6:
                        player.AttackEnemy(ghost);
                        ghost.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.ghost.getEHealth(ghost), Toast.LENGTH_SHORT).show();


                        if(LevelView.ghost.getEHealth(ghost)<=0){
                            m6Player.stop();
                            global.nextLevel=7;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m6Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 7:
                        player.AttackEnemy(ghoul);
                        ghoul.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.ghoul.getEHealth(ghoul), Toast.LENGTH_SHORT).show();


                        if(LevelView.ghoul.getEHealth(ghoul)<=0){
                            m7Player.stop();
                            global.nextLevel=8;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m7Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 8:
                        player.AttackEnemy(сursedMage);
                        сursedMage.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.сursedMage.getEHealth(сursedMage), Toast.LENGTH_SHORT).show();


                        if(LevelView.сursedMage.getEHealth(сursedMage)<=0){
                            m8Player.stop();
                            global.nextLevel=9;
                            LevelMainActivity.this.takeVictory();

                        }else if(LevelView.player.getHealth(player)<=0){
                            m8Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 9:
                        player.AttackEnemy(dragon);
                        dragon.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.dragon.getEHealth(dragon), Toast.LENGTH_SHORT).show();


                        if(LevelView.dragon.getEHealth(dragon)<=0){
                            m9Player.stop();
                            global.nextLevel=10;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m9Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 10:
                        player.AttackEnemy(demon);
                        demon.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.demon.getEHealth(demon), Toast.LENGTH_SHORT).show();


                        if(LevelView.demon.getEHealth(demon)<=0){
                            m10Player.stop();
                            LevelMainActivity.this.takeVictory();

                        }else if(LevelView.player.getHealth(player)<=0){
                            m10Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;

                }





            }
        });
        skill3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (global.organizer.getCurrentlevel()){
                    case 1:
                        player.AttackEnemy(slime);

                        slime.attackPlayer(player);

                        Toast.makeText(getApplicationContext(), "" + LevelView.slime.getEHealth(slime), Toast.LENGTH_SHORT).show();

                        playerHealthView.setText(""+player.getHealth(player));
                        if (LevelView.slime.getEHealth(slime) <= 0) {
                            m1Player.stop();
                            global.nextLevel=2;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m1Player.stop();
                            LevelMainActivity.this.takeLose();

                        }








                        break;
                    case 2:
                        player.AttackEnemy(zombie);
                        zombie.attackPlayer(player);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();

                        playerHealthView.setText(""+player.getHealth(player));//допиши в остальных частях
                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            global.nextLevel=3;
                            m2Player.stop();
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m2Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 3:
                        player.AttackEnemy(dummy);
                        dummy.attackPlayer(player);
                        Toast.makeText(getApplicationContext(), ""+LevelView.dummy.getEHealth(dummy), Toast.LENGTH_SHORT).show();
                        playerHealthView.setText(""+player.getHealth(player));

                        if(LevelView.dummy.getEHealth(dummy)<=0){
                            m3Player.stop();
                            global.nextLevel=4;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m3Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 4:
                        player.AttackEnemy(strangeCat);
                        strangeCat.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.strangeCat.getEHealth(strangeCat), Toast.LENGTH_SHORT).show();


                        if(LevelView.strangeCat.getEHealth(strangeCat)<=0){
                            m4Player.stop();
                            global.nextLevel=5;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m4Player.stop();
                            LevelMainActivity.this.takeLose();
                        }

                        break;
                    case 5:
                        player.AttackEnemy(megaDog);
                        megaDog.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.megaDog.getEHealth(megaDog), Toast.LENGTH_SHORT).show();


                        if(LevelView.megaDog.getEHealth(megaDog)<=0){
                            m5Player.stop();
                            global.nextLevel=6;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m5Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 6:
                        player.AttackEnemy(ghost);
                        ghost.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.ghost.getEHealth(ghost), Toast.LENGTH_SHORT).show();


                        if(LevelView.ghost.getEHealth(ghost)<=0){
                            m6Player.stop();
                            global.nextLevel=7;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m6Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 7:
                        player.AttackEnemy(ghoul);
                        ghoul.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.ghoul.getEHealth(ghoul), Toast.LENGTH_SHORT).show();


                        if(LevelView.ghoul.getEHealth(ghoul)<=0){
                            m7Player.stop();
                            global.nextLevel=8;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m7Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 8:
                        player.AttackEnemy(сursedMage);
                        сursedMage.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.сursedMage.getEHealth(сursedMage), Toast.LENGTH_SHORT).show();


                        if(LevelView.сursedMage.getEHealth(сursedMage)<=0){
                            m8Player.stop();
                            global.nextLevel=9;
                            LevelMainActivity.this.takeVictory();

                        }else if(LevelView.player.getHealth(player)<=0){
                            m8Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 9:
                        player.AttackEnemy(dragon);
                        dragon.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.dragon.getEHealth(dragon), Toast.LENGTH_SHORT).show();


                        if(LevelView.dragon.getEHealth(dragon)<=0){
                            m9Player.stop();
                            global.nextLevel=10;
                            LevelMainActivity.this.takeVictory();


                        }else if(LevelView.player.getHealth(player)<=0){
                            m9Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;
                    case 10:
                        player.AttackEnemy(demon);
                        demon.attackPlayer(player);
                        playerHealthView.setText(""+player.getHealth(player));
                        Toast.makeText(getApplicationContext(), ""+LevelView.demon.getEHealth(demon), Toast.LENGTH_SHORT).show();


                        if(LevelView.demon.getEHealth(demon)<=0){
                            m10Player.stop();
                            LevelMainActivity.this.takeVictory();

                        }else if(LevelView.player.getHealth(player)<=0){
                            m10Player.stop();
                            LevelMainActivity.this.takeLose();
                        }
                        break;

                }




            }
        });








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
