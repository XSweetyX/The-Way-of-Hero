package com.example.project.GameClasses.Interface;

import android.content.Context;

public class App {
    public   Context context;

    public void setContext(Context cntxt) {
        context = cntxt;
    }
    public Context getAppMainContext(){
        return context;
    }
}
