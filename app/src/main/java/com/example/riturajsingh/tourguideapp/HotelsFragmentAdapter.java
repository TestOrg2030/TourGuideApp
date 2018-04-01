package com.example.riturajsingh.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Rituraj Singh on 12/21/2017.
 */
///This class is for Fragment Adapter realted to correspoding Activity /////////
public class HotelsFragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;//Context member Variable

    ///Intialize member variables using constructor
    public HotelsFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    ///This method returns the Fragment at Corresponding Position
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FragmentCheapHotel();
        } else if (position == 1) {
            return new FragmentMidHotel();
        } else {
            return new FragmentExpensiveHotel();
        }

    }

    ///This method returns the number of Fragments in currrent activity
    @Override
    public int getCount() {
        return 3;
    }

    ///This method returns the Title of Fragments in currrent activity
    @Override
    public CharSequence getPageTitle(int position) {
        String s = "";
        switch (position) {
            case 0:
                s = mContext.getString(R.string.cheap_hotel_tab);
                break;
            case 1:
                s = mContext.getString(R.string.mid_hotel_tab);
                break;
            case 2:
                s = mContext.getString(R.string.expensive_hotel_tab);
                break;
        }

        return s;

    }

}
