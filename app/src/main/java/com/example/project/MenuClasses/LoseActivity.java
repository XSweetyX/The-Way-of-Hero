package com.example.project.MenuClasses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project.GameClasses.Interface.ResultActivity;
import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.R;

public class LoseActivity extends BaseActivity{
    Button rerunlbut;
    Button continuelbut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lose);
        rerunlbut = findViewById(R.id.rerun_lose_but);
        continuelbut = findViewById(R.id.continue_lose_but);
        rerunlbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoseActivity.this, LevelMainActivity.class));

                LoseActivity.this.finish();
            }
        });
        continuelbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoseActivity.this, MapActivity.class));

                LoseActivity.this.finish();
            }
        });
    }

}