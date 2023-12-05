package com.user.globalcare.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.user.globalcare.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class SearchDoctorProfileAdapter extends RecyclerView.Adapter<SearchDoctorProfileAdapter.holder> {
    ArrayList<String> profiledata = new ArrayList<>();
    public SearchDoctorProfileAdapter(ArrayList<String> profiledata){this.profiledata=profiledata;}

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.recycler_search__doctorprofile_design,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return profiledata.size();
    }

    class  holder extends RecyclerView.ViewHolder{

        public holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
