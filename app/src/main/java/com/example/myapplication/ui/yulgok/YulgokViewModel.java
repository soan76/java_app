package com.example.myapplication.ui.yulgok;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class YulgokViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public YulgokViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Yulgok fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}