package com.shankar.customtoast;

import android.app.Activity;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

public class Snacky extends AppCompatActivity {


    public static void basicSnack(Activity act, String msg) {

        View parent_view = act.findViewById(android.R.id.content);

        Snackbar snackbar = Snackbar.make(parent_view, Objects.requireNonNull(msg), 2000);

        snackbar.show();
    }

    public static void snackButton(Activity act, String msg, String buttonText, @ColorRes int buttonTextColor) {

        View parent_view = act.findViewById(android.R.id.content);

        Snackbar snackbar = Snackbar.make(parent_view, Objects.requireNonNull(msg), 2000)
                .setActionTextColor(act.getResources().getColor(buttonTextColor))
                .setAction(buttonText, view -> {
                });
        snackbar.show();
    }

}
