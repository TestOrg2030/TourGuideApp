package com.example.riturajsingh.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rituraj Singh on 12/14/2017.
 */
///This class is used to inflate the ListViews for each cateogry of events /////////
public class CommonAdapter extends ArrayAdapter<OutingSpots> {

    /// ListItem which we will inflate one by one//
    private OutingSpots mItemGot;

    ///This constructor used to intialize Context , Data Model /////
    public CommonAdapter(@NonNull Context context, int resource, @NonNull List<OutingSpots> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        mItemGot = getItem(position);///get Item from Data Model at corresponding position ///
        if (listItemView == null)//if null then inflate layout///////////
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listview_item_common, parent, false);

        ///Get reference to corresponding Views ////////////
        TextView nameTextView = listItemView.findViewById(R.id.name_TextView);
        TextView categoryTextView = listItemView.findViewById(R.id.category_TextView);
        ImageView miscImg = listItemView.findViewById(R.id.desc_ImageView);

        if (mItemGot instanceof Event) {// if itemGot is of type Event then fill in the corresponding Views
            Event eventItem = (Event) mItemGot;
            nameTextView.setText(eventItem.getmName());
            categoryTextView.setText(eventItem.getmDate());
            miscImg.setImageResource(eventItem.getmDefaultImageResIdAcToEvent());
        }


        if (mItemGot instanceof Hotel) {// if itemGot is of type Hotel then fill in the corresponding Views
            Hotel hotelItem = (Hotel) mItemGot;
            nameTextView.setText(hotelItem.getmName());
            categoryTextView.setText(hotelItem.getmStar());
            miscImg.setImageResource(hotelItem.getmDefaultImageResIdAcToHotel());
        }


        if (mItemGot instanceof Park) {// if itemGot is of type Park then fill in the corresponding Views
            Park parkItem = (Park) mItemGot;
            nameTextView.setText(parkItem.getmName());
            categoryTextView.setText(parkItem.getmParkCategory());
            miscImg.setImageResource(parkItem.getmDefaultImageResIdAcToPark());
        }

        if (mItemGot instanceof ReligiousPlace) {// if itemGot is of type ReligiousPlace then fill in the corresponding Views
            ReligiousPlace religiousPlaceItem = (ReligiousPlace) mItemGot;
            nameTextView.setText(religiousPlaceItem.getmName());
            categoryTextView.setText(religiousPlaceItem.getmReligion());
            miscImg.setImageResource(religiousPlaceItem.getmDefaultImageResIdAcToReligion());
        }


        if (mItemGot instanceof Restaurent) {// if itemGot is of type Restaurent then fill in the corresponding Views
            Restaurent restaurentItem = (Restaurent) mItemGot;
            nameTextView.setText(restaurentItem.getmName());
            categoryTextView.setText(restaurentItem.getmTiming());
            miscImg.setImageResource(restaurentItem.getmDefaultImageResIdAcToRest());
        }

        if (mItemGot instanceof Stadium) {// if itemGot is of type Stadium then fill in the corresponding Views
            Stadium stadiumItem = (Stadium) mItemGot;
            nameTextView.setText(stadiumItem.getmName());
            categoryTextView.setText(stadiumItem.getmSportsCategory());
            miscImg.setImageResource(stadiumItem.getmDefaultImageResIdAcToStad());
        }
        return listItemView;
    }
}
