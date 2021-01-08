package com.shankar.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Snacky.snackButton(this,"Basic Snack","Okay", R.color.light_blue_600);
        //Toasty.successToast(this,"Success Toast");
    }
}