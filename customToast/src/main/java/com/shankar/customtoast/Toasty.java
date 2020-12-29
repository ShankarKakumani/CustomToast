package com.shankar.customtoast;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class Toasty {


    public static void successToast(Activity act , String msg)
    {
        View custom_view = act.getLayoutInflater().inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(msg);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_success);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(act.getResources().getColor(R.color.successColor));

        Toast toast = new Toast(act);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(custom_view);
        toast.show();
    }

    public static void errorToast(Activity act , String msg)
    {
        View custom_view = act.getLayoutInflater().inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(msg);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_error);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(act.getResources().getColor(R.color.errorColor));

        Toast toast = new Toast(act);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(custom_view);
        toast.show();
    }

    public static void failureToast(Activity act , String msg)
    {
        View custom_view = act.getLayoutInflater().inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(msg);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_success);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(act.getResources().getColor(R.color.errorColor));

        Toast toast = new Toast(act);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(custom_view);
        toast.show();
    }

    public static void infoToast(Activity act , String msg)
    {
        View custom_view = act.getLayoutInflater().inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(msg);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_info);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(act.getResources().getColor(R.color.infoColor));

        Toast toast = new Toast(act);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(custom_view);
        toast.show();
    }

}
