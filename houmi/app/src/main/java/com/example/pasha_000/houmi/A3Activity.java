package com.example.pasha_000.houmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
    }
    public void start_A4Activity(View view){
        Intent intent = new Intent(this, A4Activity.class);
        startActivity(intent);
    }
}
