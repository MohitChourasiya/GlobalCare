package com.user.globalcare.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.user.globalcare.R;
import com.user.globalcare.databinding.RecyclerNearHospitalDesignBinding;

import java.util.ArrayList;

public class NearHospitalAdapter extends RecyclerView.Adapter<NearHospitalAdapter.dataholder> {

    ArrayList<String> itemholder=new ArrayList<>();
    public NearHospitalAdapter(ArrayList<String> itemholder){

        this.itemholder = itemholder;
    }

    @NonNull
    @Override
    public dataholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =  LayoutInflater.from((parent.getContext()));
        View view = inflater.inflate(R.layout.recycler_near_hospital_design,parent,false);
        return new dataholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dataholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return itemholder.size();
    }

    class dataholder extends RecyclerView.ViewHolder{

        RecyclerNearHospitalDesignBinding bindhospitalnear;

        public dataholder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
