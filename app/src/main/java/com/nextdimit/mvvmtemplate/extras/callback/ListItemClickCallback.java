package com.nextdimit.mvvmtemplate.extras.callback;

public interface ListItemClickCallback<T> {
    void onItemClicked(T item, int position);
}
