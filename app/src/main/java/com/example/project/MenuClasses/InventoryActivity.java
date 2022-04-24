package com.example.project.MenuClasses;


import static com.example.project.GameClasses.Interface.Global.BITMAPKEY;
import static com.example.project.GameClasses.Interface.Global.DESCKEY;
import static com.example.project.GameClasses.Interface.Global.HPKEY;
import static com.example.project.GameClasses.Interface.Global.HPKEY1;
import static com.example.project.GameClasses.Interface.Global.IMGKEY;
import static com.example.project.GameClasses.Interface.Global.ITEMKEY;
import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Interface.Global.health;
import static com.example.project.GameClasses.Interface.Global.pDamage;
import static com.example.project.GameClasses.Interface.ItemStorage.hm;
import static com.example.project.GameClasses.Levels.LevelView.player;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.project.GameClasses.Levels.LevelMainActivity;
import com.example.project.R;

public class InventoryActivity extends BaseActivity {
  //  private Items connector = new Items();





    public static int secondHealth =10;

    //private ResultActivity resultActivity = new ResultActivity();


    public static int intParsed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        MediaPlayer m1Player = MediaPlayer.create(InventoryActivity.this, R.raw.mainsound);

        ImageView armorImage = findViewById(R.id.body_img);
        ImageView weaponImage = findViewById(R.id.weapon);
        ImageView shieldImage = findViewById(R.id.shield);
        ImageView bootsImage = findViewById(R.id.boots);
        ImageView helmetImage = findViewById(R.id.body_img);
        ImageView auraImage = findViewById(R.id.aura);
        ImageView ringImage = findViewById(R.id.ring);
        ImageView necklaceImage = findViewById(R.id.neck_chain);
        ImageView petImage = findViewById(R.id.pet);
        ImageView nlbg =findViewById(R.id.nlbg);
        ImageView hbg =findViewById(R.id.hbg);
        ImageView rbg =findViewById(R.id.rbg);
        ImageView sbg =findViewById(R.id.sbg);
        ImageView arbg =findViewById(R.id.arbg);
        ImageView wbg =findViewById(R.id.wbg);
        ImageView abg =findViewById(R.id.abg);
        ImageView bbg =findViewById(R.id.bbg);
        ImageView pbg =findViewById(R.id.pbg);


        nlbg.setVisibility(View.INVISIBLE);
        hbg.setVisibility(View.INVISIBLE);
        rbg.setVisibility(View.INVISIBLE);
        sbg.setVisibility(View.INVISIBLE);
        arbg.setVisibility(View.INVISIBLE);
        wbg.setVisibility(View.INVISIBLE);
        abg.setVisibility(View.INVISIBLE);
        bbg.setVisibility(View.INVISIBLE);
        pbg.setVisibility(View.INVISIBLE);

        Button eskInventoryBut = findViewById(R.id.button6);
        ListView lvMain = (ListView) findViewById(R.id.inventory_list);






        // создаем адаптер
        SimpleAdapter adapter = new SimpleAdapter(this,
                global.itemStorage.myItems,
                R.layout.inventory_list_view, new String[]{ // массив названий
                IMGKEY,           //все поля нужно обозначить в этом списке
                ITEMKEY,         //верхний текст
                HPKEY,        //нижний текст
        }, new int[]{    //массив форм
                R.id.listImageView1,        //все ссылки на поля нужно обозначить в этом списке
                R.id.the_name_of_item,      //наш id TextBox'a в list.xml
                R.id.about_item});    //ссылка на объект отображающий текст

        lvMain.setAdapter(adapter);                         //говорим программе что бы отображала все объекты


        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try{
                    if(hm.get(DESCKEY)=="1"){
                        //это зелья :ничего не пиши
                        // armorImage.setImageResource();
                        System.out.println("item is equiped");
                    }
                    if(hm.get(DESCKEY)=="2"){
                        hbg.setVisibility(View.VISIBLE);
                        global.playerItems.setPlayerItemsImages((int) hm.get(IMGKEY),1);
                        helmetImage.setImageResource((Integer) hm.get(IMGKEY));

                    }
                    if(hm.get(DESCKEY)=="3"){
                        arbg.setVisibility(View.VISIBLE);
                        global.playerItems.setPlayerItemsImages((int) hm.get(IMGKEY),2);
                        global.playerItems.setPlayerItemsBitmaps((Bitmap) hm.get(BITMAPKEY),2);
                        armorImage.setImageResource(global.playerItems.getItemOneImage(2));
                        int intParsed1 = Integer.parseInt (String.valueOf(hm.get(HPKEY1)));
                        health=intParsed1;
                        secondHealth =health;



                    }
                    if(hm.get(DESCKEY)=="4"){
                        wbg.setVisibility(View.VISIBLE);
                        global.playerItems.setPlayerItemsImages((int) hm.get(IMGKEY),3);//в хранилище предметов в ячейках инвентаря
                        global.playerItems.setPlayerItemsBitmaps((Bitmap) hm.get(BITMAPKEY),3);//в хранилище предметов для отображения на уровне
                        weaponImage.setImageResource(global.playerItems.getItemOneImage(3));
                        int intParsed2 = Integer.parseInt (String.valueOf(hm.get(HPKEY1)));
                        pDamage=intParsed2;



                    }
                    if(hm.get(DESCKEY)=="5"){
                        bbg.setVisibility(View.VISIBLE);
                        global.playerItems.setPlayerItemsImages((int) hm.get(IMGKEY),4);
                        bootsImage.setImageResource(global.playerItems.getItemOneImage(5));
                    }
                    if(hm.get(DESCKEY)=="6"){
                        rbg.setVisibility(View.VISIBLE);
                        global.playerItems.setPlayerItemsImages((int) hm.get(IMGKEY),5);
                        ringImage.setImageResource(global.playerItems.getItemOneImage(3));
                    }
                    if(hm.get(DESCKEY)=="7"){
                        nlbg.setVisibility(View.VISIBLE);
                        global.playerItems.setPlayerItemsImages((int) hm.get(IMGKEY),6);
                        necklaceImage.setImageResource(global.playerItems.getItemOneImage(7));
                    }
                    if(hm.get(DESCKEY)=="8"){
                        sbg.setVisibility(View.VISIBLE);
                        global.playerItems.setPlayerItemsImages((int) hm.get(IMGKEY),7);
                        shieldImage.setImageResource(global.playerItems.getItemOneImage(3));
                    }
                    if(hm.get(DESCKEY)=="9"){
                        pbg.setVisibility(View.VISIBLE);
                        global.playerItems.setPlayerItemsImages((int) hm.get(IMGKEY),8);
                        petImage.setImageResource(global.playerItems.getItemOneImage(3));
                    }
                    if(hm.get(DESCKEY)=="10"){
                        abg.setVisibility(View.VISIBLE);
                        global.playerItems.setPlayerItemsImages((int) hm.get(IMGKEY),0);
                        auraImage.setImageResource(global.playerItems.getItemOneImage(0));
                    }
                }catch (NullPointerException e){}
                m1Player.start();

            }
        });
        //global.playerItems.loadItems(hm);
        auraImage.setImageResource(global.playerItems.getItemOneImage(0));
        helmetImage.setImageResource(global.playerItems.getItemOneImage(1));
        armorImage.setImageResource(global.playerItems.getItemOneImage(2));// попробуй использовать это для уровня , одевать персонажа
        weaponImage.setImageResource(global.playerItems.getItemOneImage(3));
        bootsImage.setImageResource(global.playerItems.getItemOneImage(4));
        ringImage.setImageResource(global.playerItems.getItemOneImage(5));
        necklaceImage.setImageResource(global.playerItems.getItemOneImage(6));// попробуй использовать это для уровня , одевать персонажа
        shieldImage.setImageResource(global.playerItems.getItemOneImage(7));
        petImage.setImageResource(global.playerItems.getItemOneImage(8));// попробуй использовать это для уровня , одевать персонажа

       // armorImage.setImageResource((Integer) itemForListViewStorage.getItemResourse(0));//нужно привести тип Integer

        eskInventoryBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1Player.start();
                startActivity(new Intent(InventoryActivity.this, MapActivity.class));
                InventoryActivity.this.onPause();
            }
        });


    }

    @Override
    protected void onDestroy() {
        //global.playerItems.saveImagesInPlayer(hm);
        super.onDestroy();
    }
}
