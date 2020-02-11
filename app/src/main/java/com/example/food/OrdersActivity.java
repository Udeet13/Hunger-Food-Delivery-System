package com.example.food;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.food.Past.PastFragment;
import com.google.android.material.tabs.TabLayout;

public class OrdersActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        tabLayout = findViewById(R.id.orderTablayout);
        viewPager = findViewById(R.id.orderViewPager);
        OrderPageAdapter adapter = new OrderPageAdapter(getSupportFragmentManager());

        //Adding Fragment
        adapter.AddFragment(new PastFragment(),"Past");
        adapter.AddFragment(new UpcomingFragment(),"Upcoming");
        //Adapter Setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
