package com.example.project.GameClasses.Interface;

import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.MenuClasses.MapActivity;

public class FogofWarLogistic {


    int[] levelsStorage = new int[]{1,0,0,0,0,0,0,0,0,0};

    public FogofWarLogistic(){





    }
    public void setLevelsStorage(int index,int number_){
        levelsStorage[index] = number_;
    }
    public int getLevelsStorageInfo(int index_){
        return levelsStorage[index_];
    }


}
