package com.example.project.GameClasses.Interface;

import static com.example.project.GameClasses.Interface.ItemStorage.hm;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PlayerItems {
    int[] playerItemsImages = new int[9];
    Bitmap[] playerItemsBitmaps = new Bitmap[9];

    public void saveImagesInPlayer(HashMap _hm){
        int k=0;
        // Получаем вид элементов
        Set set = _hm.entrySet();

        // Получаем итератор
        Iterator i = set.iterator();
        // Отображаем элементы
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();

            playerItemsImages[k]= (int) me.getKey();
            k++;


           // System.out.println(me.getValue());

        }
    }
    public int getItemOneImage(int _i){
        return playerItemsImages[_i];
    }


    public Bitmap getItemOneBitmap(int _i){
        return  playerItemsBitmaps[_i];
    }
    public void setPlayerItemsBitmaps(Bitmap _i1,int _i2){
        playerItemsBitmaps[_i2]=_i1;
    }

    public void setPlayerItemsImages(int _i1,int _i2){
        playerItemsImages[_i2]=_i1;
    }
    public void loadItems(HashMap _hm) {
        Set set = _hm.entrySet();

        // Получаем итератор
        Iterator i = set.iterator();
        // Отображаем элементы
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();

            for (int y = 0; y < playerItemsImages.length; y++) {
                me.setValue(playerItemsImages[y]);

            }
        }
    }
}
