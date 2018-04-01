package com.example.riturajsingh.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

////This class is for the HotelsActivtity screen ////
public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        /// get reference of ViewPager present in correspoding Activity
        ViewPager myviewpager = findViewById(R.id.hotel_viewpager);
        ///create FragmentAdapter  which will inflate the ViewPager
        HotelsFragmentAdapter hotelsFragmentAdapter = new HotelsFragmentAdapter(getSupportFragmentManager(), HotelsActivity.this);
        ///Set the ViewPager with above Adapter
        myviewpager.setAdapter(hotelsFragmentAdapter);
        /// get reference of TabLayout present in correspoding Activity
        TabLayout tabLayout = findViewById(R.id.hotel_tabs_layout);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(myviewpager);

    }

}
