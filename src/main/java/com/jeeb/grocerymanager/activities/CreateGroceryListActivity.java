package com.jeeb.grocerymanager.activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jeeb.grocerymanager.R;
import com.jeeb.grocerymanager.fragments.BakedFragment;

import java.util.ArrayList;

public class CreateGroceryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_grocery_list);
        Intent intent = getIntent();
        ArrayList<String> createdGroList = intent.getStringArrayListExtra("created grocery list");
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("created grocery list",createdGroList);
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.container_created);

        if (fragment == null){
            fragment = new BakedFragment();
            fragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(R.id.container_created, fragment).commit();
        }

    }
}
