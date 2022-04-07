package com.example.project.MenuClasses;

import static com.example.project.GameClasses.Interface.Global.global;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project.GameClasses.Interface.FogofWarLogistic;
import com.example.project.GameClasses.Interface.Global;
import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.R;

public class MapActivity extends BaseActivity {

    Button lavel1_1 ;
    Button level1_2 ;
    Button level1_3 ;
    Button level1_4 ;
    Button level1_5 ;
    Button level1_6 ;
    Button level1_7 ;
    Button level1_8 ;
    Button level1_9 ;
    Button level1_10 ;
    Button inventoryb;
    public FogofWarLogistic fogofWarLogistic = new FogofWarLogistic();
    //public static int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
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


        level1_2.setClickable(false);
        level1_3.setClickable(false);
        level1_4.setClickable(false);
        level1_5.setClickable(false);
        level1_6.setClickable(false);
        level1_7.setClickable(false);
        level1_8.setClickable(false);
        level1_9.setClickable(false);
        level1_10.setClickable(false);
        if(fogofWarLogistic.getLevelsStorageInfo(2)==1){
            level1_2.setClickable(true);
        }
        lavel1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                global.organizer.setCurrentLevel(1);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));

                MapActivity.this.finish();

            }
        });
        level1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(2);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));

                MapActivity.this.finish();
            }
        });
        level1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(3);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));

                MapActivity.this.finish();
            }
        });
        level1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(4);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));

                MapActivity.this.finish();
            }
        });
        level1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(5);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));

                MapActivity.this.finish();
            }
        });
        level1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(6);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));

                MapActivity.this.finish();
            }
        });
        level1_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(7);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));

                MapActivity.this.finish();
            }
        });
        level1_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(8);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));

                MapActivity.this.finish();
            }
        });
        level1_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(9);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));

                MapActivity.this.finish();
            }
        });
        level1_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global.organizer.setCurrentLevel(10);
                startActivity(new Intent(MapActivity.this, LevelMainActivity.class));

                MapActivity.this.finish();
            }
        });
        inventoryb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MapActivity.this, InventoryActivity.class));

                MapActivity.this.finish();
            }
        });

    }


}

