package com.example.awar.ui.library;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class LibraryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LibraryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is library fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}