package com.example.project.MenuClasses;

import com.example.project.GameClasses.Entities.Player;

public class Organizer {
    //public MapActivity mapActivity =new MapActivity();
    public int currentLevel=0;
    public  int getCurrentlevel(){
        return currentLevel;
    }
    public void setCurrentLevel(int number){
        currentLevel = number;
    }
}
