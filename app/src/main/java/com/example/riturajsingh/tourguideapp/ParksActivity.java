package com.example.riturajsingh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

//This class is for the ParksActivity screen ////
public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);
        //Get List of 10 parks using ListGiver Instance ///////////
        ArrayList<OutingSpots> parksList = new ListGiver(ParksActivity.this).Listof10Parks();
        ////Create an adapter instance using CommonAdapter Class ///
        CommonAdapter commonAdapter = new CommonAdapter(ParksActivity.this, 0, parksList);
        ///Get Refernce to ListView ///
        ListView parkActivityListView = findViewById(R.id.parksActivity_ListView);
        ////Set Item Click Listener on ListView Items ////
        parkActivityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ///Create and Intent
                Intent intent = new Intent(ParksActivity.this, DetailsActivity.class);
                ///add Information related to Activity and Position of itemclicked /////
                intent.putExtra("activityName", "ParksActivity");
                intent.putExtra("positionClicked", Integer.toString(i));
                //// Start the new Acitivty
                startActivity(intent);
            }
        });
        ////Set adapter on the ListView so as to inflate the ListView////
        parkActivityListView.setAdapter(commonAdapter);

    }


}
