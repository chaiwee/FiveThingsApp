package com.example.ee5415.fivethingsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void recipe(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.jamieoliver.com/recipes/category/course/quick-healthy-recipes/#1UMhQfvmI12FPPgq.97"));
        startActivity(intent);
    }

    public void getStarted (View view){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }


    }
