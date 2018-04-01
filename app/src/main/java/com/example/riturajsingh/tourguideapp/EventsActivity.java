package com.example.riturajsingh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

////This class is for the EventsActivtity screen ////
public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        ///Get List of 5 events using ListGiver Instance ///////////
        ArrayList<OutingSpots> eventsList = new ListGiver(EventsActivity.this).Listof5Events();
        ////Create an adapter instance using CommonAdapter Class ///
        CommonAdapter commonAdapter = new CommonAdapter(EventsActivity.this, 0, eventsList);
        ///Get Refernce to ListView ///
        ListView eventsActivityListView = findViewById(R.id.eventActivity_ListView);
        ////Set Item Click Listener on ListView Items ////
        eventsActivityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ///Create and Intent
                Intent intent = new Intent(EventsActivity.this, DetailsActivity.class);
                ///add Information related to Activity and Position of itemclicked /////
                intent.putExtra("activityName", "EventsActivity");
                intent.putExtra("positionClicked", Integer.toString(i));
                //// Start the new Acitivty
                startActivity(intent);
            }
        });
        ////Set adapter on the ListView so as to inflate the ListView////
        eventsActivityListView.setAdapter(commonAdapter);
    }
}