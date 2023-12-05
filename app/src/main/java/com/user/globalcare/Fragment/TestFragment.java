package com.user.globalcare.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.user.globalcare.databinding.TestfragmentBinding;

public class TestFragment extends Fragment {

    TestfragmentBinding testfragmentBinding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        testfragmentBinding = TestfragmentBinding.inflate(inflater, container, false);
        View view = testfragmentBinding.getRoot();
        init_UI();
        return view;
    }

    private void init_UI() {

    }
}
