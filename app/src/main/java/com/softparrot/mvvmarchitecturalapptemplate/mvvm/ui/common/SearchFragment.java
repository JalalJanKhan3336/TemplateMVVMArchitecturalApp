package com.softparrot.mvvmarchitecturalapptemplate.mvvm.ui.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import com.softparrot.mvvmarchitecturalapptemplate.databinding.FragmentSearchBinding;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding mBinding;

    private SearchFragmentCallback mSearchCallback;

    public void setSearchCallback(SearchFragmentCallback mSearchCallback) {
        this.mSearchCallback = mSearchCallback;
    }

    public SearchFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = FragmentSearchBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBinding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String searchedValue) {
                if(mSearchCallback != null){
                    mSearchCallback.onValueSearched(searchedValue);
                    return true;
                }

                return false;
            }
        });
    }

    // Search Interface
    public interface SearchFragmentCallback {
        void onValueSearched(String searchedValue);
    }
}