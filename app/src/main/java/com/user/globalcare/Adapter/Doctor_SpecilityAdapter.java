package com.user.globalcare.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.user.globalcare.Doctor_Specility_Data;
import com.user.globalcare.R;

import java.util.ArrayList;

public class Doctor_SpecilityAdapter extends  RecyclerView.Adapter<Doctor_SpecilityAdapter.myviewholder>{

    ArrayList<String> dataholder=new ArrayList<>();

    public Doctor_SpecilityAdapter(ArrayList<String> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.homefragment_recyclerview_doctor_speciality,parent,false);
       return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView img_font;
        RelativeLayout img;
        TextView desc;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.back_ecllipse);
            img_font=itemView.findViewById(R.id.centre_image);
            desc = itemView.findViewById(R.id.desc_txt);
        }
    }


}
