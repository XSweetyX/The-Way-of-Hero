package com.example.project.GameClasses.Interface;


import static com.example.project.GameClasses.Interface.Global.BOOKKEY;
import static com.example.project.GameClasses.Interface.Global.IMGKEY;
import static com.example.project.GameClasses.Interface.Global.PRICEKEY;
import static com.example.project.GameClasses.Interface.Global.global;
import static com.example.project.GameClasses.Interface.Global.randomize;

import android.graphics.Bitmap;
import android.widget.Toast;

import com.example.project.R;

import java.util.HashMap;

/**
 * An Item is held by an inventory slot and can be one of:
 * - potion (restores current hp)
 * - equip (several categories of equips)
 * - misc (some other useless thing)
 *
 * @author Ming Li
 */
public class Items {


    // id
    public String name;
    // name displayed on tooltip
    public String labelName;
    // for rendering onto tooltip
    public String desc;
    // type of item
    /**
     * 0 - potion
     * 1 - misc
     * 2 - helmet
     * 3 - armor
     * 4 - weapon
     * 5 - gloves
     * 6 - shoes
     * 7 - necklace
     * 8 - shield
     * 9 - ring
     * 10 - enchant scroll
     */
    public int type;

    /**
     * items are weighted with rarity meaning
     * different likelihoods to drop
     * 0 - common (60% chance out of all items)
     * 1 - rare (25% chance)
     * 2 - epic (10% chance)
     * 3 - legendary (5% chance)
     */
    public int rarity;

    // the range of enemy levels that can drop this item
    public int minLevel;
    public int maxLevel;
    private int max = 3;
    // item stats
    // if hp is negative then its absolute value is the percentage hp that the item gives
    // used to separate percentage hp from regular hp potions
    public int hp = 0;
    public int armor = 0;
    public int dmg = 0;
    public int sell = 0;
    // potions can give exp (percentage)
    public int exp = 0;

    // an item's index in the inventory
    public int index;
    // whether or not this item is equipped
    public boolean equipped = false;
    // the number of successful enchants on the item
    public int enchants = 0;
    public int enchantCost;
    // percentage bonus enchant chance from scrolls
    public int bonusEnchantChance = 0;
    // for enchant scrolls representing the bonus enchant percentage that the scroll gives
    public int eChance = 0;

    // rendering
    public Bitmap bitmap;
    public int imgIndex; //R.drawable. ...

    //public Items item = new Items();
    //ошибка!
    public Items() {

    }

    public Items(String name, String desc, int rarity, int imgIndex, int hp, int armor, int exp, int sell, int index) {
        this.name = name;
        this.armor = armor;
        this.desc = desc;
        this.rarity = rarity;
        this.imgIndex = imgIndex;
        //this.minLevel = minLevel;
        // this.maxLevel = maxLevel;
        this.hp = hp;
        this.exp = exp;
        this.sell = sell;
        type = 0;
        labelName = name;
        this.index = index;
        //this.bitmap = bitmap_;


    }

    public Items(String name, String desc, int rarity, int imgIndex, int dmg, int exp, int sell, int index) {
        this.name = name;
        this.desc = desc;
        this.rarity = rarity;
        this.imgIndex = imgIndex;
        //this.minLevel = minLevel;
        // this.maxLevel = maxLevel;
        this.dmg = dmg;
        this.hp = hp;
        this.exp = exp;
        this.sell = sell;
        type = 0;
        labelName = name;
        this.index = index;
        //this.bitmap = bitmap_;


    }

    /*
    public Items(){

    }

     */
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getImgIndex() {
        return imgIndex;
    }
    /*
    public Items getItem(){
        item.DropItem();
        return item;
    }

     */
    //Переделай bitmap на bitmap image


    //public Items[] mainValue = new Items[]{wizardbody1,treestick};//общий массив

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getEnchants() {
        return enchants;
    }

    public void setEnchants(int enchants) {
        this.enchants = enchants;
    }
    /*
    public Items getMainValue(int index){
        this.index = index;
        return mainValue[index];
    }

     */

    //_________________________________


}