package com.jeeb.grocerymanager.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import com.jeeb.grocerymanager.R;
import com.jeeb.grocerymanager.activities.SpannedGridLayoutManager;
import com.jeeb.grocerymanager.adapters.AdapterHelper;
import com.jeeb.grocerymanager.adapters.MeatPartAdapter;
import com.jeeb.grocerymanager.data.DataParser;
import com.jeeb.grocerymanager.databinding.FragmentBottomTabBinding;
import com.jeeb.grocerymanager.databinding.FragmentMyViewPagerBinding;
import com.jeeb.grocerymanager.databinding.ItemsPagerBinding;

import java.util.ArrayList;
import java.util.List;

import static com.jeeb.grocerymanager.utils.AppUtils.*;

public class GrainFragment extends Fragment {
        private ArrayList<String> mItems;
        private View rootView;
        private FragmentBottomTabBinding mBinding;


    public static GrainFragment newInstance() {
        GrainFragment fragment = new GrainFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_bottom_tab, container, false);
//        mBinding.grainFragment.setVisibility(View.VISIBLE);
        ArrayList<Integer> integers= new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);

//        Bundle bundle = getArguments();
//        mItems = bundle.getStringArrayList(KEY_GRAIN);
//        DataParser mDataParser = new DataParser();
//        ArrayList<String>cleanedTexts = mDataParser.manganedBackedItems(mItems,KEY_GRAIN);
//        MeatPartAdapter adapter = new MeatPartAdapter(getActivity().getLayoutInflater(),cleanedTexts, mItems,R.mipmap.whole_grains);
//        ListView lv = (ListView) rootView.findViewById(R.id.grocery_items);
//        lv.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
//        lv.setAdapter(adapter);
        Adapter adapter = new Adapter(integers);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mBinding.recyclerView.setAdapter(adapter);
        mBinding.recyclerView.setLayoutManager(new SpannedGridLayoutManager(new SpannedGridLayoutManager.GridSpanLookup() {
                    @Override
                    public SpannedGridLayoutManager.SpanInfo getSpanInfo(int position) {
                        if (position % 6 == 0 || position % 6 == 4) {
                            return new SpannedGridLayoutManager.SpanInfo(2, 2);
                        } else {
                            return new SpannedGridLayoutManager.SpanInfo(1, 1);
                        }
                    }
                },3 ,1f ));
        return mBinding.getRoot();
    }


    public class Adapter extends RecyclerView.Adapter<IntegerViewHolder> {

        private final ArrayList<Integer> mIntegers;

        public Adapter(ArrayList<Integer> integers){
            mIntegers = integers;
        }

//        @Override
//        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            return new IntegerViewHolder(parent);
//        }

        @Override
        public IntegerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new IntegerViewHolder(parent);
        }

        @Override
        public void onBindViewHolder(IntegerViewHolder holder, int position) {
            holder.binding.titleInner.setText(mIntegers.get(position).toString());
        }


        @Override
        public int getItemCount() {
            return mIntegers.size();
        }
    }

    public class IntegerViewHolder extends RecyclerView.ViewHolder {
        public ItemsPagerBinding binding;
        AdapterHelper adapterHelper;
        public IntegerViewHolder(ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(R.layout.items_pager,parent,false));
            adapterHelper = new AdapterHelper(parent.getContext());
            binding = DataBindingUtil.bind(itemView);


        }
    }


}
