package com.example.project.GameClasses.Interface;


import static com.example.project.GameClasses.Interface.Global.BITMAPKEY;
import static com.example.project.GameClasses.Interface.Global.DESCKEY;
import static com.example.project.GameClasses.Interface.Global.HPKEY;
import static com.example.project.GameClasses.Interface.Global.HPKEY1;
import static com.example.project.GameClasses.Interface.Global.IMGKEY;
import static com.example.project.GameClasses.Interface.Global.ITEMKEY;

import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Interface.Global.randomize;
import static com.example.project.GameClasses.Levels.LevelThread.crimsonscytheBitmap;
import static com.example.project.GameClasses.Levels.LevelThread.goldenarmorBitmap;
import static com.example.project.GameClasses.Levels.LevelThread.ironarmorBitmap;
import static com.example.project.GameClasses.Levels.LevelThread.obsidiansword1Bitmap;
import static com.example.project.GameClasses.Levels.LevelThread.panBitmap;
import static com.example.project.GameClasses.Levels.LevelThread.slimearmorBitmap;
import static com.example.project.GameClasses.Levels.LevelThread.slimeswordBitmap;
import static com.example.project.GameClasses.Levels.LevelThread.treestickBitmap;
import static com.example.project.GameClasses.Levels.LevelThread.wizardbody1Bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Toast;

import com.example.project.GameClasses.Levels.LevelThread;
import com.example.project.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ItemStorage {




    public ArrayList<HashMap<String, Object>> myItems= new ArrayList<HashMap<String,Object>>();//создаем массив списков
    public static HashMap<String, Object> hm = new HashMap<String, Object>();//список объектов

    int randint=0;
    Random random = new Random();


    public Items wizardbody1 = new Items("Wizard Ьantle","3",2, R.drawable.darkwizardsuit,100,3,0,1000,1);
    public Items slimearmor = new Items("Slime armor","3",5, R.drawable.slimearmor,50,3,0,4500,2);
    public Items ironarmor = new Items("Iron armor","3",5, R.drawable.ironarmor,20,3,0,4500,3);
    public Items goldenarmor = new Items("Golden armor","3",5, R.drawable.goldenarmor,40,3,0,4500,4);

    public Items treestick = new Items("Tree Stick","4",2, R.drawable.treestick,1,0,1000,5);
    public Items pan = new Items("Pan","4",3, R.drawable.pan,4,0,1200,6);
    public Items slimesword = new Items("Slime Sword","4",4, R.drawable.slimesword,17,0,2000,7);
    public Items obsidiansword = new Items("Obsidian Sword","4",4, R.drawable.obsidiansword,23,0,2000,8);
    public Items crimsonscythe = new Items("Crimson Scuthe","4",5, R.drawable.crimsonscythe,30,0,4500,9);

    public Items darkring = new Items("Dark Ring","6",5, R.drawable.darkring,15,0,4500,10);
    public Items ametistring = new Items("Ametist Ring","6",5, R.drawable.ametistring,3,0,4500,11);
    public Items emeraldring = new Items("Emerald Ring","6",5, R.drawable.emeraldring,10,0,4500,12);
    public Items rubynring = new Items("Ruby Ring","6",5, R.drawable.rubinring,10,0,4500,13);

    public Items woodenshield = new Items("Wooden shield","8",5, R.drawable.shield,10,0,4500,14);


    //добавляем битмапы для отображения их в игровом окне (уровне)


    public void addItem(int _res) {

            //randint = random.nextInt(15 + 1);
            if (_res ==9) {


                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, wizardbody1.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(ITEMKEY, wizardbody1.getName());                 //Название
                hm.put(HPKEY, "hp: " + wizardbody1.getHp());         //Описание
                hm.put(HPKEY1,  wizardbody1.getHp());
                hm.put(DESCKEY,  wizardbody1.getDesc());
                hm.put(BITMAPKEY,  wizardbody1Bitmap);


                myItems.add(hm);
                //Toast.makeText(getApplicationContext(), "Item wizardbody1 is put ", Toast.LENGTH_SHORT).show();


            }else if (_res ==1) {

                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, treestick.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(ITEMKEY, treestick.getName());                 //Название
                hm.put(HPKEY, "dmg: " + treestick.getDmg());         //Описание
                hm.put(HPKEY1,  treestick.getDmg());
                hm.put(DESCKEY,  treestick.getDesc());
                hm.put(BITMAPKEY,  treestickBitmap);

                myItems.add(hm);

            }else if (_res ==2) {

                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, pan.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(ITEMKEY, pan.getName());                 //Название
                hm.put(HPKEY, "dmg: " + pan.getDmg());         //Описание
                hm.put(HPKEY1,  pan.getDmg());
                hm.put(DESCKEY,  pan.getDesc());
                hm.put(BITMAPKEY,  panBitmap);

                myItems.add(hm);

            }else if (_res ==3) {

                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, slimesword.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(ITEMKEY, slimesword.getName());                 //Название
                hm.put(HPKEY, "dmg: " + slimesword.getDmg());         //Описание
                hm.put(HPKEY1,  slimesword.getDmg());
                hm.put(DESCKEY,  slimesword.getDesc());
                hm.put(BITMAPKEY,  slimeswordBitmap);

                myItems.add(hm);

            }else if (_res ==4) {

                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, obsidiansword.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(ITEMKEY, obsidiansword.getName());                 //Название
                hm.put(HPKEY, "dmg: " + obsidiansword.getDmg());         //Описание
                hm.put(HPKEY1,  obsidiansword.getDmg());
                hm.put(DESCKEY,  obsidiansword.getDesc());
                hm.put(BITMAPKEY,  obsidiansword1Bitmap);

                myItems.add(hm);

            }else if (_res ==5) {

                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, crimsonscythe.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(ITEMKEY, crimsonscythe.getName());                 //Название
                hm.put(HPKEY, "dmg: " + crimsonscythe.getDmg());         //Описание
                hm.put(HPKEY1,  crimsonscythe.getDmg());
                hm.put(DESCKEY,  crimsonscythe.getDesc());
                hm.put(BITMAPKEY,  crimsonscytheBitmap);

                myItems.add(hm);

            }else if (_res ==6) {

                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, ironarmor.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(ITEMKEY, ironarmor.getName());                 //Название
                hm.put(HPKEY, "hp: " + ironarmor.getHp());         //Описание
                hm.put(HPKEY1,  ironarmor.getHp());
                hm.put(DESCKEY,  ironarmor.getDesc());
                hm.put(BITMAPKEY,  ironarmorBitmap);

                myItems.add(hm);

            }else if (_res ==7) {

                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, goldenarmor.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(ITEMKEY, goldenarmor.getName());                 //Название
                hm.put(HPKEY, "hp: " + goldenarmor.getHp());         //Описание
                hm.put(HPKEY1,  goldenarmor.getHp());
                hm.put(DESCKEY,  goldenarmor.getDesc());
                hm.put(BITMAPKEY,  goldenarmorBitmap);

                myItems.add(hm);

            }else if (_res ==8) {

                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, slimearmor.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(ITEMKEY, slimearmor.getName());                 //Название
                hm.put(HPKEY, "hp: " + slimearmor.getHp());         //Описание
                hm.put(HPKEY1,  slimearmor.getHp());
                hm.put(DESCKEY, slimearmor.getDesc());
                hm.put(BITMAPKEY, slimearmorBitmap);

                myItems.add(hm);

            }
















    }
    }

