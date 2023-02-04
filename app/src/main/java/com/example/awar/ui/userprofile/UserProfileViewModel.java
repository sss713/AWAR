package com.example.awar.ui.userprofile;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class UserProfileViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public UserProfileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is userprofile fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}