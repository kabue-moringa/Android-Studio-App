package com.androidapp.myandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BrewersActivity  extends AppCompatActivity {
    private ListView mListView;
    private TextView mLocationTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brewery);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("some BreweriesCompany in Kenya: " + location);
        mListView = (ListView) findViewById(R.id.listView);
        char breweries = 0;
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, breweries);
        mListView.setAdapter(adapter);

    }

}
