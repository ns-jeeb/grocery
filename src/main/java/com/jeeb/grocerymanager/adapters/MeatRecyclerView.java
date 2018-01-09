package com.jeeb.grocerymanager.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jeeb.grocerymanager.R;
import com.jeeb.grocerymanager.databinding.ItemsBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by najeebsakhizada on 2017-12-19.
 */

public class MeatRecyclerView extends RecyclerView.Adapter<MeatRecyclerView.MeatHolder>{
    public SparseBooleanArray mCheckStates;
    private int imageRes = 0;
    private ArrayList<String> unCleanItems;


    public MeatRecyclerView(List<String> cleanedGroItemLists, ArrayList<String>unMangedItems, int res){

        unCleanItems = unMangedItems;
        mCheckStates = new SparseBooleanArray(unMangedItems.size());
        imageRes = res;
    }

    @Override
    public MeatHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MeatHolder(parent);
    }

    @Override
    public void onBindViewHolder(MeatHolder holder, int position) {
        holder.onBind(unCleanItems);
    }

    @Override
    public int getItemCount() {
        if (unCleanItems == null){
            return 0;
        }
        return unCleanItems.size();

    }

    public class MeatHolder extends RecyclerView.ViewHolder {

        public ItemsBinding binding;
        private AdapterHelper adapterHelper;

        public MeatHolder(ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false));
            adapterHelper = new AdapterHelper(parent.getContext());
            binding = DataBindingUtil.bind(itemView);
        }


        public void onBind(ArrayList<String>myList) {

//            adapterHelper.bindTitle(binding.txtGrocItem,myList,getAdapterPosition());
        }
    }

}
