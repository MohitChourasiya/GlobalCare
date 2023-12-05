package com.user.globalcare.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.user.globalcare.databinding.SearchNoResultFoundBinding;

public class Fragment_No_Result_Found extends Fragment {

    SearchNoResultFoundBinding noFoundbind;
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                         @Nullable Bundle savedInstanceState){
        noFoundbind = SearchNoResultFoundBinding.inflate(inflater,container,false);
        View view = noFoundbind.getRoot();
        init_UI();
        return view;
    }

    private void init_UI() {


    }
}
