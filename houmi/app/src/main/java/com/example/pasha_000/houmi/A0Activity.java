package com.example.pasha_000.houmi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK;
import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class A0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ChangDirection();
    }
    private void ChangDirection(){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        Boolean createFlow = pref.getBoolean("CreateFlow",false);

        if(createFlow)
        {
            startActivity(new Intent(this, MainActivity.class).setFlags(FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_CLEAR_TASK));
        }
        else {
            startActivity(new Intent(this, A1Activity.class).setFlags(FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_CLEAR_TASK));
        }
    }

}
