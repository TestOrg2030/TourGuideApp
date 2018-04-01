package com.example.riturajsingh.tourguideapp;

import android.content.Context;

/**
 * Created by Rituraj Singh on 12/13/2017.
 */
/////This is Hotel class which is subclass of OutingSpots class////
public class Hotel extends OutingSpots {
    private String mCostCategory;
    private String mPhone;
    private String mStar;///Member Variables are self Explainatory //
    private String mPrice;

    ////// Intialize Member variables using constructor /////
    public Hotel(Context mContext, String mName, String mAddress, String mDescription, String mCostCategory, String mPhone, String mStar, String mPrice) {
        super(mContext, mName, mAddress, mDescription);
        this.mCostCategory = mCostCategory;
        this.mPhone = mPhone;
        this.mStar = mStar;
        this.mPrice = mPrice;
    }

    public String getmCostCategory() {
        return mCostCategory;
    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmStar() {
        return mStar;
    }

    public String getmPrice() {
        return mPrice;
    }

    //////Get default Image which is shown in the ListView/////////
    public int getmDefaultImageResIdAcToHotel() {
        int ResId = -1;
        switch (getmCostCategory()) {///Assign default image ResId with respect to CostCategory of Hotel
            case "Cheap":
                ResId = R.drawable.ic_def_cheap_hotel;
                break;
            case "Expensive":
                ResId = R.drawable.ic_def_expensive_hotel;
                break;
            case "Mid Price":
                ResId = R.drawable.ic_def_mid_hotel;
                break;
        }

        return ResId;
    }

    //////Get Image which is shown in the DetailsActivity Screen /////
    public int getmImageResIdAcToHotel() {
        int ResId = -1;
        switch (getmName()) {//Assign Image ResId with respect to Name of Hotel
            case "Best Western":
                ResId = R.drawable.img_hotel_best_western;
                break;
            case "Radisson Jalandhar":
                ResId = R.drawable.img_hotel_radisson_jalandhar;
                break;
            case "Ramada Jalandhar City Centre":
                ResId = R.drawable.img_hotel_ramada_jalandhar_city;
                break;
            case "The Maya Hotel":
                ResId = R.drawable.img_hotel_maya_jalandhar_city;
                break;
            case "Sarovar Portico":
                ResId = R.drawable.img_hotel_sarovar_portico_jalandhar_city;
                break;
            case "Hotel Dolphin":
                ResId = R.drawable.img_hotel_dolphin_jalandhar_city;
                break;
            case "Hotel Sekhon Grand":
                ResId = R.drawable.img_hotel_sekhongrand_jalandhar;
                break;
            case "Hotel M1":
                ResId = R.drawable.img_hotel_m1_jalandhar_city;
                break;
            case "Hotel Ambassador":
                ResId = R.drawable.img_hotel_ambassador_jalandhar_city;
                break;
            case "Hotel Residency":
                ResId = R.drawable.img_hotel_residency_jalandhar_city;
                break;
            case "Hotel Maharaja Residency":
                ResId = R.drawable.img_hotel_maharaja_residency_jalandhar_city;
                break;
            case "The Regent Park Hotel":
                ResId = R.drawable.img_hotel_regent_park;
                break;
            case "Hotel President":
                ResId = R.drawable.img_hotel_president_jalandhar;
                break;
            case "Hotel Kings":
                ResId = R.drawable.img_hotel_kings;
                break;
            case "Hotel Kamal Palace":
                ResId = R.drawable.img_hotel_kamal_palace;
                break;
            case "AGI INN":
                ResId = R.drawable.img_hotel_agi_inn;
                break;
            case "Hotel Downtown":
                ResId = R.drawable.img_hotel_downtown;
                break;
            case "Country Inn and Suites By Carlson Jalandhar":
                ResId = R.drawable.img_hotel_country_inn;
                break;
            case "Leo Fort Hotel":
                ResId = R.drawable.img_hotel_leo_fort;
                break;
            case "Ramada Encore":
                ResId = R.drawable.img_hotel_ramada_encore;
                break;
        }
        return ResId;
    }
}
