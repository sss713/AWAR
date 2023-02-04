package com.example.awar.ui.userprofile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.awar.databinding.FragmentUserprofileBinding;
import com.example.awar.databinding.FragmentUserprofileBinding;

public class UserProfileFragment extends Fragment {

    private FragmentUserprofileBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UserProfileViewModel userProfileViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(UserProfileViewModel.class);

        binding = FragmentUserprofileBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textUserprofile;
        userProfileViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}