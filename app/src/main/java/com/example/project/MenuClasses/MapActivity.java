package com.example.project.MenuClasses;

import static com.example.project.GameClasses.Interface.Global.global;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.R;

public class MapActivity extends BaseActivity {


    public static Button lavel1_1 ;
    public static Button level1_2 ;
    public static Button level1_3 ;
    public static Button level1_4 ;
    public static Button level1_5 ;
    public static Button level1_6 ;
    public static Button level1_7 ;
    public static Button level1_8 ;
    public static Button level1_9 ;
    public static Button level1_10 ;
    Button inventoryb;
    Intent intent;
    Bundle arguments1;

    //public static int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);


        MediaPlayer mmPlayer = MediaPlayer.create(MapActivity.this, R.raw.mainsound);
        lavel1_1=findViewById(R.id.button3);
        level1_2 =findViewById(R.id.buttonl2);
        level1_3 =findViewById(R.id.buttonl3);
        level1_4 =findViewById(R.id.buttonl4);
        level1_5 =findViewById(R.id.buttonl5);
        level1_6 =findViewById(R.id.buttonl6);
        level1_7 =findViewById(R.id.buttonl7);
        level1_8 =findViewById(R.id.buttonl8);
        level1_9 =findViewById(R.id.buttonl9);
        level1_10 =findViewById(R.id.buttonl10);
        inventoryb = findViewById(R.id.button2);


        level1_2.setEnabled(false);
        level1_3.setEnabled(false);
        level1_4.setEnabled(false);
        level1_5.setEnabled(false);
        level1_6.setEnabled(false);
        level1_7.setEnabled(false);
        level1_8.setEnabled(false);
        level1_9.setEnabled(false);
        level1_10.setEnabled(false);


        if( global.nextLevel==2){
                level1_2.setEnabled(true);
                System.out.println("Level 2 Enabled");
        }
        if( global.nextLevel==3){
            level1_3.setEnabled(true);
            System.out.println("Level 3 Enabled");
        }
        if( global.nextLevel==4){
            level1_4.setEnabled(true);
            System.out.println("Level 4 Enabled");
        }
        if( global.nextLevel==5){
            level1_5.setEnabled(true);
            System.out.println("Level 5 Enabled");
        }
        if( global.nextLevel==6){
            level1_6.setEnabled(true);
            System.out.println("Level 6 Enabled");
        }
        if( global.nextLevel==7){
            level1_7.setEnabled(true);
            System.out.println("Level 7 Enabled");
        }
        if( global.nextLevel==8){
            level1_8.setEnabled(true);
            System.out.println("Level 8 Enabled");
        }
        if( global.nextLevel==9){
            level1_9.setEnabled(true);
            System.out.println("Level 9 Enabled");
        }
        if( global.nextLevel==10){
            level1_10.setEnabled(true);
            System.out.println("Level 10 Enabled");
        }

        /*
        if(fogofWarLogistic.getLevelsStorageInfo(3)==1){
            level1_3.setEnabled(true);
        }
        if(fogofWarLogistic.getLevelsStorageInfo(4)==1){
            level1_4.setEnabled(true);
        }
        if(fogofWarLogistic.getLevelsStorageInfo(5)==1){
            level1_5.setEnabled(true);
        }
        if(fogofWarLogistic.getLevelsStorageInfo(5)==1){
            level1_6.setEnabled(true);
        }
        if(fogofWarLogistic.getLevelsStorageInfo(6)==1){
            level1_7.setEnabled(true);
        }
        if(fogofWarLogistic.getLevelsStorageInfo(7)==1){
            level1_8.setEnabled(true);
        }
        if(fogofWarLogistic.getLevelsStorageInfo(8)==1){
            level1_9.setEnabled(true);
        }
        if(fogofWarLogistic.getLevelsStorageInfo(9)==1){
            level1_10.setEnabled(true);
        }


         */

        lavel1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                global.organizer.setCurrentLevel(1);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));
                mmPlayer.start();

                MapActivity.this.finish();

            }
        });

        level1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(2);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));
                mmPlayer.start();
                MapActivity.this.finish();
            }
        });
        level1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(3);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));
                mmPlayer.start();
                MapActivity.this.finish();
            }
        });
        level1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(4);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));
                mmPlayer.start();
                MapActivity.this.finish();
            }
        });
        level1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(5);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));
                mmPlayer.start();
                MapActivity.this.finish();
            }
        });
        level1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(6);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));
                mmPlayer.start();
                MapActivity.this.finish();
            }
        });
        level1_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(7);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));
                mmPlayer.start();
                MapActivity.this.finish();
            }
        });
        level1_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(8);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));
                mmPlayer.start();
                MapActivity.this.finish();
            }
        });
        level1_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(9);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));
                mmPlayer.start();
                MapActivity.this.finish();
            }
        });
        level1_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(10);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));
                mmPlayer.start();
                MapActivity.this.finish();
            }
        });
        inventoryb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MapActivity.this, InventoryActivity.class));
                mmPlayer.start();
                MapActivity.this.finish();
            }
        });

    }


}

