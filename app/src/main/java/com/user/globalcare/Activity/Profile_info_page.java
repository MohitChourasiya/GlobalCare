package com.user.globalcare.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.DatePicker;

import com.user.globalcare.R;
import com.user.globalcare.databinding.ActivityProfileInfoPageBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Profile_info_page extends AppCompatActivity {
   ActivityProfileInfoPageBinding profileInfoPageBinding;
   int year;
   int month;
   int day;

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        Bitmap photo = (Bitmap) data.getExtras().get("data");
//        ImageView.setImageBitmap(photo);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        profileInfoPageBinding = ActivityProfileInfoPageBinding.inflate(getLayoutInflater());
        setContentView(profileInfoPageBinding.getRoot());

        profileInfoPageBinding.profileLogo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent open_camera= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(open_camera, 100);
            }
        });




        profileInfoPageBinding.calenderTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month=calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(Profile_info_page.this,
                        R.style.DialogTheme,new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        profileInfoPageBinding.calenderTxt.setText(SimpleDateFormat.getDateInstance().format(calendar.getTime()));
                        profileInfoPageBinding.calenderTxt.setText(i+ "/"+ (i1 + 1) + "/"+i2);

                    }
                },year,month,day);

                datePickerDialog.show();

            }
        });



        profileInfoPageBinding.skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cc = new Intent(Profile_info_page.this, Homepage.class);
               startActivity(cc);
            }
        });


//        sk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent cc = new Intent(Profile_info_page.this,Homepage.class);
//                startActivity(cc);
//
//            }
//        });



    }

//    public void btn(View view) {
//
//        Popup alert = new Popup();
//        alert.showDialog(Profile_info_page.this, "Su cuenta está lista para usar.Será redirigido a la página de inicio en unos segundos.","Felicidades");
//    }
}