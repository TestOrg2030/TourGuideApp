package com.example.riturajsingh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

///This class is for the StadiumsActivity screen ////
public class StadiumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadiums);
        ///Get List of 5 stadiums using ListGiver Instance ///////////
        ArrayList<OutingSpots> stadiumsList = new ListGiver(StadiumsActivity.this).Listof5Stadiums();
        ///Create an adapter instance using CommonAdapter Class ///
        CommonAdapter commonAdapter = new CommonAdapter(StadiumsActivity.this, 0, stadiumsList);
        ///Get Refernce to ListView ///
        ListView stadiumsActivityListView = findViewById(R.id.stadiumsActivity_ListView);
        ////Set Item Click Listener on ListView Items ////
        stadiumsActivityListView.setAdapter(commonAdapter);
        stadiumsActivityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ///Create and Intent
                Intent intent = new Intent(StadiumsActivity.this, DetailsActivity.class);
                ///add Information related to Activity and Position of itemclicked /////
                intent.putExtra("activityName", "StadiumsActivity");
                intent.putExtra("positionClicked", Integer.toString(i));
                //// Start the new Acitivty
                startActivity(intent);
            }
        });
        ////Set adapter on the ListView so as to inflate the ListView////
        stadiumsActivityListView.setAdapter(commonAdapter);
    }
}
