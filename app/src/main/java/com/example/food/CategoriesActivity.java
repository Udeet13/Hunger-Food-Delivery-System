package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.GridView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.food.Favourite.FavouriteActivity;
import com.example.food.Home.HomeActivity;
import com.google.android.material.tabs.TabLayout;


public class CategoriesActivity extends AppCompatActivity {



    //grid View informations
    GridView gridView;

    String[] values = {
            "South Indian",
            "Chinese",
            "Italian",
            "Thai",
            "Mexican",
            "Fruits",
            "Fast Food",
            "French",
            "Labanese",
            "Belgian"
    };

    int[] images = {
            R.drawable.southindian,
            R.drawable.chinese,
            R.drawable.italian,
            R.drawable.thai,
            R.drawable.mexican,
            R.drawable.fruits,
            R.drawable.fastfood,
            R.drawable.french,
            R.drawable.lebanese,
            R.drawable.belgian
    };



    TabLayout tabL;
    private SearchView search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        //Grid View
        gridView = findViewById(R.id.gridView);


        GridAdapter gridAdapter = new GridAdapter(this,values,images);

        gridView.setAdapter(gridAdapter);


        //Search View
        search = findViewById(R.id.searchView);
        search.setBackgroundResource(R.drawable.searchview_rounded);
        search.onActionViewExpanded();
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                search.setIconified(false);
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                search.clearFocus();
            }

        },300);

        //Tab Layout
        tabL=findViewById(R.id.tabLayout);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                tabL.getTabAt(1).select();
            }
        },100);
        tabL.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tabL.getSelectedTabPosition() == 0){

                    Intent intent =  new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                }else if(tabL.getSelectedTabPosition() == 1){
                }else if(tabL.getSelectedTabPosition() == 2){
                    startActivity(new Intent(getApplicationContext(), FavouriteActivity.class));
                }else if(tabL.getSelectedTabPosition() == 3){
                    startActivity(new Intent(getApplicationContext(), OrdersActivity.class));
                }else if(tabL.getSelectedTabPosition() == 4){
                    startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}

