package com.example.project.GameClasses.Interface;

import com.example.project.GameClasses.Levels.LevelMainActivity;

public class FogofWarLogistic {
    int[] levelsStorage = new int[]{1,0,0,0,0,0,0,0,0,0};
    public boolean level1IsCompleted;
    public boolean level2IsCompleted;
    public boolean level3IsCompleted;
    public boolean level4IsCompleted;
    public boolean level5IsCompleted;
    public boolean level6IsCompleted;
    public boolean level7IsCompleted;
    public boolean level8IsCompleted;
    public boolean level9IsCompleted;
    public boolean level10IsCompleted;
    public FogofWarLogistic(){

        if(level1IsCompleted){
            levelsStorage[1]=1;
            System.out.println("level 2 is opened");
        }else{

        }
        if(level2IsCompleted){
            levelsStorage[2]=1;
        }
        if(level3IsCompleted){
            levelsStorage[3]=1;
        }
        if(level4IsCompleted){
            levelsStorage[4]=1;
        }
        if(level5IsCompleted){
            levelsStorage[5]=1;
        }
        if(level6IsCompleted){
            levelsStorage[6]=1;
        }
        if(level7IsCompleted){
            levelsStorage[7]=1;
        }
        if(level8IsCompleted){
            levelsStorage[8]=1;
        }
        if(level9IsCompleted){
            levelsStorage[9]=1;
        }
    }
}
