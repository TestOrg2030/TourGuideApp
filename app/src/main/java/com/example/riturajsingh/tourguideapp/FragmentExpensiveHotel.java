package com.example.riturajsingh.tourguideapp;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
/// This is Fragment present in Hotel Activity //
public class FragmentExpensiveHotel extends Fragment {
    private ListGiver mListGiver;
    private Context mContext;/// Create member variables as required by the Fragment

    public FragmentExpensiveHotel() {
        // Required empty public constructor
    }

    @Override  ///This method infaltes the Fragment with corresponding Data Model
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ///Infalte and get reference to the View ///
        View v = inflater.inflate(R.layout.fragment_expensive_hotel, container, false);
        ////Get the Data Model using mListGiver variable , Note mListGiver is Initialized in OnAttach() which runs before this method///
        ArrayList<OutingSpots> ExpensiveHotelList = mListGiver.ListOfExpensiveHotels();
        ////Create an adapter instance using CommonAdapter Class ///
        CommonAdapter commonAdapter = new CommonAdapter(mContext, 0, ExpensiveHotelList);
        ///Get Refernce to ListView  present in the Fragment///
        ListView hotelFragmentListView = v.findViewById(R.id.listview_fragment_expensive_hotel);
        ////Set Item Click Listener on ListView Items ////
        hotelFragmentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Create and Intent
                Intent intent = new Intent(mContext, DetailsActivity.class);
                ///add Information related to Activity , Fragment and Position of itemclicked /////
                intent.putExtra("activityName", "HotelsActivity");
                intent.putExtra("fragmentName", "ExpensiveHotel");
                intent.putExtra("positionClicked", Integer.toString(i));
                /// Start the new Acitivty
                startActivity(intent);
            }
        });
        //Set adapter on the ListView so as to inflate the ListView////
        hotelFragmentListView.setAdapter(commonAdapter);
        //Inflate the layout for this fragment
        return v;
    }
    ///This method runs before above method ///
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;// Intialize the context //
        mListGiver = new ListGiver(mContext);/// Initialize the ListGiver with the corresponding context
    }

}
