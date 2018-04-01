package com.example.riturajsingh.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

///This class is for the RestaurentsActivity screen ////
public class RestaurentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurents);
        /// get reference of ViewPager present in correspoding Activity
        ViewPager myviewpager = findViewById(R.id.rest_viewpager);
        ///create FragmentAdapter  which will inflate the ViewPager
        RestaurentFragmentAdapter restaurentFragmentAdapter = new RestaurentFragmentAdapter(getSupportFragmentManager(), RestaurentsActivity.this);
        ///Set the ViewPager with above Adapter
        myviewpager.setAdapter(restaurentFragmentAdapter);
        //// get reference of TabLayout present in correspoding Activity
        TabLayout tabLayout = findViewById(R.id.rest_tabs_layout);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(myviewpager);
    }


}
