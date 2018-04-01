package com.example.riturajsingh.tourguideapp;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Rituraj Singh on 12/14/2017.
 */
////This class gives the List of items
public class ListGiver {

    private Context mContext;

    ///Constructor Initializes Context Variable ///
    public ListGiver(Context mContext) {
        this.mContext = mContext;
    }

    ////////Methods are self explainatory.
    public ArrayList<Hotel> Listof20Hotels() {
        ArrayList<Hotel> hotelsList = new ArrayList<>();
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_1), mContext.getString(R.string.address_hotel_1), mContext.getString(R.string.description_hotel_1), mContext.getString(R.string.costCategory_hotel_1), mContext.getString(R.string.phone_hotel_1), mContext.getString(R.string.stars_hotel_1), mContext.getString(R.string.price_hotel_1)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_2), mContext.getString(R.string.address_hotel_2), mContext.getString(R.string.description_hotel_2), mContext.getString(R.string.costCategory_hotel_2), mContext.getString(R.string.phone_hotel_2), mContext.getString(R.string.stars_hotel_2), mContext.getString(R.string.price_hotel_2)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_3), mContext.getString(R.string.address_hotel_3), mContext.getString(R.string.description_hotel_3), mContext.getString(R.string.costCategory_hotel_3), mContext.getString(R.string.phone_hotel_3), mContext.getString(R.string.stars_hotel_3), mContext.getString(R.string.price_hotel_3)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_4), mContext.getString(R.string.address_hotel_4), mContext.getString(R.string.description_hotel_4), mContext.getString(R.string.costCategory_hotel_4), mContext.getString(R.string.phone_hotel_4), mContext.getString(R.string.stars_hotel_4), mContext.getString(R.string.price_hotel_4)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_5), mContext.getString(R.string.address_hotel_5), mContext.getString(R.string.description_hotel_5), mContext.getString(R.string.costCategory_hotel_5), mContext.getString(R.string.phone_hotel_5), mContext.getString(R.string.stars_hotel_5), mContext.getString(R.string.price_hotel_5)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_6), mContext.getString(R.string.address_hotel_6), mContext.getString(R.string.description_hotel_6), mContext.getString(R.string.costCategory_hotel_6), mContext.getString(R.string.phone_hotel_6), mContext.getString(R.string.stars_hotel_6), mContext.getString(R.string.price_hotel_6)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_7), mContext.getString(R.string.address_hotel_7), mContext.getString(R.string.description_hotel_7), mContext.getString(R.string.costCategory_hotel_7), mContext.getString(R.string.phone_hotel_7), mContext.getString(R.string.stars_hotel_7), mContext.getString(R.string.price_hotel_7)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_8), mContext.getString(R.string.address_hotel_8), mContext.getString(R.string.description_hotel_8), mContext.getString(R.string.costCategory_hotel_8), mContext.getString(R.string.phone_hotel_8), mContext.getString(R.string.stars_hotel_8), mContext.getString(R.string.price_hotel_8)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_9), mContext.getString(R.string.address_hotel_9), mContext.getString(R.string.description_hotel_9), mContext.getString(R.string.costCategory_hotel_9), mContext.getString(R.string.phone_hotel_9), mContext.getString(R.string.stars_hotel_9), mContext.getString(R.string.price_hotel_9)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_10), mContext.getString(R.string.address_hotel_10), mContext.getString(R.string.description_hotel_10), mContext.getString(R.string.costCategory_hotel_10), mContext.getString(R.string.phone_hotel_10), mContext.getString(R.string.stars_hotel_10), mContext.getString(R.string.price_hotel_10)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_11), mContext.getString(R.string.address_hotel_11), mContext.getString(R.string.description_hotel_11), mContext.getString(R.string.costCategory_hotel_11), mContext.getString(R.string.phone_hotel_11), mContext.getString(R.string.stars_hotel_11), mContext.getString(R.string.price_hotel_11)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_12), mContext.getString(R.string.address_hotel_12), mContext.getString(R.string.description_hotel_12), mContext.getString(R.string.costCategory_hotel_12), mContext.getString(R.string.phone_hotel_12), mContext.getString(R.string.stars_hotel_12), mContext.getString(R.string.price_hotel_12)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_13), mContext.getString(R.string.address_hotel_13), mContext.getString(R.string.description_hotel_13), mContext.getString(R.string.costCategory_hotel_13), mContext.getString(R.string.phone_hotel_13), mContext.getString(R.string.stars_hotel_13), mContext.getString(R.string.price_hotel_13)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_14), mContext.getString(R.string.address_hotel_14), mContext.getString(R.string.description_hotel_14), mContext.getString(R.string.costCategory_hotel_14), mContext.getString(R.string.phone_hotel_14), mContext.getString(R.string.stars_hotel_14), mContext.getString(R.string.price_hotel_14)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_15), mContext.getString(R.string.address_hotel_15), mContext.getString(R.string.description_hotel_15), mContext.getString(R.string.costCategory_hotel_15), mContext.getString(R.string.phone_hotel_15), mContext.getString(R.string.stars_hotel_15), mContext.getString(R.string.price_hotel_15)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_16), mContext.getString(R.string.address_hotel_16), mContext.getString(R.string.description_hotel_16), mContext.getString(R.string.costCategory_hotel_16), mContext.getString(R.string.phone_hotel_16), mContext.getString(R.string.stars_hotel_16), mContext.getString(R.string.price_hotel_16)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_17), mContext.getString(R.string.address_hotel_17), mContext.getString(R.string.description_hotel_17), mContext.getString(R.string.costCategory_hotel_17), mContext.getString(R.string.phone_hotel_17), mContext.getString(R.string.stars_hotel_17), mContext.getString(R.string.price_hotel_17)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_18), mContext.getString(R.string.address_hotel_18), mContext.getString(R.string.description_hotel_18), mContext.getString(R.string.costCategory_hotel_18), mContext.getString(R.string.phone_hotel_18), mContext.getString(R.string.stars_hotel_18), mContext.getString(R.string.price_hotel_18)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_19), mContext.getString(R.string.address_hotel_19), mContext.getString(R.string.description_hotel_19), mContext.getString(R.string.costCategory_hotel_19), mContext.getString(R.string.phone_hotel_19), mContext.getString(R.string.stars_hotel_19), mContext.getString(R.string.price_hotel_19)));
        hotelsList.add(new Hotel(mContext, mContext.getString(R.string.name_hotel_20), mContext.getString(R.string.address_hotel_20), mContext.getString(R.string.description_hotel_20), mContext.getString(R.string.costCategory_hotel_20), mContext.getString(R.string.phone_hotel_20), mContext.getString(R.string.stars_hotel_20), mContext.getString(R.string.price_hotel_20)));
        return hotelsList;
    }

    public ArrayList<OutingSpots> Listof10Parks() {
        ArrayList<OutingSpots> parksList = new ArrayList<>();
        parksList.add(new Park(mContext, mContext.getString(R.string.name_park_1), mContext.getString(R.string.address_park_1), mContext.getString(R.string.description_park_1), mContext.getString(R.string.category_park_1), mContext.getString(R.string.timing_park_1), mContext.getString(R.string.phone_park_1)));
        parksList.add(new Park(mContext, mContext.getString(R.string.name_park_2), mContext.getString(R.string.address_park_2), mContext.getString(R.string.description_park_2), mContext.getString(R.string.category_park_2), mContext.getString(R.string.timing_park_2), mContext.getString(R.string.phone_park_2)));
        parksList.add(new Park(mContext, mContext.getString(R.string.name_park_3), mContext.getString(R.string.address_park_3), mContext.getString(R.string.description_park_3), mContext.getString(R.string.category_park_3), mContext.getString(R.string.timing_park_3), mContext.getString(R.string.phone_park_3)));
        parksList.add(new Park(mContext, mContext.getString(R.string.name_park_4), mContext.getString(R.string.address_park_4), mContext.getString(R.string.description_park_4), mContext.getString(R.string.category_park_4), mContext.getString(R.string.timing_park_4), mContext.getString(R.string.phone_park_4)));
        parksList.add(new Park(mContext, mContext.getString(R.string.name_park_5), mContext.getString(R.string.address_park_5), mContext.getString(R.string.description_park_5), mContext.getString(R.string.category_park_5), mContext.getString(R.string.timing_park_5), mContext.getString(R.string.phone_park_5)));
        parksList.add(new Park(mContext, mContext.getString(R.string.name_park_6), mContext.getString(R.string.address_park_6), mContext.getString(R.string.description_park_6), mContext.getString(R.string.category_park_6), mContext.getString(R.string.timing_park_6), mContext.getString(R.string.phone_park_6)));
        parksList.add(new Park(mContext, mContext.getString(R.string.name_park_7), mContext.getString(R.string.address_park_7), mContext.getString(R.string.description_park_7), mContext.getString(R.string.category_park_7), mContext.getString(R.string.timing_park_7), mContext.getString(R.string.phone_park_7)));
        parksList.add(new Park(mContext, mContext.getString(R.string.name_park_8), mContext.getString(R.string.address_park_8), mContext.getString(R.string.description_park_8), mContext.getString(R.string.category_park_8), mContext.getString(R.string.timing_park_8), mContext.getString(R.string.phone_park_8)));
        parksList.add(new Park(mContext, mContext.getString(R.string.name_park_9), mContext.getString(R.string.address_park_9), mContext.getString(R.string.description_park_9), mContext.getString(R.string.category_park_9), mContext.getString(R.string.timing_park_9), mContext.getString(R.string.phone_park_9)));
        parksList.add(new Park(mContext, mContext.getString(R.string.name_park_10), mContext.getString(R.string.address_park_10), mContext.getString(R.string.description_park_10), mContext.getString(R.string.category_park_10), mContext.getString(R.string.timing_park_10), mContext.getString(R.string.phone_park_10)));
        return parksList;
    }

    public ArrayList<OutingSpots> Listof10ReligiousPlaces() {
        ArrayList<OutingSpots> religiousPlacesList = new ArrayList<>();
        religiousPlacesList.add(new ReligiousPlace(mContext, mContext.getString(R.string.name_religiousplace_1), mContext.getString(R.string.address_religiousplace_1), mContext.getString(R.string.description_religiousplace_1), mContext.getString(R.string.religion_religiousplace_1), mContext.getString(R.string.phone_religiousplace_1), mContext.getString(R.string.rating_religiousplace_1)));
        religiousPlacesList.add(new ReligiousPlace(mContext, mContext.getString(R.string.name_religiousplace_2), mContext.getString(R.string.address_religiousplace_2), mContext.getString(R.string.description_religiousplace_2), mContext.getString(R.string.religion_religiousplace_2), mContext.getString(R.string.phone_religiousplace_2), mContext.getString(R.string.rating_religiousplace_2)));
        religiousPlacesList.add(new ReligiousPlace(mContext, mContext.getString(R.string.name_religiousplace_3), mContext.getString(R.string.address_religiousplace_3), mContext.getString(R.string.description_religiousplace_3), mContext.getString(R.string.religion_religiousplace_3), mContext.getString(R.string.phone_religiousplace_3), mContext.getString(R.string.rating_religiousplace_3)));
        religiousPlacesList.add(new ReligiousPlace(mContext, mContext.getString(R.string.name_religiousplace_4), mContext.getString(R.string.address_religiousplace_4), mContext.getString(R.string.description_religiousplace_4), mContext.getString(R.string.religion_religiousplace_4), mContext.getString(R.string.phone_religiousplace_4), mContext.getString(R.string.rating_religiousplace_4)));
        religiousPlacesList.add(new ReligiousPlace(mContext, mContext.getString(R.string.name_religiousplace_5), mContext.getString(R.string.address_religiousplace_5), mContext.getString(R.string.description_religiousplace_5), mContext.getString(R.string.religion_religiousplace_5), mContext.getString(R.string.phone_religiousplace_5), mContext.getString(R.string.rating_religiousplace_5)));
        religiousPlacesList.add(new ReligiousPlace(mContext, mContext.getString(R.string.name_religiousplace_6), mContext.getString(R.string.address_religiousplace_6), mContext.getString(R.string.description_religiousplace_6), mContext.getString(R.string.religion_religiousplace_6), mContext.getString(R.string.phone_religiousplace_6), mContext.getString(R.string.rating_religiousplace_6)));
        religiousPlacesList.add(new ReligiousPlace(mContext, mContext.getString(R.string.name_religiousplace_7), mContext.getString(R.string.address_religiousplace_7), mContext.getString(R.string.description_religiousplace_7), mContext.getString(R.string.religion_religiousplace_7), mContext.getString(R.string.phone_religiousplace_7), mContext.getString(R.string.rating_religiousplace_7)));
        religiousPlacesList.add(new ReligiousPlace(mContext, mContext.getString(R.string.name_religiousplace_8), mContext.getString(R.string.address_religiousplace_8), mContext.getString(R.string.description_religiousplace_8), mContext.getString(R.string.religion_religiousplace_8), mContext.getString(R.string.phone_religiousplace_8), mContext.getString(R.string.rating_religiousplace_8)));
        religiousPlacesList.add(new ReligiousPlace(mContext, mContext.getString(R.string.name_religiousplace_9), mContext.getString(R.string.address_religiousplace_9), mContext.getString(R.string.description_religiousplace_9), mContext.getString(R.string.religion_religiousplace_9), mContext.getString(R.string.phone_religiousplace_9), mContext.getString(R.string.rating_religiousplace_9)));
        religiousPlacesList.add(new ReligiousPlace(mContext, mContext.getString(R.string.name_religiousplace_10), mContext.getString(R.string.address_religiousplace_10), mContext.getString(R.string.description_religiousplace_10), mContext.getString(R.string.religion_religiousplace_10), mContext.getString(R.string.phone_religiousplace_10), mContext.getString(R.string.rating_religiousplace_10)));
        return religiousPlacesList;
    }

    public ArrayList<Restaurent> Listof20Restaurents() {
        ArrayList<Restaurent> restaurentsList = new ArrayList<>();
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_1), mContext.getString(R.string.address_restaurent_1), mContext.getString(R.string.description_restaurent_1), mContext.getString(R.string.foodCategory_restaurent_1), mContext.getString(R.string.phone_restaurent_1), mContext.getString(R.string.timing_restaurent_1), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_2), mContext.getString(R.string.address_restaurent_2), mContext.getString(R.string.description_restaurent_2), mContext.getString(R.string.foodCategory_restaurent_2), mContext.getString(R.string.phone_restaurent_2), mContext.getString(R.string.timing_restaurent_2), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_3), mContext.getString(R.string.address_restaurent_3), mContext.getString(R.string.description_restaurent_3), mContext.getString(R.string.foodCategory_restaurent_3), mContext.getString(R.string.phone_restaurent_3), mContext.getString(R.string.timing_restaurent_3), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_4), mContext.getString(R.string.address_restaurent_4), mContext.getString(R.string.description_restaurent_4), mContext.getString(R.string.foodCategory_restaurent_4), mContext.getString(R.string.phone_restaurent_4), mContext.getString(R.string.timing_restaurent_4), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_5), mContext.getString(R.string.address_restaurent_5), mContext.getString(R.string.description_restaurent_5), mContext.getString(R.string.foodCategory_restaurent_5), mContext.getString(R.string.phone_restaurent_5), mContext.getString(R.string.timing_restaurent_5), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_6), mContext.getString(R.string.address_restaurent_6), mContext.getString(R.string.description_restaurent_6), mContext.getString(R.string.foodCategory_restaurent_6), mContext.getString(R.string.phone_restaurent_6), mContext.getString(R.string.timing_restaurent_6), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_7), mContext.getString(R.string.address_restaurent_7), mContext.getString(R.string.description_restaurent_7), mContext.getString(R.string.foodCategory_restaurent_7), mContext.getString(R.string.phone_restaurent_7), mContext.getString(R.string.timing_restaurent_7), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_8), mContext.getString(R.string.address_restaurent_8), mContext.getString(R.string.description_restaurent_8), mContext.getString(R.string.foodCategory_restaurent_8), mContext.getString(R.string.phone_restaurent_8), mContext.getString(R.string.timing_restaurent_8), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_9), mContext.getString(R.string.address_restaurent_9), mContext.getString(R.string.description_restaurent_9), mContext.getString(R.string.foodCategory_restaurent_9), mContext.getString(R.string.phone_restaurent_9), mContext.getString(R.string.timing_restaurent_9), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_10), mContext.getString(R.string.address_restaurent_10), mContext.getString(R.string.description_restaurent_10), mContext.getString(R.string.foodCategory_restaurent_10), mContext.getString(R.string.phone_restaurent_10), mContext.getString(R.string.timing_restaurent_10), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_11), mContext.getString(R.string.address_restaurent_11), mContext.getString(R.string.description_restaurent_11), mContext.getString(R.string.foodCategory_restaurent_11), mContext.getString(R.string.phone_restaurent_11), mContext.getString(R.string.timing_restaurent_11), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_12), mContext.getString(R.string.address_restaurent_12), mContext.getString(R.string.description_restaurent_12), mContext.getString(R.string.foodCategory_restaurent_12), mContext.getString(R.string.phone_restaurent_12), mContext.getString(R.string.timing_restaurent_12), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_13), mContext.getString(R.string.address_restaurent_13), mContext.getString(R.string.description_restaurent_13), mContext.getString(R.string.foodCategory_restaurent_13), mContext.getString(R.string.phone_restaurent_13), mContext.getString(R.string.timing_restaurent_13), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_14), mContext.getString(R.string.address_restaurent_14), mContext.getString(R.string.description_restaurent_14), mContext.getString(R.string.foodCategory_restaurent_14), mContext.getString(R.string.phone_restaurent_14), mContext.getString(R.string.timing_restaurent_14), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_15), mContext.getString(R.string.address_restaurent_15), mContext.getString(R.string.description_restaurent_15), mContext.getString(R.string.foodCategory_restaurent_15), mContext.getString(R.string.phone_restaurent_15), mContext.getString(R.string.timing_restaurent_15), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_16), mContext.getString(R.string.address_restaurent_16), mContext.getString(R.string.description_restaurent_16), mContext.getString(R.string.foodCategory_restaurent_16), mContext.getString(R.string.phone_restaurent_16), mContext.getString(R.string.timing_restaurent_16), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_17), mContext.getString(R.string.address_restaurent_17), mContext.getString(R.string.description_restaurent_17), mContext.getString(R.string.foodCategory_restaurent_17), mContext.getString(R.string.phone_restaurent_17), mContext.getString(R.string.timing_restaurent_17), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_18), mContext.getString(R.string.address_restaurent_18), mContext.getString(R.string.description_restaurent_18), mContext.getString(R.string.foodCategory_restaurent_18), mContext.getString(R.string.phone_restaurent_18), mContext.getString(R.string.timing_restaurent_18), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_19), mContext.getString(R.string.address_restaurent_19), mContext.getString(R.string.description_restaurent_19), mContext.getString(R.string.foodCategory_restaurent_19), mContext.getString(R.string.phone_restaurent_19), mContext.getString(R.string.timing_restaurent_19), 12));
        restaurentsList.add(new Restaurent(mContext, mContext.getString(R.string.name_restaurent_20), mContext.getString(R.string.address_restaurent_20), mContext.getString(R.string.description_restaurent_20), mContext.getString(R.string.foodCategory_restaurent_20), mContext.getString(R.string.phone_restaurent_20), mContext.getString(R.string.timing_restaurent_20), 12));
        return restaurentsList;
    }

    public ArrayList<OutingSpots> Listof5Stadiums() {
        ArrayList<OutingSpots> stadiumsList = new ArrayList<>();
        stadiumsList.add(new Stadium(mContext, mContext.getString(R.string.name_stadium_1), mContext.getString(R.string.address_stadium_1), mContext.getString(R.string.description_stadium_1), mContext.getString(R.string.sportsCategory_stadium_1), mContext.getString(R.string.timing_stadium_1), mContext.getString(R.string.phone_stadium_1)));
        stadiumsList.add(new Stadium(mContext, mContext.getString(R.string.name_stadium_2), mContext.getString(R.string.address_stadium_2), mContext.getString(R.string.description_stadium_2), mContext.getString(R.string.sportsCategory_stadium_2), mContext.getString(R.string.timing_stadium_2), mContext.getString(R.string.phone_stadium_2)));
        stadiumsList.add(new Stadium(mContext, mContext.getString(R.string.name_stadium_3), mContext.getString(R.string.address_stadium_3), mContext.getString(R.string.description_stadium_3), mContext.getString(R.string.sportsCategory_stadium_3), mContext.getString(R.string.timing_stadium_3), mContext.getString(R.string.phone_stadium_3)));
        stadiumsList.add(new Stadium(mContext, mContext.getString(R.string.name_stadium_4), mContext.getString(R.string.address_stadium_4), mContext.getString(R.string.description_stadium_4), mContext.getString(R.string.sportsCategory_stadium_4), mContext.getString(R.string.timing_stadium_4), mContext.getString(R.string.phone_stadium_4)));
        stadiumsList.add(new Stadium(mContext, mContext.getString(R.string.name_stadium_5), mContext.getString(R.string.address_stadium_5), mContext.getString(R.string.description_stadium_5), mContext.getString(R.string.sportsCategory_stadium_5), mContext.getString(R.string.timing_stadium_5), mContext.getString(R.string.phone_stadium_5)));
        return stadiumsList;
    }

    public ArrayList<OutingSpots> Listof5Events() {
        ArrayList<OutingSpots> eventsList = new ArrayList<>();
        eventsList.add(new Event(mContext, mContext.getString(R.string.name_event_1), mContext.getString(R.string.venue_event_1), mContext.getString(R.string.description_event_1), mContext.getString(R.string.phone_event_1), mContext.getString(R.string.timing_event_1), mContext.getString(R.string.date_event_1)));
        eventsList.add(new Event(mContext, mContext.getString(R.string.name_event_2), mContext.getString(R.string.venue_event_2), mContext.getString(R.string.description_event_2), mContext.getString(R.string.phone_event_2), mContext.getString(R.string.timing_event_2), mContext.getString(R.string.date_event_2)));
        eventsList.add(new Event(mContext, mContext.getString(R.string.name_event_3), mContext.getString(R.string.venue_event_3), mContext.getString(R.string.description_event_3), mContext.getString(R.string.phone_event_3), mContext.getString(R.string.timing_event_3), mContext.getString(R.string.date_event_3)));
        eventsList.add(new Event(mContext, mContext.getString(R.string.name_event_4), mContext.getString(R.string.venue_event_4), mContext.getString(R.string.description_event_4), mContext.getString(R.string.phone_event_4), mContext.getString(R.string.timing_event_4), mContext.getString(R.string.date_event_4)));
        eventsList.add(new Event(mContext, mContext.getString(R.string.name_event_5), mContext.getString(R.string.venue_event_5), mContext.getString(R.string.description_event_5), mContext.getString(R.string.phone_event_5), mContext.getString(R.string.timing_event_5), mContext.getString(R.string.date_event_5)));
        return eventsList;
    }

    public ArrayList<OutingSpots> ListOfCheapHotels() {
        ArrayList<OutingSpots> cheapHotels = new ArrayList<>();
        for (Hotel h : Listof20Hotels())
            if (h.getmCostCategory().equals("Cheap"))
                cheapHotels.add(h);
        return cheapHotels;
    }


    public ArrayList<OutingSpots> ListOfMidPriceHotels() {
        ArrayList<OutingSpots> midPriceHotels = new ArrayList<>();
        for (Hotel h : Listof20Hotels())
            if (h.getmCostCategory().equals("Mid Price"))
                midPriceHotels.add(h);
        return midPriceHotels;
    }


    public ArrayList<OutingSpots> ListOfExpensiveHotels() {
        ArrayList<OutingSpots> expensiveHotels = new ArrayList<>();
        for (Hotel h : Listof20Hotels())
            if (h.getmCostCategory().equals("Expensive"))
                expensiveHotels.add(h);
        return expensiveHotels;
    }

    public ArrayList<OutingSpots> ListOfVegRestaurents() {
        ArrayList<OutingSpots> vegRestaurents = new ArrayList<>();
        for (Restaurent h : Listof20Restaurents())
            if (h.getmFoodCategory().equals("Vegetarian"))
                vegRestaurents.add(h);
        return vegRestaurents;
    }

    public ArrayList<OutingSpots> ListOfNonVegRestaurents() {
        ArrayList<OutingSpots> nonVegRestaurents = new ArrayList<>();
        for (Restaurent h : Listof20Restaurents())
            if (h.getmFoodCategory().equals("Non Vegetarian"))
                nonVegRestaurents.add(h);
        return nonVegRestaurents;
    }

}
