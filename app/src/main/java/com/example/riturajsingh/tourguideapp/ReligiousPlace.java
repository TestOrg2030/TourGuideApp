package com.example.riturajsingh.tourguideapp;

import android.content.Context;

/**
 * Created by Rituraj Singh on 12/13/2017.
 */
////This is ReligiousPlace class which is subclass of OutingSpots class////
public class ReligiousPlace extends OutingSpots {
    private String mReligion;
    private String mPhone;//Member Variables are self Explainatory //
    private String mRating;

    ///// Intialize Member variables using constructor /////
    public ReligiousPlace(Context mContext, String mName, String mAddress, String mDescription, String mReligion, String mPhone, String mRating) {
        super(mContext, mName, mAddress, mDescription);
        this.mReligion = mReligion;
        this.mPhone = mPhone;
        this.mRating = mRating;
    }

    public String getmReligion() {
        return mReligion;
    }

    public String getmRating() {
        return mRating;
    }

    public String getmPhone() {
        return mPhone;
    }

    //////Get default Image which is shown in the ListView/////////
    public int getmDefaultImageResIdAcToReligion() {
        int ResId = -1;
        switch (getmReligion()) {///Assign default image ResId with respect to Religion
            case "Sikhism":
                ResId = R.drawable.ic_def_sikhism;
                break;
            case "Hinduism":
                ResId = R.drawable.ic_def_hinduism;
                break;
            case "Islam":
                ResId = R.drawable.ic_def_islam;
                break;
            case "Christanity":
                ResId = R.drawable.ic_def_christanity;
                break;
        }

        return ResId;
    }

    //////Get Image which is shown in the DetailsActivity Screen /////
    public int getmImageResIdAcToReligion() {
        int ResId = -1;
        switch (getmName()) {//Assign Image ResId with respect to Name of ReligiousPlace
            case "Devi Talab Mandir":
                ResId = R.drawable.img_rel_devi_talab_mandir;
                break;
            case "Mandir Shri Siddh Baba Sodal":
                ResId = R.drawable.img_rel_baba_sodal;
                break;
            case "St. Mary Cathedral, Jalandhar":
                ResId = R.drawable.img_rel_st_mary_cathedral;
                break;
            case "Jama Masjid, Jalandhar":
                ResId = R.drawable.img_rel_jama_masjid;
                break;
            case "Gurdwara Talhan Sahib":
                ResId = R.drawable.img_rel_gurdwara_talhan_sahib;
                break;
            case "Gurudwara Novi Patshahi Dukh Niwaran Sahib":
                ResId = R.drawable.img_rel_gurudawara_dukh_niwaran;
                break;
            case "Gurudwara Shri Guru Singh Sabha":
                ResId = R.drawable.img_rel_gurudawara_singh_sabha;
                break;
            case "Gurudwara Shri Guru Singh Saahab":
                ResId = R.drawable.img_rel_gurudawara_singh_saahab_guru_gobind_singh;
                break;
            case "Station Masjid":
                ResId = R.drawable.img_rel_station_masjid;
                break;
            case "Masjid New Railway Road":
                ResId = R.drawable.img_rel_new_railway_masjid;
                break;
        }
        return ResId;
    }
}
