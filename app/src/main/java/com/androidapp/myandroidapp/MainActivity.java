package com.androidapp.myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mFindBreweryCompanyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFindBreweryCompanyButton = (Button) findViewById(R.id.findBreweryCompanyButton);
        mFindBreweryCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
            }
        });
        mFindBreweryCompanyButton = (Button)findViewById(R.id.findBreweryCompanyButton);

    }
}