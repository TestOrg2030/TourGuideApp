package com.example.riturajsingh.tourguideapp;

import android.content.Context;

/**
 * Created by Rituraj Singh on 12/25/2017.
 */
/////This is Events class which is subclass of OutingSpots class////
public class Event extends OutingSpots {
    private String mPhone;
    private String mTiming;///Member Variables are self Explainatory //
    private String mDate;

    ////// Intialize Member variables using constructor /////
    public Event(Context mContext, String mName, String mAddress, String mDescription, String mPhone, String mTiming, String mDate) {
        super(mContext, mName, mAddress, mDescription);
        this.mPhone = mPhone;
        this.mTiming = mTiming;
        this.mDate = mDate;

    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmTiming() {
        return mTiming;
    }

    public String getmDate() {
        return mDate;
    }

    //////Get default Image which is shown in the ListView/////////
    public int getmDefaultImageResIdAcToEvent() {
        return R.drawable.ic_event_black_24dp;
    }

    //////Get Image which is shown in the DetailsActivity Screen /////
    public int getmImageResIdAcToEvent() {
        return R.drawable.img_events_education_for_all;
    }

}
