package com.user.globalcare.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.user.globalcare.Adapter.NotificationAdapter;
import com.user.globalcare.databinding.ActivityNotificationBinding;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity {
    ActivityNotificationBinding notifybinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        notifybinding=ActivityNotificationBinding.inflate(getLayoutInflater());
        setContentView(notifybinding.getRoot());
        init_UI();




    }

    private void init_UI() {
        Notification();
    }

    private void Notification() {
        List<String>  notice = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            System.out.println( notice.add("1"));
        }
        notifybinding.notifyRv.setAdapter(new NotificationAdapter((ArrayList<String>) notice));
    }
}