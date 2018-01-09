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
import android.widget.Toast;

import com.jeeb.grocerymanager.R;
import com.jeeb.grocerymanager.adapters.MeatPartAdapter;
import com.jeeb.grocerymanager.data.DataParser;
import com.jeeb.grocerymanager.databinding.CreatedItemsBinding;
import com.jeeb.grocerymanager.databinding.FragmentMyViewPagerBinding;
import com.jeeb.grocerymanager.databinding.ItemsBinding;

import java.util.ArrayList;

import static com.jeeb.grocerymanager.utils.AppUtils.*;

public class BakedFragment extends Fragment {
    private ArrayList<String> mItems;
    private View rootView;
    private DataParser mDataParser = new DataParser();
    private FragmentMyViewPagerBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//        rootView = inflater.inflate(R.layout.fragment_my_view_pager, container, false);
        Bundle bundle = getArguments();
        mItems = bundle.getStringArrayList("created grocery list");
        ArrayList<String>cleanBaked = mDataParser.manganedBackedItems( mItems,KEY_BREAD+" ");

        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_my_view_pager, container, false);

        CreatedGroceryListAdapter createdGroceryListAdapter = new CreatedGroceryListAdapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        mBinding.createdGroceryList.setLayoutManager(layoutManager);
        mBinding.createdGroceryList.setAdapter(createdGroceryListAdapter);
        return mBinding.getRoot();

    }

    public class CreatedGroceryListAdapter extends RecyclerView.Adapter<CreatedGroceryListAdapter.CreatedGroceryViewHolder>  implements View.OnClickListener {
        CreatedGroceryViewHolder mHolder;

        @Override
        public CreatedGroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            mHolder = new CreatedGroceryViewHolder(parent);
            return mHolder;
        }

        @Override
        public void onBindViewHolder(CreatedGroceryViewHolder holder, int position) {
            holder.itemsBinding.txtGrocItemPicked.setText(mItems.get(position));
            holder.itemsBinding.chbItemPicked.setOnClickListener(this);
        }

        @Override
        public int getItemCount() {
            if (mItems != null){
                return mItems.size();
            }
            return 0;
        }
private String value;
        @Override
        public void onClick(View v) {
            if (mHolder.itemsBinding.chbItemPicked.isChecked()) {
                value = "un-Checked";
                mHolder.itemsBinding.chbItemPicked.setChecked(false);
                mHolder.itemsBinding.chbItemPicked.setCheckMarkDrawable(android.R.color.transparent);
            } else {
                value = "Checked";
                mHolder.itemsBinding.chbItemPicked.setCheckMarkDrawable(R.drawable.ic_check);
                mHolder.itemsBinding.chbItemPicked.setChecked(true);
            }

        }


        public class CreatedGroceryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            CreatedItemsBinding itemsBinding;

            public CreatedGroceryViewHolder(ViewGroup parent) {
                super(LayoutInflater.from(parent.getContext()).inflate(R.layout.created_items,parent,false));
                itemsBinding = DataBindingUtil.bind(itemView);

            }

            @Override
            public void onClick(View v) {

            }
        }
    }



}
