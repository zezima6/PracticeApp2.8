package com.example.zuling.practiceapp28;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Zuling on 10/24/2017.
 */

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);}


    public void gotoSecondActivity(View v)
    {
        startActivity(new Intent(MainActivity.this, MapsActivity.class));
    }
    }


