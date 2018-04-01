package com.example.riturajsingh.tourguideapp;

import android.content.Context;

/**
 * Created by Rituraj Singh on 12/13/2017.
 */
////This is Park class which is subclass of OutingSpots class////
public class Park extends OutingSpots {
    private String mParkCategory;
    private String mTiming;///Member Variables are self Explainatory //
    private String mPhone;

    ///// Intialize Member variables using constructor /////
    public Park(Context mContext, String mName, String mAddress, String mDescription, String mParkCategory, String mTiming, String mPhone) {
        super(mContext, mName, mAddress, mDescription);
        this.mParkCategory = mParkCategory;
        this.mTiming = mTiming;
        this.mPhone = mPhone;
    }

    public String getmParkCategory() {
        return mParkCategory;
    }

    public String getmTiming() {
        return mTiming;
    }

    public String getmPhone() {
        return mPhone;
    }

    ////Get default Image which is shown in the ListView/////////
    public int getmDefaultImageResIdAcToPark() {
        return R.drawable.ic_def_park;
    }

    /////Get Image which is shown in the DetailsActivity Screen /////
    public int getmImageResIdAcToPark() {
        return R.drawable.img_park_for_all;
    }

}
