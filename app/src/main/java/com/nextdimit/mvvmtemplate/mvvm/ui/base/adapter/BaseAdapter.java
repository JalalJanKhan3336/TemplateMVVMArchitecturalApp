package com.nextdimit.mvvmtemplate.mvvm.ui.base.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nextdimit.mvvmtemplate.extras.callback.ListItemClickCallback;

import java.util.List;

public abstract class BaseAdapter<T, VB> extends RecyclerView.Adapter<BaseAdapter.MyViewHolder> {

    protected Context mContext;
    protected List<T> mItemList;
    protected List<T> mBackUpList;
    protected VB mItemBinding;

    protected ListItemClickCallback<T> mItemClickListener;

    public void setItemList(List<T> list){
        this.mItemList = list;
        this.mBackUpList.clear();
        this.mBackUpList.addAll(list);
        this.notifyDataSetChanged();
    }

    protected abstract VB initItemBinding(LayoutInflater inflater, ViewGroup parent);
    protected abstract View initRoot();
    protected abstract void bindItem(MyViewHolder holder, int position);

    protected BaseAdapter(Context mContext, ListItemClickCallback<T> itemClickCallback) {
        this.mContext = mContext;
        this.mItemClickListener = itemClickCallback;
    }

    protected BaseAdapter(Context mContext, List<T> mItemList, ListItemClickCallback<T> itemClickCallback) {
        this.mContext = mContext;
        this.setItemList(mItemList);
        this.mItemClickListener = itemClickCallback;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mItemBinding = initItemBinding(LayoutInflater.from(mContext), parent);
        return new MyViewHolder(initRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        bindItem(holder, position);
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
