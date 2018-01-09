package com.jeeb.grocerymanager.fragments;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ListView;

import static com.jeeb.grocerymanager.utils.AppUtils.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.jeeb.grocerymanager.R;
import com.jeeb.grocerymanager.activities.AppSingleton;
import com.jeeb.grocerymanager.activities.MainActivity;
import com.jeeb.grocerymanager.activities.PagerListActivity;
import com.jeeb.grocerymanager.adapters.MeatPartAdapter;
import com.jeeb.grocerymanager.adapters.MeatRecyclerView;
import com.jeeb.grocerymanager.data.DataParser;
import com.jeeb.grocerymanager.databinding.Fragment1MyViewPagerBinding;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class BeefFragment extends Fragment {
    protected View rootView;
    private ArrayList<String> mItems;
    private DataParser mDataParser = new DataParser();
    protected ArrayList<String>cleanedTexts;
    protected ListView mListView;
//    protected MeatPartAdapter mAdapter;
    protected MeatRecyclerView mAdapter;
    private RecyclerView rcylerView;
    private Fragment1MyViewPagerBinding binding;

    public BeefFragment() {
    }
//    @Override
//    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
//        mItems = getArguments().getStringArrayList(KEY_BEEF);
//        rootView = inflater.inflate(R.layout.fragment_my_view_pager, container, false);
//        cleanedTexts = mDataParser.manganedBackedItems(mItems,KEY_BEEF);
//        mAdapter = new MeatPartAdapter(getActivity().getLayoutInflater(),cleanedTexts, mItems,R.mipmap.beef);
//        mListView = (ListView) rootView.findViewById(R.id.grocery_items);
//        mListView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
//
//        mListView.setAdapter(mAdapter);
//        return rootView;
//    }
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment1_my_view_pager, container, false);
//        mItems = getArguments().getStringArrayList("GroceryList");
//        cleanedTexts = mDataParser.manganedBackedItems(mItems,KEY_BEEF);
//        mAdapter = new MeatRecyclerView(cleanedTexts, mItems,R.mipmap.beef);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
//        binding.groceryItems.setLayoutManager(layoutManager);
//
//        binding.groceryItems.setAdapter(mAdapter);

        return binding.getRoot();
    }


}
