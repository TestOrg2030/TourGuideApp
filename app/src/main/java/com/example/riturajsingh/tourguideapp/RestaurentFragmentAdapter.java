package com.example.riturajsingh.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Rituraj Singh on 12/23/2017.
 */
//This class is for Fragment Adapter realted to correspoding Activity /////////
public class RestaurentFragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;//Context member Variable

    ///Intialize member variables using constructor
    public RestaurentFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    ///This method returns the Fragment at Corresponding Position
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FragmentVegRestaurent();
        } else {
            return new FragmentNonVegRestaurent();
        }

    }

    ///This method returns the number of Fragments in currrent activity
    @Override
    public int getCount() {
        return 2;
    }

    ///This method returns the Title of Fragments in currrent activity
    @Override
    public CharSequence getPageTitle(int position) {
        String s = "";
        switch (position) {
            case 0:
                s = mContext.getString(R.string.veg_rest_tab);
                break;
            case 1:
                s = mContext.getString(R.string.non_veg_rest_tab);
                break;
        }
        return s;
    }

}
