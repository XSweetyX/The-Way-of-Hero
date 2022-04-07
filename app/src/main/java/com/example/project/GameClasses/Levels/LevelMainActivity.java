package com.example.project.GameClasses.Levels;

import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Levels.LevelView.objectLevelThread;
import static com.example.project.GameClasses.Levels.LevelView.player;
import static com.example.project.GameClasses.Levels.LevelView.slime;
import static com.example.project.GameClasses.Interface.Global.randomize;
import static com.example.project.GameClasses.Levels.LevelView.zombie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project.GameClasses.Entities.Enemies.Enemy;
import com.example.project.GameClasses.Entities.Enemies.Slime;
import com.example.project.GameClasses.Entities.Player;
import com.example.project.GameClasses.Interface.FogofWarLogistic;
import com.example.project.GameClasses.Interface.ResultActivity;
import com.example.project.MenuClasses.BaseActivity;
import com.example.project.MenuClasses.LoseActivity;
import com.example.project.MenuClasses.MapActivity;
import com.example.project.MenuClasses.Organizer;
import com.example.project.R;

import java.util.Random;

public class LevelMainActivity extends BaseActivity {
   // private Organizer organizer = new Organizer();
    //private MapActivity mapActivity = new MapActivity();
    public FogofWarLogistic fogofWarLogisticLevelMainActivity = new FogofWarLogistic();;
    private Enemy enemy =new Enemy();
    //Player player = new Player();
    int min = 0;
    int max = 100;
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


        playerHealthView = findViewById(R.id.textView2);
        Button skill1 = findViewById(R.id.skill1);
        Button skill2 = findViewById(R.id.skill2);
        Button skill3 = findViewById(R.id.skill3);
        playerHealthView.setText(""+player.getHealth(player));

        skill1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (global.organizer.getCurrentlevel()){
                    case 1:
                        player.AttackEnemy(slime);
                        //slime.getDamage(player.pDamage);
                        slime.attackPlayer(player);
                            //slime.getDamage(player.pDamage);
                            Toast.makeText(getApplicationContext(), "" + LevelView.slime.getEHealth(slime), Toast.LENGTH_SHORT).show();

                        playerHealthView.setText(""+player.getHealth(player));
                            if (LevelView.slime.getEHealth(slime) <= 0) {
                                LevelMainActivity.this.takeVictory();
                                fogofWarLogisticLevelMainActivity.setLevelsStorage(1,1);
                                // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                                //  slime=null;
                            }else if(LevelView.player.getHealth(player)<=0){
                                LevelMainActivity.this.takeLose();
                            }








                        break;
                    case 2:zombie.getDamage(player.pDamage);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();
                            // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                            //  slime=null;
                        }
                        break;
                    case 3:zombie.getDamage(player.pDamage);//заменить врагов!!!
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();
                            // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                            //  slime=null;
                        }
                        break;
                    case 4:zombie.getDamage(player.pDamage);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();
                            // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                            //  slime=null;
                        }
                        break;
                    case 5:zombie.getDamage(player.pDamage);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();
                            // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                            //  slime=null;
                        }
                        break;
                    case 6:zombie.getDamage(player.pDamage);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();
                            // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                            //  slime=null;
                        }
                        break;
                    case 7:zombie.getDamage(player.pDamage);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();
                            // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                            //  slime=null;
                        }
                        break;
                    case 8:zombie.getDamage(player.pDamage);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();
                            // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                            //  slime=null;
                        }
                        break;
                    case 9:zombie.getDamage(player.pDamage);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();
                            // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                            //  slime=null;
                        }
                        break;
                    case 10:zombie.getDamage(player.pDamage);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();
                            // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                            //  slime=null;
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
                        //slime.getDamage(player.pDamage);
                        slime.attackPlayer(player);
                            //slime.getDamage(player.pDamage);
                            Toast.makeText(getApplicationContext(), "" + LevelView.slime.getEHealth(slime), Toast.LENGTH_SHORT).show();
                        playerHealthView.setText(""+player.getHealth(player));

                            if (LevelView.slime.getEHealth(slime) <= 0) {
                                LevelMainActivity.this.takeVictory();
                                // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                                //  slime=null;
                            }else if(LevelView.player.getHealth(player)<=0){
                                LevelMainActivity.this.takeLose();
                            }

                        break;
                    case 2:zombie.getDamage(player.pDamage);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();

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
                            //slime.getDamage(player.pDamage);
                            slime.attackPlayer(player);
                            Toast.makeText(getApplicationContext(), "" + LevelView.slime.getEHealth(slime), Toast.LENGTH_SHORT).show();
                            playerHealthView.setText(""+player.getHealth(player));

                            if (LevelView.slime.getEHealth(slime) <= 0) {
                                LevelMainActivity.this.takeVictory();
                                // Toast.makeText(getApplicationContext(), "randomize= "+randomize, Toast.LENGTH_SHORT).show();
                                //  slime=null;
                            }else if(LevelView.player.getHealth(player)<=0){
                                LevelMainActivity.this.takeLose();
                            }






                        break;
                    case 2:zombie.getDamage(player.pDamage);
                        Toast.makeText(getApplicationContext(), ""+LevelView.zombie.getEHealth(zombie), Toast.LENGTH_SHORT).show();


                        if(LevelView.zombie.getEHealth(zombie)<=0){
                            LevelMainActivity.this.takeVictory();

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
