package com.example.pasha_000.houmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
    }
    public void start_A3Activity(View view){
        Intent intent = new Intent(this, A3Activity.class);
        startActivity(intent);
    }
}
