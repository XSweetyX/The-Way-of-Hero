package com.example.project.GameClasses.Interface;

import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.MenuClasses.AttackOrganizer;
import com.example.project.MenuClasses.Organizer;
import com.example.project.R;

import java.util.ArrayList;
import java.util.HashMap;

public class Global {
    public static boolean randomize = false;

    public static final String BOOKKEY = "bookname";    // Главное название, большими буквами
    public static final String PRICEKEY = "bookprice";  // Наименование, то что ниже главного
    public static final String IMGKEY = "iconfromraw";  //Наша будущая картинка
    public ItemStorage itemStorage = new ItemStorage();
    public Organizer organizer = new Organizer();
    //public LevelMainActivity levelMainActivity = new LevelMainActivity();
    public AttackOrganizer attackOrganizer = new AttackOrganizer();
    public static Global global = new Global();
}
