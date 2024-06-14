package com.example.myapplication.ui.hongji;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HongjiViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HongjiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("홍지관");
    }

    public LiveData<String> getText() {
        return mText;
    }
}