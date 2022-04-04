package com.example.project.GameClasses.Interface;

import static com.example.project.GameClasses.Interface.Global.BOOKKEY;
import static com.example.project.GameClasses.Interface.Global.IMGKEY;
import static com.example.project.GameClasses.Interface.Global.PRICEKEY;
import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Interface.Global.randomize;

import android.content.Intent;
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

    Button rerunButton;
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
        itemYouGot =findViewById(R.id.item_you_got);
        rerunButton = findViewById(R.id.rerun_but);
        continueButton = findViewById(R.id.continue_but);
        resultText =findViewById(R.id.result_text);
        intent=getIntent();
        arguments = intent.getExtras();
        chance = arguments.getInt("rI");


        if( chance< 50){
            itemYouGot.setImageResource(R.drawable.treestick);
            System.out.println("asdqwdqseqqeqeqweqeq");
           // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }else if( chance >= 50){
            itemYouGot.setImageResource(R.drawable.darkwizardsuit);
            System.out.println("asdqwdqseqqeqeqweadsdqsadqsdqsdqdqeqeqeq");
           // Toast.makeText(getApplicationContext(), "Chance : "+ global.ResultStore, Toast.LENGTH_SHORT).show();
        }






        rerunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, LevelMainActivity.class));

                ResultActivity.this.finish();
            }
        });




        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, MapActivity.class));

                ResultActivity.this.finish();
            }
        });


    }

    public void setChance(int chance) {
        this.chance = chance;
    }
}
