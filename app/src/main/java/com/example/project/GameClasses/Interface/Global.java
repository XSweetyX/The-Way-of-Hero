package com.example.project.GameClasses.Interface;

import android.content.res.Resources;

import com.example.project.GameClasses.Entities.Enemies.MegaDog;
import com.example.project.GameClasses.Entities.Enemies.Slime;
import com.example.project.GameClasses.Entities.Enemies.StrangeCat;
import com.example.project.GameClasses.Entities.Enemies.Zombie;
import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.GameClasses.Levels.LevelThread;
import com.example.project.MenuClasses.AttackOrganizer;
import com.example.project.MenuClasses.Organizer;
import com.example.project.R;

import java.util.ArrayList;
import java.util.HashMap;

public class Global {
    public Slime slime;
    public  Zombie zombie;
    public  StrangeCat strangeCat;
    public  MegaDog megaDog;
    public int nextLevel;
    public static boolean randomize = false;
    public static final String ITEMKEY = "itemname";    // Главное название, большими буквами
    public static final String HPKEY = "itemhp";  // Наименование, то что ниже главного
    public static final String IMGKEY = "iconfromraw";  //Наша будущая картинка
    public static final String DESCKEY ="itemdesc" ;//тип предмета
    public static final String BITMAPKEY ="itembitmap" ;//bitmap предмета
    public ItemStorage itemStorage = new ItemStorage();
    public Organizer organizer = new Organizer();


    //public LevelMainActivity levelMainActivity = new LevelMainActivity();
    public AttackOrganizer attackOrganizer = new AttackOrganizer();
    public PlayerItems playerItems =new  PlayerItems();
    public static Global global = new Global();
}
