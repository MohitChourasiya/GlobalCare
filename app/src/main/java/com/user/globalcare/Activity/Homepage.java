package com.user.globalcare.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.user.globalcare.Fragment.Doctor_profile_Fragment;
import com.user.globalcare.Fragment.HomeFragment;
import com.user.globalcare.R;
import com.user.globalcare.databinding.ActivityHomepageBinding;

public class Homepage extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    ActivityHomepageBinding homepageBinding;
//    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homepageBinding = ActivityHomepageBinding.inflate(getLayoutInflater());
        setContentView(homepageBinding.getRoot());
        homepageBinding.navBtn.setOnNavigationItemSelectedListener(this);
        homepageBinding.navBtn.setSelectedItemId(R.id.home);

//
//        bottomNavigationView = findViewById(R.id.nav_btn);
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(this);
//        bottomNavigationView.setSelectedItemId(R.id.home);
    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                HomeFragment homeFragment = new HomeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fm_layout,homeFragment).commit();
                return true;

            case R.id.profile:
                Doctor_profile_Fragment doctor_profile_fragment = new Doctor_profile_Fragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fm_layout,doctor_profile_fragment).commit();
                return true;

        }


        return false;
    }
}