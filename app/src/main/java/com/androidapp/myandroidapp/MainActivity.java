package com.androidapp.myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mFindBreweryCompanyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String TAG = MainActivity.class.getSimpleName();
        Button mFindBreweryCompanyButton;
        EditText mLocationEditText;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mLocationEditText = (EditText) findViewById(R.id.locationEditText);
            mFindBreweryCompanyButton = (Button) findViewById(R.id.findBreweryCompanyButton);
            mFindBreweryCompanyButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String location = mLocationEditText.getText().toString();
                    Log.d(TAG, location);
                    Intent intent = new Intent(MainActivity.this, BrewersActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
