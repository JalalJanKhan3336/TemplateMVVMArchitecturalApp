package com.softparrot.mvvmarchitecturalapptemplate.extras.callback;

public interface ListItemClickCallback<T> {
    void onItemClicked(T item, int position);
}
