package com.example.food.Favourite;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.CategoriesActivity;
import com.example.food.Home.HomeActivity;
import com.example.food.OrdersActivity;
import com.example.food.ProfileActivity;
import com.example.food.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class FavouriteActivity extends AppCompatActivity {

    TabLayout tabLayout;
    RecyclerView recyclerView;
    FavouriteAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        tabLayout = findViewById(R.id.tabLayout);

        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                tabLayout.getTabAt(2).select();
            }
        },100);
*/
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tabLayout.getSelectedTabPosition() == 0){

                    Intent intent =  new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                }else if(tabLayout.getSelectedTabPosition() == 1){
                    startActivity(new Intent(getApplicationContext(), CategoriesActivity.class));
                }else if(tabLayout.getSelectedTabPosition() == 2){
                    startActivity(new Intent(getApplicationContext(),FavouriteActivity.class));
                }else if(tabLayout.getSelectedTabPosition() == 3){
                     startActivity(new Intent(getApplicationContext(), OrdersActivity.class));
                }else if(tabLayout.getSelectedTabPosition() == 4){
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


        recyclerView = findViewById(R.id.recyclerFav);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new FavouriteAdapter(this,getMyList());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<FavouriteModel> getMyList(){

        ArrayList<FavouriteModel> models= new ArrayList<>();

        models.add(new FavouriteModel(R.drawable.pizza,"U.S Pizza","Italian","4.2","30-35 Mins"));
        models.add(new FavouriteModel(R.drawable.pasta,"Mondeal Food Plaza","Italian • French • Indian","4.1","20-25 Mins"));
        models.add(new FavouriteModel(R.drawable.dosa,"Navjivan Restaurant","Panjabi • South Indian • Chinese","4.0","10-15 Mins"));
        return models;
    }
}
