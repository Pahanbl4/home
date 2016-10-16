package com.example.pasha_000.houmi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK;
import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class A5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a5);
    }
    public void StartMainActivity(View view){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        pref.edit().putBoolean("CreateFlow",true).apply();

        Intent intent = new Intent(this,MainActivity.class);
        intent.setFlags(FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
