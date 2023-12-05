package com.user.globalcare.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.user.globalcare.Activity.NotificationActivity;
import com.user.globalcare.Adapter.DoctorTypeAdapter;
import com.user.globalcare.Adapter.Doctor_ProfileAdapter;
import com.user.globalcare.Adapter.Doctor_SpecilityAdapter;
import com.user.globalcare.Adapter.NearHospitalAdapter;
import com.user.globalcare.Doctor_Specility_Data;
import com.user.globalcare.R;
import com.user.globalcare.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    FragmentHomeBinding homeBinding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        homeBinding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = homeBinding.getRoot();
        init_UI();

        return view;


    }

    private void init_UI() {
        Speciality();
        Types();
        HospitalNearme();
        DoctorProfile();
        homeBinding.notifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment notification = new NotificationFragment();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fm_layout, notification).addToBackStack("notification");
                ft.commit();

            }
        });


        homeBinding.searchRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment search = new SearchFragment();
                FragmentTransaction fragtrang = getActivity().getSupportFragmentManager().beginTransaction();
                fragtrang.replace(R.id.fm_layout,search).addToBackStack("search");
                fragtrang.commit();
            }
        });
    }

    private void DoctorProfile() {
        List<String> profileholder= new ArrayList<>();
        profileholder.add("1");
        profileholder.add("1");
        profileholder.add("1");
        profileholder.add("1");
        homeBinding.recyclerDocProfile.setAdapter(new Doctor_ProfileAdapter((ArrayList<String>) profileholder));
    }

    private void HospitalNearme() {
        List<String> itemholder= new ArrayList<>();
        itemholder.add("1");
        itemholder.add("1");
        itemholder.add("1");
        itemholder.add("1");
        homeBinding.nearhospitalRv.setAdapter(new NearHospitalAdapter((ArrayList<String>) itemholder));
    }

    private void Types() {

        List<String> dataholder=new ArrayList<>();
        dataholder.add("1");
        dataholder.add("1");
        dataholder.add("1");
        dataholder.add("1");
        dataholder.add("1");
        dataholder.add("1");
        dataholder.add("1");
        homeBinding. typeRv.setAdapter(new DoctorTypeAdapter((ArrayList<String>) dataholder));
    }

    private void Speciality() {

        List<String> dataholder=new ArrayList<>();
        dataholder.add("1");
        dataholder.add("1");
        dataholder.add("1");
        dataholder.add("1");
        dataholder.add("1");
        dataholder.add("1");
        dataholder.add("1");

        homeBinding.specialityRv.setLayoutManager(new GridLayoutManager(getActivity(),4));
       homeBinding. specialityRv.setAdapter(new Doctor_SpecilityAdapter((ArrayList<String>) dataholder));
    }

    }
