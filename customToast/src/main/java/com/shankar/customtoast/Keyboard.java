package com.shankar.customtoast;

import android.app.Activity;
import android.content.Context;
import android.nfc.Tag;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import java.util.Objects;

public class Keyboard {

    public static void hideKeyboard(Activity act)
    {
        try {
            InputMethodManager imm = (InputMethodManager) act.getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            //imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
            assert imm != null;
            //imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY,0);
            imm.hideSoftInputFromWindow(Objects.requireNonNull(act.getCurrentFocus()).getWindowToken(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
