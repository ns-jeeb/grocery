package com.jeeb.grocerymanager.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;
import com.jeeb.grocerymanager.R;
import com.jeeb.grocerymanager.fragments.DairyFragment;
import com.jeeb.grocerymanager.fragments.GrainFragment;
import com.jeeb.grocerymanager.fragments.VegetableFragment;

public class SecondActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        FragmentManager fm = getSupportFragmentManager();
        Fragment ff = new GrainFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container,ff);
        ft.commit();



//        TextView txtSecondActivity = (TextView) findViewById(R.id.txt_second_activity);
//        EditText editNewDataTxt = (EditText)findViewById(R.id.ed_tat_new_data_enter);
//        Button btnSubmit = (Button)findViewById(R.id.btn_submit);
//        Intent intent = getIntent();
//       final String intenData = intent.getExtras().getString("Name");
//        txtSecondActivity.setText(intenData);
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), MainActivity.class);
//                i.putExtra("Name",intenData);
//                startActivity(i);
//            }
//        });

//        AHBottomNavigation bottomNavigation = findViewById(R.id.bottom_navigation);
//
////        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.tab_1, R.drawable.ic_check, R.color.common_google_signin_btn_text_dark);
////        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.tab_2, R.drawable.ic_search_black_24dp, R.color.red);
////        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.default_item_1, R.drawable.bottom_nav_space, R.color.blue);
////        AHBottomNavigationItem item4 = new AHBottomNavigationItem(R.string.tab_5, R.drawable.ic_maps_local_bar, R.color.blue);
////        AHBottomNavigationItem item5 = new AHBottomNavigationItem(R.string.tab_5, R.drawable.ic_maps_place, R.color.blue);
//        AHBottomNavigationAdapter navigationAdapter = new AHBottomNavigationAdapter(this, R.menu.navigation_bottom_view);
////        int tabColor = Color.parseColor("#FFFFFFFF");
//        navigationAdapter.setupWithBottomNavigation(bottomNavigation);
//
////        bottomNavigation.addItem(item1);
////        bottomNavigation.addItem(item2);
////        bottomNavigation.addItem(item3);
////        bottomNavigation.addItem(item4);
////        bottomNavigation.addItem(item5);
//
//        FloatingActionButton floatingActionMenu = (FloatingActionButton) findViewById(R.id.floating_action_button);
//        bottomNavigation.manageFloatingActionButtonBehavior(floatingActionMenu);
//
//        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#373C42"));
////        bottomNavigation.setBehaviorTranslationEnabled(false);
//        bottomNavigation.setInactiveColor(Color.parseColor("#FFFFFFFF"));
//        bottomNavigation.setAccentColor(Color.parseColor("#F63D2B"));
////        bottomNavigation.setColored(true);
//        AHNotification notification = new AHNotification.Builder()
//                .setText("8")
//                .setBackgroundColor(ContextCompat.getColor(SecondActivity.this, R.color.blue))
//                .setTextColor(ContextCompat.getColor(SecondActivity.this, R.color.white))
//                .build();
//        bottomNavigation.setNotification(notification, 1);
//
////        bottomNavigation.enableItemAtPosition(2);
////        bottomNavigation.disableItemAtPosition(2);
////        bottomNavigation.setItemDisableColor(Color.parseColor("#FFFFFFFF"));
//
////        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.SHOW_WHEN_ACTIVE);
////        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
////        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_HIDE);
////        bottomNavigation.getItem(1).setTitle(R.string.tab_1);
////        bottomNavigation.setForceTint(true);
//
//        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
//            @Override
//            public boolean onTabSelected(int position, boolean wasSelected) {
//                        Fragment selectedFragment = null;
//                        switch (position) {
//                            case 0:
//                                selectedFragment = GrainFragment.newInstance();
//                                break;
//                            case 1:
//                                selectedFragment = DairyFragment.newInstance();
//                                break;
//                            case 2:
//                                selectedFragment = VegetableFragment.newInstance();
//                                break;
//                            default:
//                                return false;
//                        }
//                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                        transaction.replace(R.id.container, selectedFragment);
//                        transaction.commit();
//                        return false;
//                    }
//                });
//
//        //Manually displaying the first fragment - one time only
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.container, GrainFragment.newInstance());
//        transaction.commit();

        //Used to select an item programmatically
        //bottomNavigationView.getMenu().getItem(2).setChecked(true);
    }

}
