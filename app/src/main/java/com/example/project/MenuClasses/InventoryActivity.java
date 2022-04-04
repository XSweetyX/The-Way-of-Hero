package com.example.project.MenuClasses;

import static com.example.project.GameClasses.Interface.Global.BOOKKEY;
import static com.example.project.GameClasses.Interface.Global.IMGKEY;
import static com.example.project.GameClasses.Interface.Global.PRICEKEY;
import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Interface.Global.randomize;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.project.GameClasses.Interface.Items;
import com.example.project.GameClasses.Interface.ResultActivity;
import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.R;

import java.util.ArrayList;
import java.util.HashMap;

public class InventoryActivity extends BaseActivity {
  //  private Items connector = new Items();








    //private ResultActivity resultActivity = new ResultActivity();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory);
        Button eskInventoryBut = findViewById(R.id.button6);
        ListView lvMain = (ListView) findViewById(R.id.inventory_list);
       // usableItems.add(connector.getItem());
        // находим список
        ///С помощью ключевого HashMap добавляем название (то что большими буквами), и описание (маленькими)
        /*
        hm = new HashMap<String, Object>();
        hm.put(IMGKEY, wizardbody1.getImgIndex()); //тут мы её добавляем для отображения
        hm.put(BOOKKEY, wizardbody1.getName());                 //Название
        hm.put(PRICEKEY, "hp: "+ wizardbody1.getHp());         //Описание


        myItems.add(hm);                            //Добавляем на форму для отображения, без этой функции мы не видим сам вью
        */

        // создаем адаптер
        SimpleAdapter adapter = new SimpleAdapter(this,
                global.itemStorage.myItems,
                R.layout.inventory_list_view, new String[]{ // массив названий
                IMGKEY,           //все поля нужно обозначить в этом списке
                BOOKKEY,         //верхний текст
                PRICEKEY,        //нижний теккт
        }, new int[]{    //массив форм
                R.id.listImageView1,        //все ссылки на поля нужно обозначить в этом списке
                R.id.the_name_of_item,      //наш id TextBox'a в list.xml
                R.id.about_item});    //ссылка на объект отображающий текст

        lvMain.setAdapter(adapter);                         //говорим программе что бы отображала все объекты




        eskInventoryBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InventoryActivity.this, MapActivity.class));
                InventoryActivity.this.onPause();
            }
        });


    }
}
