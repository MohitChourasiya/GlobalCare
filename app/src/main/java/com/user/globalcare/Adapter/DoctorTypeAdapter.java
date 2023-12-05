package com.user.globalcare.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.user.globalcare.R;
import com.user.globalcare.databinding.RecyclerBestdoctorBinding;

import java.util.ArrayList;

public class DoctorTypeAdapter extends RecyclerView.Adapter<DoctorTypeAdapter.holder> {

    ArrayList<String> dataholder=new ArrayList<>();

    public DoctorTypeAdapter(ArrayList<String> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from((parent.getContext()));
        View view= inflater.inflate(R.layout.recycler_bestdoctor,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }


    class holder extends RecyclerView.ViewHolder
    {
        RecyclerBestdoctorBinding doctorBinding;

        public holder(@NonNull View itemView) {
            super(itemView);
    //   this.itemView=doctorBinding;
        }
    }

}
