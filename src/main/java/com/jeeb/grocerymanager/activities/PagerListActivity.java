package com.jeeb.grocerymanager.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.jeeb.grocerymanager.R;
import com.jeeb.grocerymanager.adapters.AdapterHelper;
import com.jeeb.grocerymanager.adapters.GroceryAdapter;
import com.jeeb.grocerymanager.adapters.HorizontalAdapter;
import com.jeeb.grocerymanager.databinding.ActivityMainBinding;
import com.jeeb.grocerymanager.databinding.ActivityPagerListBinding;
import com.jeeb.grocerymanager.databinding.ItemsPagerBinding;
import com.jeeb.grocerymanager.fragments.BeefFragment;
import com.jeeb.grocerymanager.model.Beef;

import java.util.ArrayList;
import java.util.List;

import static com.jeeb.grocerymanager.utils.AppUtils.KEY_BEEF;


public class PagerListActivity extends AppCompatActivity implements View.OnClickListener, HorizontalAdapter.CreateGroceryList{

    ArrayList<Fragment> fragments;
    ArrayList<String> pageItems;
    ArrayList<String> mCreatedGroceryList;
    HorizontalAdapter horizontalAdapter;
    ActivityPagerListBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageItems = new ArrayList<>();
        pageItems.add("First");
        pageItems.add("Second");
        pageItems.add("third");
        pageItems.add("Forth");
        pageItems.add("Fifth");
        pageItems.add("sixth");
        pageItems.add("seventh");
        pageItems.add("eight");
        pageItems.add("ninth");
        pageItems.add("tenth");
        pageItems.add("eleventh");
        pageItems.add("12");
        pageItems.add("13");
        pageItems.add("14");
        pageItems.add("15");
        pageItems.add("16");
        pageItems.add("18");
        mCreatedGroceryList = new ArrayList<>();
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_pager_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mBinding.pagerList.setLayoutManager(layoutManager);
        mBinding.pagerList.setHasFixedSize(true);
        AdapterForPager adpter = new AdapterForPager(pageItems);
        mBinding.pagerList.setAdapter(adpter);
        mBinding.btnCreateGroceryList.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (mCreatedGroceryList != null){
            Toast.makeText(this,"Created grocery list is not null",Toast.LENGTH_LONG).show();
//            launch Created grocery Activity
            Intent intent = new Intent(PagerListActivity.this, CreateGroceryListActivity.class);
            intent.putStringArrayListExtra("created grocery list",mCreatedGroceryList);
            startActivity(intent);
        }
    }

    @Override
    public void onCreatingGroceryList(String groceryList) {
        mCreatedGroceryList.add(groceryList);
    }

    public class AdapterForPager extends RecyclerView.Adapter<AdapterForPager.PagerViewHolder>{

        ArrayList<String> mItems;

        public AdapterForPager(ArrayList<String> items){
            mItems = items;
        }


        @Override
        public PagerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            return new PagerViewHolder(parent,viewType);
        }

        @Override
        public void onBindViewHolder(PagerViewHolder holder, int position) {
            horizontalAdapter = new HorizontalAdapter();
            horizontalAdapter.setRowPosition(position);
            horizontalAdapter.setCreateGroceryList(PagerListActivity.this);

            if (pageItems.get(position).equalsIgnoreCase("First")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmBeefs().getParts());
            }
            if (pageItems.get(position).equalsIgnoreCase("Second")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmLamb().getParts());
            }
            if (pageItems.get(position).equalsIgnoreCase("third")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmGoat().getParts());
            }

            if (pageItems.get(position).equalsIgnoreCase("Forth")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmPork().getParts());
            }
            if (pageItems.get(position).equalsIgnoreCase("Fifth")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmChick().getParts());
            }

            if (pageItems.get(position).equalsIgnoreCase("sixth")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmSeafood().getParts());
            }
            if (pageItems.get(position).equalsIgnoreCase("seventh")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmVegetable().getParts());
            }
            if (pageItems.get(position).equalsIgnoreCase("eight")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmFruit().getParts());
            }
            if (pageItems.get(position).equalsIgnoreCase("ninth")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmGrain().getParts());

            }
            if (pageItems.get(position).equalsIgnoreCase("tenth")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmDairy().getParts());

            }
            if (pageItems.get(position).equalsIgnoreCase("eleventh")) {
                horizontalAdapter.setData(AppSingleton.getInstance().getmBaked().getParts());
            }
            LinearLayoutManager layoutManager = new LinearLayoutManager(holder.itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);
            holder.binding.horizontalItemsRecyclView.setLayoutManager(layoutManager);
            holder.binding.horizontalItemsRecyclView.setAdapter(horizontalAdapter);
            holder.onBind(mItems);
        }

        @Override
        public int getItemCount() {
            return pageItems.size();
        }

        public class PagerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            private ItemsPagerBinding binding;
            private AdapterHelper adapterHelper;

            public PagerViewHolder(ViewGroup parent, int position) {

                super(LayoutInflater.from(parent.getContext()).inflate(R.layout.items_pager,parent,false));
                adapterHelper = new AdapterHelper(parent.getContext());
                binding = DataBindingUtil.bind(itemView);

            }

            @Override
            public void onClick(View view) {

            }


            public void onBind(ArrayList<String>myList) {

                adapterHelper.bindTitle(binding.titleInner,myList,getAdapterPosition());
            }


        }
    }
}
