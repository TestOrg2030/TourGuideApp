package com.example.riturajsingh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

///This class is for the MainActivity screen ////
/////Used NavigationView method to override it
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ActionBarDrawerToggle toggle;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ///Display Home Button if Support ActionBar in not Null
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ///Get Refernce to different TextViews and assign onClickListeners on them redirecting them to different activities
        TextView events_Main_Activity = findViewById(R.id.mainActivity_Events);
        events_Main_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent events_Intents = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(events_Intents);
            }
        });
        TextView hotels_Main_Activity = findViewById(R.id.mainActivity_Hotels);
        hotels_Main_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotels_Intents = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotels_Intents);
            }
        });
        TextView parks_Main_Activity = findViewById(R.id.mainActivity_Parks);
        parks_Main_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parks_Intents = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(parks_Intents);
            }
        });
        TextView religious_places_Main_Activity = findViewById(R.id.mainActivity_Religious_Places);
        religious_places_Main_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent religious_places_Intents = new Intent(MainActivity.this, ReligiousPlacesActivity.class);
                startActivity(religious_places_Intents);
            }
        });
        TextView restaurents_Main_Activity = findViewById(R.id.mainActivity_Restaurents);
        restaurents_Main_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurents_Intents = new Intent(MainActivity.this, RestaurentsActivity.class);
                startActivity(restaurents_Intents);
            }
        });
        TextView stadiums_Main_Activity = findViewById(R.id.mainActivity_Stadiums);
        stadiums_Main_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stadiums_Intents = new Intent(MainActivity.this, StadiumsActivity.class);
                startActivity(stadiums_Intents);
            }
        });
        ///Get refernce to Drawer layout
        drawer = findViewById(R.id.drawer_layout);
        ///Create an Layout Toggler
        toggle = new ActionBarDrawerToggle(this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        ///add toggler to drawer
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        ///Get refernce to NavigationView
        NavigationView navigationView = findViewById(R.id.nav_view);
        //set corresponding Listener on its items
        navigationView.setNavigationItemSelectedListener(this);
    }

    ///This method check whether Toggler Hamburger icon is selected or not
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    ////Override Navigation item selected method with our own version which will redirect us to different activities according to the item selected and later on close the drawer
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_hotels) {
            Intent i = new Intent(MainActivity.this, HotelsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_events) {
            Intent i = new Intent(MainActivity.this, EventsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_parks) {
            Intent i = new Intent(MainActivity.this, ParksActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_stadiums) {
            Intent i = new Intent(MainActivity.this, StadiumsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_restaurents) {
            Intent i = new Intent(MainActivity.this, RestaurentsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_religious_places) {
            Intent i = new Intent(MainActivity.this, ReligiousPlacesActivity.class);
            startActivity(i);
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
