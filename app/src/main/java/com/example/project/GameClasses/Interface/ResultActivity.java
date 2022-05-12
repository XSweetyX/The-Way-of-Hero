package com.example.project.GameClasses.Interface;


import static com.example.project.GameClasses.Interface.Global.IMGKEY;

import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Interface.Global.randomize;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.MenuClasses.BaseActivity;
import com.example.project.MenuClasses.InventoryActivity;
import com.example.project.MenuClasses.MapActivity;
import com.example.project.R;

import java.util.HashMap;
import java.util.Random;

public class ResultActivity extends BaseActivity {


    Button continueButton;
    TextView resultText;
    ImageView itemYouGot;

    Intent intent;
    Bundle arguments;
    int chance ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        itemYouGot =findViewById(R.id.item_you_got);

        continueButton = findViewById(R.id.continue_but);
        resultText =findViewById(R.id.result_text);
        intent=getIntent();
        arguments = intent.getExtras();
        chance = arguments.getInt("rI");


        if( chance==1){
            itemYouGot.setImageResource(R.drawable.treestick);

           // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==2){
            itemYouGot.setImageResource(R.drawable.pan);

           // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==3 ){
            itemYouGot.setImageResource(R.drawable.slimesword);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==4){
            itemYouGot.setImageResource(R.drawable.obsidiansword);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==5){
            itemYouGot.setImageResource(R.drawable.crimsonscythe);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==6){
            itemYouGot.setImageResource(R.drawable.ironarmor);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==7){
            itemYouGot.setImageResource(R.drawable.goldenarmor);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==8){
            itemYouGot.setImageResource(R.drawable.slimearmor);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==9){
            itemYouGot.setImageResource(R.drawable.darkwizardsuit);


            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==10){
            itemYouGot.setImageResource(R.drawable.rubinring);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==11){
            itemYouGot.setImageResource(R.drawable.ametistring);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==12){
            itemYouGot.setImageResource(R.drawable.darkring);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==13){
            itemYouGot.setImageResource(R.drawable.emeraldring);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance ==14){
            itemYouGot.setImageResource(R.drawable.shield);

            // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }











        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, MapActivity.class));

                ResultActivity.this.finish();
                global.flag=true;
            }
        });


    }

    public void setChance(int chance) {
        this.chance = chance;
    }
}
