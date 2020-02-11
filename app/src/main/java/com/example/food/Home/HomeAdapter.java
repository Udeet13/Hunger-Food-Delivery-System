package com.example.food.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.food.R;

import java.util.List;

public class HomeAdapter extends PagerAdapter {

    private List<HomeModel> models;
    private LayoutInflater layoutInflater;
    private Context context;

    public HomeAdapter(List<HomeModel> models, Context context) {
        this.models = models;
        this.context = context;
    }


    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_listitem, container,false);
        ImageView imageView;
        TextView name,type,rating,etd;
        imageView = view.findViewById(R.id.itmimg);
        name = view.findViewById(R.id.ItmName);
        type = view.findViewById(R.id.itmType);
        rating = view.findViewById(R.id.ratings);
        etd = view.findViewById(R.id.etd);

        imageView.setImageResource(models.get(position).getImage());
        name.setText(models.get(position).getName());
        type.setText(models.get(position).getType());
        rating.setText(models.get(position).getRatings());
        etd.setText(models.get(position).getEtd());

        container.addView(view,0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}

