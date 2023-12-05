package com.user.globalcare.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.user.globalcare.databinding.ActivitySignupBinding;

public class Signup extends AppCompatActivity {

    ActivitySignupBinding signupbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        signupbinding=ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(signupbinding.getRoot());

        signupbinding.regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this , Verification.class);
                startActivity(intent);


            }
        });

        signupbinding.lTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logx = new Intent(Signup.this, Login.class);
                startActivity(logx);
            }
        });



    }

}