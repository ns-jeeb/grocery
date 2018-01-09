package com.jeeb.grocerymanager.model;

import com.jeeb.grocerymanager.Base.Meat;

import java.util.ArrayList;

/**
 * Created by Jeeb on 3/24/2016.
 */
public class Seafood extends Meat{
    private String mDescription;

    private ArrayList<String> Parts;

    public ArrayList<String> getParts() {
        return Parts;
    }

    public void setParts(ArrayList<String> parts) {
        Parts = parts;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
