package com.user.globalcare.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.user.globalcare.Adapter.DoctorTypeAdapter;
import com.user.globalcare.Adapter.SearchDoctorProfileAdapter;
import com.user.globalcare.R;
import com.user.globalcare.databinding.FragmentSearchBinding;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {
    FragmentSearchBinding sbinding;

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        sbinding = FragmentSearchBinding.inflate(inflater ,container,false);
        View view =sbinding.getRoot();

        init_UI();
        return view;
    }

    private void init_UI() {
        DoctorType();
        DoctorProfile();

        sbinding.searchTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment  noresult = new Fragment_No_Result_Found();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fm_layout,noresult).addToBackStack("noresult");
                ft.commit();
            }
        });

    }

    private void DoctorProfile() {
        List<String> profiledata= new ArrayList<>();
        for (int i=0;i<50;i++){
            System.out.print(profiledata.add("1"));
        }
        sbinding.searchDocProfileRv.setAdapter(new SearchDoctorProfileAdapter((ArrayList<String>) profiledata));


    }

    private void DoctorType() {
        List<String> dataholder = new ArrayList<>();
        for (int i=0;i<50;i++){
            System.out.print(dataholder.add("1"));
        }
        sbinding.doctorTypeRv.setAdapter(new DoctorTypeAdapter((ArrayList < String >)dataholder));

    }
}
