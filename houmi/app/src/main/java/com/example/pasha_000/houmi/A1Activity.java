package com.example.pasha_000.houmi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class A1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
    }
    public void start_A2Activity(View view){
        Intent intent = new Intent(this, A2Activity.class);
        startActivity(intent);
    }

}
