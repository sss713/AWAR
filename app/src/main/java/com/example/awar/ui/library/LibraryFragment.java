package com.example.awar.ui.library;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.awar.databinding.FragmentLibraryBinding;

public class LibraryFragment extends Fragment {

    private FragmentLibraryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LibraryViewModel libraryViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(LibraryViewModel.class);

        binding = FragmentLibraryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLibrary;
        libraryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}