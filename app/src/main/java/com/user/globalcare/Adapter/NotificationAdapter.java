package com.user.globalcare.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.user.globalcare.R;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.notifyholder> {

    ArrayList<String> notice = new ArrayList<>();
    public NotificationAdapter(ArrayList<String> notice){this.notice=notice;}

    @NonNull
    @Override
    public notifyholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from((parent.getContext()));
        View view= inflater.inflate(R.layout.recycler_notification_design,parent,false);
        return new NotificationAdapter.notifyholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull notifyholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notice.size();
    }

    class notifyholder extends RecyclerView.ViewHolder{


        public notifyholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
