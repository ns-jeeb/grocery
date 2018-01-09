package com.jeeb.grocerymanager.adapters;

import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by najeebsakhizada on 2017-12-19.
 */

public class AdapterHelper {

    protected Context mContext;
    public AdapterHelper(Context context){
        mContext = context;
    }
    public void bindTitle(TextView textView, ArrayList<String> mylist,int posistion) {

        if (mylist == null) {
            return;
        }
        if (textView == null) {
            return;
        }

        textView.setText(mylist.get(posistion));
    }
}
