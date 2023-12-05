package com.user.globalcare.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.user.globalcare.Adapter.NotificationAdapter;
import com.user.globalcare.databinding.FragmentNotificationBinding;

import java.util.ArrayList;
import java.util.List;

public class NotificationFragment extends Fragment {
    FragmentNotificationBinding notifyfrag;


    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

        notifyfrag = FragmentNotificationBinding.inflate(inflater,container,false);
        View view = notifyfrag.getRoot();
        init_UI();
        return view;

    }

    private void init_UI() {
        Notification();
    }

    private void Notification() {

        List<String> notice = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            System.out.println( notice.add("1"));
        }
        notifyfrag.notifyRv.setAdapter(new NotificationAdapter((ArrayList<String>) notice));
    }
    }

