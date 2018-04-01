package com.example.riturajsingh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

///This class is for the ReligiousPlacesActivity screen ////
public class ReligiousPlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious_places);
        ///Get List of 10 religiousPlaces using ListGiver Instance ///////////
        ArrayList<OutingSpots> religiousPlacesList = new ListGiver(ReligiousPlacesActivity.this).Listof10ReligiousPlaces();
        ////Create an adapter instance using CommonAdapter Class ///
        CommonAdapter commonAdapter = new CommonAdapter(ReligiousPlacesActivity.this, 0, religiousPlacesList);
        //Get Refernce to ListView ///
        ListView religiousPlacesActivityListView = findViewById(R.id.religiousPlacesActivity_ListView);
        ////Set Item Click Listener on ListView Items ////
        religiousPlacesActivityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Create and Intent
                Intent intent = new Intent(ReligiousPlacesActivity.this, DetailsActivity.class);
                ///add Information related to Activity and Position of itemclicked /////
                intent.putExtra("activityName", "ReligiousPlacesActivity");
                intent.putExtra("positionClicked", Integer.toString(i));
                /// Start the new Acitivty
                startActivity(intent);
            }
        });
        ///Set adapter on the ListView so as to inflate the ListView////
        religiousPlacesActivityListView.setAdapter(commonAdapter);
    }
}
