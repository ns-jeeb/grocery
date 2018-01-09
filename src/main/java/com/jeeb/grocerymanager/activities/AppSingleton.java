package com.jeeb.grocerymanager.activities;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.jeeb.grocerymanager.model.Baked;
import com.jeeb.grocerymanager.model.Beef;
import com.jeeb.grocerymanager.Base.Grocery;
import com.jeeb.grocerymanager.model.Chicken;
import com.jeeb.grocerymanager.model.Dairy;
import com.jeeb.grocerymanager.model.Fruit;
import com.jeeb.grocerymanager.model.Goat;
import com.jeeb.grocerymanager.model.Grain;
import com.jeeb.grocerymanager.model.Lamb;
import com.jeeb.grocerymanager.model.Pork;
import com.jeeb.grocerymanager.model.Seafood;
import com.jeeb.grocerymanager.model.Vegetable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeeb on 11/30/2015.
 */
public class AppSingleton extends Application {

    private Grocery mGrocery;
    private static AppSingleton sInstance;
    private RequestQueue mRequestQueue;
    private ArrayList<String> mGroceryList;


    private Beef mBeefs;
    private Baked     mBaked    ;
    private Chicken   mChick    ;
    private Goat      mGoat     ;
    private Lamb      mLamb     ;
    private Pork      mPork     ;
    private Seafood   mSeafood  ;
    private Vegetable mVegetable;
    private Fruit     mFruit    ;
    private Grain     mGrain    ;
    private Dairy     mDairy    ;


    @Override
    public void onCreate() {
        super.onCreate();
        mBeefs = new Beef();
        mBaked = new Baked();
        mChick = new Chicken();
        mGoat = new Goat();
        mLamb = new Lamb();
        mPork = new Pork();
        mSeafood = new Seafood();
        mVegetable = new Vegetable();
        mFruit = new Fruit();
        mGrain = new Grain();
        mDairy = new Dairy();
        mRequestQueue = Volley.newRequestQueue(this);
        mGroceryList = new ArrayList<>();
        sInstance = this;
    }

    public synchronized static AppSingleton getInstance() {
        return sInstance;
    }

    public Grocery getGrocery() {
        return mGrocery;
    }

    public void setGrocery(Grocery grocery) {
        mGrocery = grocery;
    }

    public RequestQueue getRequestQueue() {
        return mRequestQueue;
    }

    public ArrayList<String> getGroceryList() {
        return mGroceryList;
    }

    public void setGroceryList(ArrayList<String> groceryList) {
        mGroceryList = groceryList;
    }

    public void addItemToGroceryList(String item){
        if (mGroceryList.contains(item)){
            return;
        }
        mGroceryList.add(item);
    }

    public void removeItemFromGroceryList(String item) {
        mGroceryList.remove(item);
    }

    public Beef getmBeefs() {
        return mBeefs;
    }

    public void setmBeefs(Beef mBeefs) {
        this.mBeefs = mBeefs;
    }

    public Baked getmBaked() {
        return mBaked;
    }

    public void setmBaked(Baked mBaked) {
        this.mBaked = mBaked;
    }

    public Chicken getmChick() {
        return mChick;
    }

    public void setmChick(Chicken mChick) {
        this.mChick = mChick;
    }

    public Goat getmGoat() {
        return mGoat;
    }

    public void setmGoat(Goat mGoat) {
        this.mGoat = mGoat;
    }

    public Lamb getmLamb() {
        return mLamb;
    }

    public void setmLamb(Lamb mLamb) {
        this.mLamb = mLamb;
    }

    public Pork getmPork() {
        return mPork;
    }

    public void setmPork(Pork mPork) {
        this.mPork = mPork;
    }

    public Seafood getmSeafood() {
        return mSeafood;
    }

    public void setmSeafood(Seafood mSeafood) {
        this.mSeafood = mSeafood;
    }

    public Vegetable getmVegetable() {
        return mVegetable;
    }

    public void setmVegetable(Vegetable mVegetable) {
        this.mVegetable = mVegetable;
    }

    public Fruit getmFruit() {
        return mFruit;
    }

    public void setmFruit(Fruit mFruit) {
        this.mFruit = mFruit;
    }

    public Grain getmGrain() {
        return mGrain;
    }

    public void setmGrain(Grain mGrain) {
        this.mGrain = mGrain;
    }

    public Dairy getmDairy() {
        return mDairy;
    }

    public void setmDairy(Dairy mDairy) {
        this.mDairy = mDairy;
    }
}
