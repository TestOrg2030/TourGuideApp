package com.example.riturajsingh.tourguideapp;

import android.content.Context;

/**
 * Created by Rituraj Singh on 12/13/2017.
 */
///This is Stadium class which is subclass of OutingSpots class////
public class Stadium extends OutingSpots {
    private String mSportsCategory;
    private String mTiming;///Member Variables are self Explainatory //
    private String mPhone;

    ///// Intialize Member variables using constructor /////
    public Stadium(Context mContext, String mName, String mAddress, String mDescription, String mSportsCategory, String mTiming, String mPhone) {
        super(mContext, mName, mAddress, mDescription);
        this.mSportsCategory = mSportsCategory;
        this.mTiming = mTiming;
        this.mPhone = mPhone;
    }

    public String getmSportsCategory() {
        return mSportsCategory;
    }

    public String getmTiming() {
        return mTiming;
    }

    public String getmPhone() {
        return mPhone;
    }

    ////Get default Image which is shown in the ListView/////////
    public int getmDefaultImageResIdAcToStad() {
        return R.drawable.ic_def_stadium;
    }

    /////Get Image which is shown in the DetailsActivity Screen /////
    public int getmImageResIdAcToStad() {
        return R.drawable.img_stadium_for_all;
    }
}
