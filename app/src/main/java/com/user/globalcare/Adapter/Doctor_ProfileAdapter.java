package com.user.globalcare.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.user.globalcare.R;

import java.util.ArrayList;

public class Doctor_ProfileAdapter extends RecyclerView.Adapter<Doctor_ProfileAdapter.hold>
{
    ArrayList<String> profileholder=new ArrayList<>();
    public Doctor_ProfileAdapter(ArrayList<String> profileholder){

        this.profileholder = profileholder;
    }



    @NonNull
    @Override
    public hold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from((parent.getContext()));
        View view= inflater.inflate(R.layout.recycler_doctor_profiles,parent,false);
        return new Doctor_ProfileAdapter.hold(view);

    }

    @Override
    public void onBindViewHolder(@NonNull hold holder, int position) {

    }

    @Override
    public int getItemCount() {
        return profileholder.size();
    }

    class hold extends RecyclerView.ViewHolder {


      public hold(@NonNull View itemView) {
          super(itemView);

      }
  }

}
