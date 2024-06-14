package com.example.myapplication.ui.student;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StudentViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public StudentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Student fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}