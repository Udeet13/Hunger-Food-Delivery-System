package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    Button button;
    TabLayout tabIndicator;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        button = findViewById(R.id.get_started);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroActivity.this,LogIn.class);
                startActivity(i);

            }
        });


        //ini views
        tabIndicator = findViewById(R.id.tab_indicator);

        //fill list screen

        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Food\nOn Demand","\nGet your favourite food on demand,\nAt any time and anywhere",R.drawable.undraw_street_food_hm5i));
        mList.add(new ScreenItem("\nSimple & Easy","\nEasy to use, easy to understand\nand easy to operate",R.drawable.undraw_note_list_etto));
        mList.add(new ScreenItem("\nHot & Fresh","\nEnjoy fresh & hot\nfood at any time,anywhere.",R.drawable.undraw_on_the_way_ldaq));
        // setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);

        //setup tablayout with viewpager

        tabIndicator.setupWithViewPager(screenPager);



        tv = findViewById(R.id.textView2);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this,SignUp.class));
            }

        });


    }
}
