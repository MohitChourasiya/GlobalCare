package com.user.globalcare.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.user.globalcare.databinding.ActivityLoginBinding;

public class Login extends AppCompatActivity {
  ActivityLoginBinding loginBinding;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(loginBinding.getRoot());

        loginBinding.LoginMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lg = new Intent(Login.this, Profile_info_page.class);
                startActivity(lg);
            }
        });
        loginBinding.forgotTxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgot = new Intent(Login.this, ForgotPassword.class);
              startActivity(forgot);
            }
        });

        loginBinding.RTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rg = new Intent(Login.this, Signup.class);
                startActivity(rg);
            }
        });



    }
}