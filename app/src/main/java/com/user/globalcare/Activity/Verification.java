package com.user.globalcare.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.user.globalcare.databinding.ActivityVerificationBinding;

public class Verification extends AppCompatActivity {

    ActivityVerificationBinding verificationBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        verificationBinding = ActivityVerificationBinding.inflate(getLayoutInflater());
        setContentView(verificationBinding.getRoot());

        verificationBinding.loginbtnVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bt = new Intent(Verification.this, Login.class);
                startActivity(bt);
            }
        });
    }

    public static class Doctor_specility_RecView_Adapter {
    }
}
