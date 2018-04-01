package com.example.riturajsingh.tourguideapp;

import android.content.Context;

/**
 * Created by Rituraj Singh on 12/13/2017.
 */
////This is Restaurent class which is subclass of OutingSpots class////
public class Restaurent extends OutingSpots {
    private String mFoodCategory;
    private String mPhone;///Member Variables are self Explainatory //
    private String mTiming;

    //// Intialize Member variables using constructor /////
    public Restaurent(Context mContext, String mName, String mAddress, String mDescription, String mFoodCategory, String mPhone, String mTiming, int mImageResId) {
        super(mContext, mName, mAddress, mDescription);
        this.mFoodCategory = mFoodCategory;
        this.mPhone = mPhone;
        this.mTiming = mTiming;
    }

    public String getmFoodCategory() {
        return mFoodCategory;
    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmTiming() {
        return mTiming;
    }

    ////Get default Image which is shown in the ListView/////////
    public int getmDefaultImageResIdAcToRest() {
        int ResId = -1;
        switch (getmFoodCategory()) {//Assign default image ResId with respect to FoodCategory
            case "Vegetarian":
                ResId = R.drawable.ic_def_veg_rest;
                break;
            case "Non Vegetarian":
                ResId = R.drawable.ic_def_nonveg_rest;
                break;

        }
        return ResId;
    }

    /////Get Image which is shown in the DetailsActivity Screen /////
    public int getmImageResIdAcToRest() {
        int ResId = -1;
        switch (getmName()) {//Assign Image ResId with respect to Name
            case "Sagar Ratna":
                ResId = R.drawable.img_rest_sagar_ratna;
                break;
            case "Barbeque Nation - Model Town - Jalandhar":
                ResId = R.drawable.img_rest_barbeque_nation;
                break;
            case "Aggarwal Vaishno Dhaba":
                ResId = R.drawable.img_rest_aggrawal_dhaba;
                break;
            case "HEAT 7 RESTAURANT":
                ResId = R.drawable.img_rest_heat_7;
                break;
            case "Central Green":
                ResId = R.drawable.img_rest_central_green;
                break;
            case "Baba chicken Jalandhar":
                ResId = R.drawable.img_rest_baba_chicken;
                break;
            case "The Great Kabab Factory":
                ResId = R.drawable.img_rest_gkf;
                break;
            case "Super Cremica Fast Food - Best Restaurant In Jalandhar":
                ResId = R.drawable.img_rest_super_creamica;
                break;
            case "Haveli":
                ResId = R.drawable.img_rest_haveli;
                break;
            case "Rangla Punjab":
                ResId = R.drawable.img_rest_rangla_punjab;
                break;
            case "Patwari Dhaba":
                ResId = R.drawable.img_rest_patwari_dhaba;
                break;
            case "McDonald India":
                ResId = R.drawable.img_rest_mcdonald;
                break;
            case "Burger King":
                ResId = R.drawable.img_rest_burger_king;
                break;
            case "Subway":
                ResId = R.drawable.img_rest_subway;
                break;
            case "Chawlas2":
                ResId = R.drawable.img_rest_chawla;
                break;
            case "Radhe O Radhe":
                ResId = R.drawable.img_rest_radhe_o_radhe;
                break;
            case "Rai Red Chillies":
                ResId = R.drawable.img_rest_rai_red_chillies;
                break;
            case "Vimpi":
                ResId = R.drawable.img_rest_vimpi;
                break;
            case "Domino Pizza":
                ResId = R.drawable.img_rest_domino;
                break;
            case "Pizza Hut":
                ResId = R.drawable.img_rest_pizza_hut;
                break;
        }
        return ResId;
    }

}
