package com.example.riturajsingh.tourguideapp;

import android.content.Context;

/**
 * Created by Rituraj Singh on 12/13/2017.
 */
///This class is the super class of Event , Hotel , Park ,Stadium , Restaurent , ReligiousPlace and hence contains most of the common methods and
public class OutingSpots {
    protected Context mContext;
    protected String mName;//Member Variables are self Explainatory //
    protected String mAddress;
    protected String mDescription;

    ////// Intialize Member variables using constructor /////
    public OutingSpots(Context mContext, String mName, String mAddress, String mDescription) {
        this.mContext = mContext;
        this.mName = mName;
        this.mAddress = mAddress;
        this.mDescription = mDescription;
    }

    public Context getmContext() {
        return mContext;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmDescription() {
        return mDescription;
    }
}
