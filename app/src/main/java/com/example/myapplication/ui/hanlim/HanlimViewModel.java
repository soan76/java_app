package com.example.myapplication.ui.hanlim;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HanlimViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HanlimViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("한림관");
    }

    public LiveData<String> getText() {
        return mText;
    }
}