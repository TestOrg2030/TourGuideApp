package com.example.riturajsingh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

//////This class will show the details of the selected item from the listview of corresponding category ///
public class DetailsActivity extends AppCompatActivity {
    ///Get reference to ListGiver class so as to get Access to all the types of Lists //////
    private ListGiver mListGiver = new ListGiver(DetailsActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ///Get the intent sent from other activities ///
        Intent intent = getIntent();
        //// Get the name of Activity and the position of listItem clicked ///////
        String activityName = intent.getStringExtra("activityName");
        int positionClicked = Integer.parseInt(getIntent().getStringExtra("positionClicked"));
        ///// get refernce to all the Views so that they can be later on inflated with Data ///
        TextView textView_Name = findViewById(R.id.detailsActivity_name);
        TextView textView_Address = findViewById(R.id.detailsActivity_address);
        TextView textView_Description = findViewById(R.id.detailsActivity_description);
        TextView textView_Phone = findViewById(R.id.detailsActivity_phone);
        TextView textView_Misc1_title = findViewById(R.id.detailsActivity_misc1_title);
        TextView textView_Misc2_title = findViewById(R.id.detailsActivity_misc2_title);
        TextView textView_Misc1 = findViewById(R.id.detailsActivity_misc1);
        TextView textView_Misc2 = findViewById(R.id.detailsActivity_misc2);
        ImageView imageView_detail = findViewById(R.id.detail_img_view);
        //First resolve the Activity name ////
        switch (activityName) {
            case "EventsActivity":/// if Activity name is EventsActivity then inflate the corresponding Views appropriately///
                Event ev = (Event) mListGiver.Listof5Events().get(positionClicked);
                textView_Name.setText(ev.getmName());
                textView_Address.setText(ev.getmAddress());
                textView_Description.setText(ev.getmDescription());
                textView_Phone.setText(ev.getmPhone());
                textView_Misc1_title.setText("Date");
                textView_Misc1.setText(ev.getmDate());
                textView_Misc2_title.setText("Timing");
                textView_Misc2.setText(ev.getmTiming());
                imageView_detail.setImageResource(ev.getmImageResIdAcToEvent());
                break;
            case "ParksActivity":/// if Activity name is ParksActivity then inflate the corresponding Views appropriately///
                Park p = (Park) mListGiver.Listof10Parks().get(positionClicked);
                textView_Name.setText(p.getmName());
                textView_Address.setText(p.getmAddress());
                textView_Description.setText(p.getmDescription());
                textView_Phone.setText(p.getmPhone());
                textView_Misc1_title.setText("Type");
                textView_Misc1.setText(p.getmParkCategory());
                textView_Misc2_title.setText("Timing");
                textView_Misc2.setText(p.getmTiming());
                imageView_detail.setImageResource(p.getmImageResIdAcToPark());
                break;
            case "ReligiousPlacesActivity":/// if Activity name is ReligiousPlacesActivity then inflate the corresponding Views appropriately///
                ReligiousPlace rel = (ReligiousPlace) mListGiver.Listof10ReligiousPlaces().get(positionClicked);
                textView_Name.setText(rel.getmName());
                textView_Address.setText(rel.getmAddress());
                textView_Description.setText(rel.getmDescription());
                textView_Phone.setText(rel.getmPhone());
                textView_Misc1_title.setText("Religion");
                textView_Misc1.setText(rel.getmReligion());
                textView_Misc2_title.setText("Rating");
                textView_Misc2.setTextSize((float) 24.0);
                textView_Misc2.setText(rel.getmRating());
                imageView_detail.setImageResource(rel.getmImageResIdAcToReligion());
                break;
            case "StadiumsActivity":/// if Activity name is StadiumsActivity then inflate the corresponding Views appropriately///
                Stadium s = (Stadium) mListGiver.Listof5Stadiums().get(positionClicked);
                textView_Name.setText(s.getmName());
                textView_Address.setText(s.getmAddress());
                textView_Description.setText(s.getmDescription());
                textView_Phone.setText(s.getmPhone());
                textView_Misc1_title.setText("Type");
                textView_Misc1.setText(s.getmSportsCategory());
                textView_Misc2_title.setText("Timing");
                textView_Misc2.setText(s.getmTiming());
                imageView_detail.setImageResource(s.getmImageResIdAcToStad());
                break;
            case "HotelsActivity":/// if Activity name is HotelsActivity then inflate the corresponding Views appropriately///
                String fragmentName = getIntent().getStringExtra("fragmentName");
                //Resolve fragmentname  for Activty which has fragments////
                switch (fragmentName) {
                    case "CheapHotel":/// if fragment name is CheapHotel then inflate the corresponding Views appropriately///
                        Hotel ch = (Hotel) mListGiver.ListOfCheapHotels().get(positionClicked);
                        textView_Name.setText(ch.getmName());
                        textView_Address.setText(ch.getmAddress());
                        textView_Description.setText(ch.getmDescription());
                        textView_Phone.setText(ch.getmPhone());
                        textView_Misc1_title.setText("Rating");
                        textView_Misc1.setText(ch.getmStar());
                        textView_Misc2_title.setText("Price");
                        textView_Misc2.setText(ch.getmPrice());
                        imageView_detail.setImageResource(ch.getmImageResIdAcToHotel());
                        break;
                    case "MidHotel":/// if fragment name is MidHotel then inflate the corresponding Views appropriately///
                        Hotel mh = (Hotel) mListGiver.ListOfMidPriceHotels().get(positionClicked);
                        textView_Name.setText(mh.getmName());
                        textView_Address.setText(mh.getmAddress());
                        textView_Description.setText(mh.getmDescription());
                        textView_Phone.setText(mh.getmPhone());
                        textView_Misc1_title.setText("Rating");
                        textView_Misc1.setText(mh.getmStar());
                        textView_Misc2_title.setText("Price");
                        textView_Misc2.setText(mh.getmPrice());
                        imageView_detail.setImageResource(mh.getmImageResIdAcToHotel());
                        break;
                    case "ExpensiveHotel":/// if fragment name is ExpensiveHotel then inflate the corresponding Views appropriately///
                        Hotel eh = (Hotel) mListGiver.ListOfExpensiveHotels().get(positionClicked);
                        textView_Name.setText(eh.getmName());
                        textView_Address.setText(eh.getmAddress());
                        textView_Description.setText(eh.getmDescription());
                        textView_Phone.setText(eh.getmPhone());
                        textView_Misc1_title.setText("Rating");
                        textView_Misc1.setText(eh.getmStar());
                        textView_Misc2_title.setText("Price");
                        textView_Misc2.setText(eh.getmPrice());
                        imageView_detail.setImageResource(eh.getmImageResIdAcToHotel());
                        break;
                }
            case "RestaurentsActivity":/// if Activity name is RestaurentsActivity then inflate the corresponding Views appropriately///
                fragmentName = getIntent().getStringExtra("fragmentName");
                switch (fragmentName) {
                    //Resolve fragmentname  for Activty which has fragments////
                    case "NonVegRestaurents":/// if fragment name is NonVegRestaurents then inflate the corresponding Views appropriately///
                        Restaurent nonrest = (Restaurent) mListGiver.ListOfNonVegRestaurents().get(positionClicked);
                        textView_Name.setText(nonrest.getmName());
                        textView_Address.setText(nonrest.getmAddress());
                        textView_Description.setText(nonrest.getmDescription());
                        textView_Phone.setText(nonrest.getmPhone());
                        textView_Misc1_title.setText("Timing");
                        textView_Misc1.setText(nonrest.getmTiming());
                        textView_Misc2_title.setText("Type");
                        textView_Misc2.setText(nonrest.getmFoodCategory());
                        imageView_detail.setImageResource(nonrest.getmImageResIdAcToRest());
                        break;
                    case "VegRestaurents":/// if fragment name is VegRestaurents then inflate the corresponding Views appropriately///
                        Restaurent vegrest = (Restaurent) mListGiver.ListOfVegRestaurents().get(positionClicked);
                        textView_Name.setText(vegrest.getmName());
                        textView_Address.setText(vegrest.getmAddress());
                        textView_Description.setText(vegrest.getmDescription());
                        textView_Phone.setText(vegrest.getmPhone());
                        textView_Misc1_title.setText("Timing");
                        textView_Misc1.setText(vegrest.getmTiming());
                        textView_Misc2_title.setText("Type");
                        textView_Misc2.setText(vegrest.getmFoodCategory());
                        imageView_detail.setImageResource(vegrest.getmImageResIdAcToRest());
                        break;
                }
        }
    }
}
