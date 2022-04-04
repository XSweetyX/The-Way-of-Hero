package com.example.project.MenuClasses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project.MenuClasses.BaseActivity;
import com.example.project.R;

public class SettingActivity extends BaseActivity {
    Button buttonEscSettings ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        buttonEscSettings = findViewById(R.id.settingsEscBut);
        buttonEscSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingActivity.this, MenuActivity.class));
                SettingActivity.this.finish();
            }
        });
    }




    }
