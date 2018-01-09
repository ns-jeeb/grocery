package com.jeeb.grocerymanager.Base;

import com.jeeb.grocerymanager.model.Beef;
import com.jeeb.grocerymanager.model.Lamb;
import com.jeeb.grocerymanager.model.Goat;
import com.jeeb.grocerymanager.model.Pork;
import com.jeeb.grocerymanager.model.Chicken;
import com.jeeb.grocerymanager.model.Seafood;
import com.jeeb.grocerymanager.model.Vegetable;
import com.jeeb.grocerymanager.model.Fruit;
import com.jeeb.grocerymanager.model.Grain;
import com.jeeb.grocerymanager.model.Dairy;
import com.jeeb.grocerymanager.model.Baked;

import java.util.ArrayList;

/**
 * Created by Jeeb on 12/25/2017.
 */

public class Grocery {

    private Beef Beef;
    private Lamb Lamb;
    private Goat Goat;
    private Pork Pork;
    private Chicken Chicken;
    private Seafood Seafood;
    private Vegetable Vegetable;
    private Fruit Fruit;
    private Grain Grain;
    private Dairy Dairy;
    private Baked Baked;
    ArrayList<String>title;

    public ArrayList<String> getTitle() {
        return title;
    }

    public void setTitle(ArrayList<String> title) {
        this.title = title;
    }

    public Grocery(){

    }

    public Beef getBeef() {
        return Beef;
    }

    public void setBeef(com.jeeb.grocerymanager.model.Beef beef) {
        Beef = beef;
    }

    public com.jeeb.grocerymanager.model.Lamb getLamb() {
        return Lamb;
    }

    public void setLamb(com.jeeb.grocerymanager.model.Lamb lamb) {
        Lamb = lamb;
    }

    public com.jeeb.grocerymanager.model.Goat getGoat() {
        return Goat;
    }

    public void setGoat(com.jeeb.grocerymanager.model.Goat goat) {
        Goat = goat;
    }

    public com.jeeb.grocerymanager.model.Pork getPork() {
        return Pork;
    }

    public void setPork(com.jeeb.grocerymanager.model.Pork pork) {
        Pork = pork;
    }

    public com.jeeb.grocerymanager.model.Chicken getChicken() {
        return Chicken;
    }

    public void setChicken(com.jeeb.grocerymanager.model.Chicken chicken) {
        Chicken = chicken;
    }

    public com.jeeb.grocerymanager.model.Seafood getSeafood() {
        return Seafood;
    }

    public void setSeafood(com.jeeb.grocerymanager.model.Seafood seafood) {
        Seafood = seafood;
    }

    public com.jeeb.grocerymanager.model.Vegetable getVegetable() {
        return Vegetable;
    }

    public void setVegetable(com.jeeb.grocerymanager.model.Vegetable vegetable) {
        Vegetable = vegetable;
    }

    public com.jeeb.grocerymanager.model.Fruit getFruit() {
        return Fruit;
    }

    public void setFruit(com.jeeb.grocerymanager.model.Fruit fruit) {
        Fruit = fruit;
    }

    public com.jeeb.grocerymanager.model.Grain getGrain() {
        return Grain;
    }

    public void setGrain(com.jeeb.grocerymanager.model.Grain grain) {
        Grain = grain;
    }

    public com.jeeb.grocerymanager.model.Dairy getDairy() {
        return Dairy;
    }

    public void setDairy(com.jeeb.grocerymanager.model.Dairy dairy) {
        Dairy = dairy;
    }

    public com.jeeb.grocerymanager.model.Baked getBaked() {
        return Baked;
    }

    public void setBaked(com.jeeb.grocerymanager.model.Baked baked) {
        Baked = baked;
    }
}
