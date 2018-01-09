package com.jeeb.grocerymanager.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.jeeb.grocerymanager.utils.AppUtils.*;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.jeeb.grocerymanager.databinding.ActivityMainBinding;
import com.jeeb.grocerymanager.fragments.BeefFragment;
import com.jeeb.grocerymanager.fragments.ChickenFragment;
import com.jeeb.grocerymanager.fragments.GoatFragment;
import com.jeeb.grocerymanager.fragments.PorkFragment;
import com.jeeb.grocerymanager.fragments.SeafoodFragment;
import com.jeeb.grocerymanager.fragments.VegetableFragment;
import com.jeeb.grocerymanager.data.DataParser;
import com.jeeb.grocerymanager.R;
import com.jeeb.grocerymanager.fragments.LambFragment;
import com.jeeb.grocerymanager.model.Beef;
import com.jeeb.grocerymanager.Base.Grocery;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DataParser mDataParser;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        String url = "https://api.mongolab.com/api/1/databases/grocery/collections/food/?apiKey=LcybTMW4H3ULBfJsl-ai7lrc1TwOR0U7";
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                mDataParser = new DataParser();
                mDataParser.gorceryItems(response);
                createdView();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        AppSingleton.getInstance().getRequestQueue().add(jsonArrayRequest);
    }
    public void createdView(){
        final ArrayList<String>list = AppSingleton.getInstance().getGroceryList();
        binding.tsTxt.setText(list.toString());
        mDataParser.saveData(getApplicationContext(),AppSingleton.getInstance().getGroceryList(),KEY_FILE);

        binding.btnCreateList.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(MainActivity.this, PagerListActivity.class);
            startActivity(intent);
        }
    });


    }

}
