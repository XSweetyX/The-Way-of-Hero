package com.example.project.GameClasses.GameBackend;

import android.app.Application;
import android.content.Context;

public class YourApplication extends Application {

    private static YourApplication instance;

    public YourApplication() {
        instance = this;
    }

    public static Context getContext() {
        return instance;
    }
}
