package com.example.ee5415.fivethingsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ee5415 on 7/20/2016.
 */
public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void back (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
