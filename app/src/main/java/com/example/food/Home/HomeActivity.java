package com.example.food.Home;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.food.CategoriesActivity;
import com.example.food.Favourite.FavouriteActivity;
import com.example.food.OrdersActivity;
import com.example.food.ProfileActivity;
import com.example.food.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    ViewPager viewPager;
    HomeAdapter adapter;
    HomeRcAdapter adapter1;
    List<HomeModel> models;
    TabLayout tabindicator,tabLayout;
    RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //tab Layout indicator
        tabindicator = findViewById(R.id.tabLayout1);
        tabLayout = findViewById(R.id.tabLayout);

        models = new ArrayList<>();
        models.add(new HomeModel(R.drawable.biriyani,"Chicken Biriyani","North Indian","4.5","20-25 Mins"));
        models.add(new HomeModel(R.drawable.northernoodles,"HongKong Noodles","Chinese","4.2","40-45 Mins"));
        models.add(new HomeModel(R.drawable.vegnoodles,"Chinese Noodles","Indian Chinese","4.1","10-20 Mins"));

        adapter = new HomeAdapter(models,this);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setClipToPadding(false);
        viewPager.setPadding(70,0,70,0);
        viewPager.setPageMargin(5);
        viewPager.setCurrentItem(1);

        //setup tablayout with view pager

        tabindicator.setupWithViewPager(viewPager);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter1 = new HomeRcAdapter(this,getMyList());
        mRecyclerView.setAdapter(adapter1);
        mRecyclerView.setNestedScrollingEnabled(false);
    //    mRecyclerView.setOnTouchListener(new View.OnTouchListener() {
      //      @Override
        //    public boolean onTouch(View v, MotionEvent event) {
          //      return true;
          //  }
       // });


        // Icon color of Tab Layout means tab indicator
        ColorStateList colors;
        if (Build.VERSION.SDK_INT >= 23) {
            colors = getResources().getColorStateList(R.color.indicatorun_home, getTheme());
        }
        else {
            colors = getResources().getColorStateList(R.color.indicatorun_home);
        }

        for (int i = 0; i <tabindicator.getTabCount(); i++) {
            TabLayout.Tab tab = tabindicator.getTabAt(i);
            Drawable icon = tab.getIcon();

            if (icon != null) {
                icon = DrawableCompat.wrap(icon);
                DrawableCompat.setTintList(icon, colors);
            }
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tabLayout.getSelectedTabPosition() == 0){
                }else if(tabLayout.getSelectedTabPosition() == 1){
                   Intent intent =  new Intent(getApplicationContext(), CategoriesActivity.class);
                    startActivity(intent);
                }else if(tabLayout.getSelectedTabPosition() == 2){
                    startActivity(new Intent(getApplicationContext(), FavouriteActivity.class));
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
    }

    private ArrayList<HomeModel> getMyList() {

        ArrayList<HomeModel> models= new ArrayList<>();

        models.add(new HomeModel(R.drawable.pizza,"U.S Pizza","Italian","4.2","30-35 Mins"));
        models.add(new HomeModel(R.drawable.pasta,"Mondeal Food Plaza","Italian•French•Indian","4.1","20-25 Mins"));
        models.add(new HomeModel(R.drawable.dosa,"Navjivan Restaurant","Panjabi•South Indian•Chinese","4.0","10-15 Mins"));
        return models;
    }
}
