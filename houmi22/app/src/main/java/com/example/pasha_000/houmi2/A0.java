package com.example.pasha_000.houmi2;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK;
import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class A0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        change_the_way();
    }
    private void change_the_way(){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        Boolean CreateFlow = pref.getBoolean("CreateFlow",false);

        if(CreateFlow)
        {
            startActivity(new Intent(this, MainActivity.class).setFlags(FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_CLEAR_TASK));
        }
        else {
            startActivity(new Intent(this, MainActivity.class).setFlags(FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_CLEAR_TASK));
        }
    }

}