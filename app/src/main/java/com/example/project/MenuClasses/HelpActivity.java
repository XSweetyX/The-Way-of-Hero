package com.example.project.MenuClasses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project.MenuClasses.BaseActivity;
import com.example.project.R;

public class HelpActivity extends BaseActivity {
    Button buttonEscHelp ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        buttonEscHelp = findViewById(R.id.helpEscapeBut);
        buttonEscHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelpActivity.this, MenuActivity.class));
                HelpActivity.this.finish();
            }
        });

    }





    }
