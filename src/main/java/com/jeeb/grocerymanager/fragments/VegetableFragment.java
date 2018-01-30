package com.jeeb.grocerymanager.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import com.jeeb.grocerymanager.R;
import com.jeeb.grocerymanager.adapters.MeatPartAdapter;
import com.jeeb.grocerymanager.data.DataParser;
import com.jeeb.grocerymanager.databinding.FragmentBottomTabBinding;
import com.jeeb.grocerymanager.databinding.FragmentMyViewPagerBinding;

import java.util.ArrayList;

import static com.jeeb.grocerymanager.utils.AppUtils.*;

public class VegetableFragment extends Fragment {
        private ArrayList<String> mItems;
        private View rootView;
    private FragmentBottomTabBinding mBinding;

    public static VegetableFragment newInstance(){
        VegetableFragment fragment = new VegetableFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_bottom_tab, container, false);
        mBinding.vegetableFragment.setVisibility(View.VISIBLE);
        return mBinding.getRoot();
//       Bundle bundle= getArguments();
//       mItems = bundle.getStringArrayList(KEY_VEGETABLE);
//        DataParser mDataParser = new DataParser();
//        ArrayList<String> cleanBaked = mDataParser.manganedBackedItems(mItems,KEY_VEGETABLE);
//       MeatPartAdapter adapter = new MeatPartAdapter(getActivity().getLayoutInflater(),cleanBaked, mItems,R.mipmap.vegetable);
//       ListView lv = (ListView) rootView.findViewById(R.id.grocery_items);
//        lv.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
//       lv.setAdapter(adapter);

    }

}
