package com.example.project.GameClasses.Interface;

import static com.example.project.GameClasses.Interface.Global.BOOKKEY;
import static com.example.project.GameClasses.Interface.Global.IMGKEY;
import static com.example.project.GameClasses.Interface.Global.PRICEKEY;
import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Interface.Global.randomize;

import android.widget.Toast;

import com.example.project.R;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemStorage {




    public ArrayList<HashMap<String, Object>> myItems= new ArrayList<HashMap<String,Object>>();//создаем массив списков
    public HashMap<String, Object> hm = new HashMap<String, Object>();//список объектов


    public Items wizardbody1 = new Items("WizardBody1","1",2, R.drawable.darkwizardsuit,5,3,0,1000,1);
    public Items treestick = new Items("TreeStick","1",2, R.drawable.treestick,1,0,1000,2);

    public void addItem(int _res) {


            if (_res >= 50) {

                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, wizardbody1.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(BOOKKEY, wizardbody1.getName());                 //Название
                hm.put(PRICEKEY, "hp: " + wizardbody1.getHp());         //Описание


                myItems.add(hm);
                //Toast.makeText(getApplicationContext(), "Item wizardbody1 is put ", Toast.LENGTH_SHORT).show();


            }else if (_res <= 50) {

                hm = new HashMap<String, Object>();
                hm.put(IMGKEY, treestick.getImgIndex()); //тут мы её добавляем для отображения
                hm.put(BOOKKEY, treestick.getName());                 //Название
                hm.put(PRICEKEY, "hp: " + treestick.getHp());         //Описание


                myItems.add(hm);

            }


        }
    }

