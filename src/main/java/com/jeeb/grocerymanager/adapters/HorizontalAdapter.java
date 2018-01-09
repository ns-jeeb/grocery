package com.jeeb.grocerymanager.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.jeeb.grocerymanager.Base.Grocery;
import com.jeeb.grocerymanager.R;
import com.jeeb.grocerymanager.activities.AppSingleton;
import com.jeeb.grocerymanager.databinding.ItemsBinding;

import java.util.ArrayList;

/**
 * Created by najeebsakhizada on 2017-12-21.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ItemViewHolder> {

    private ArrayList<String> mDataList;
    private ItemsBinding mBinding;
    private String mGroceryListItem;
    private int mVerticalPosition;
    private CreateGroceryList onCreateGroceryList;


    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        setData(AppSingleton.getInstance().getmBeefs().getParts());
        return new ItemViewHolder(parent);

    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
       holder.onBind(mDataList);

    }
    public void setCreateGroceryList(CreateGroceryList onCreateGroceryList){
        this.onCreateGroceryList = onCreateGroceryList;
    }

    @Override
    public int getItemCount() {
        if (mDataList == null){
            return 0;
        } else {
            return mDataList.size();
        }
    }

    public void setData(ArrayList<String> data) {
        if (mDataList != data) {
            mDataList = data;
        }
    }
    public void setRowPosition(int verticalPosition) {
        mVerticalPosition = verticalPosition;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder implements OnItemClickListener{

        private AdapterHelper adapterHelper;

        public ItemViewHolder(final ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false));
            adapterHelper = new AdapterHelper(parent.getContext());
            mBinding = DataBindingUtil.bind(itemView);
            mBinding.chbGrocery.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                    Toast.makeText(parent.getContext(),"check box is checked",Toast.LENGTH_LONG).show();
                    mGroceryListItem = mDataList.get(getAdapterPosition());
                    onCreateGroceryList.onCreatingGroceryList(mGroceryListItem);
                }
            });

        }

        public void onBind(ArrayList<String>myList) {

            adapterHelper.bindTitle(mBinding.txtGrocItem,myList,getAdapterPosition());
        }

        @Override
        public void onItemClick(View view) {

        }
    }

    public interface OnItemClickListener {
        void onItemClick(View view);
    }

    public interface CreateGroceryList {
        void onCreatingGroceryList(String groceryList);
    }

}
