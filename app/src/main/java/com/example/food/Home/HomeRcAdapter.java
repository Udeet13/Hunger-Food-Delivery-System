package com.example.food.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.R;

import java.util.ArrayList;

public class HomeRcAdapter extends RecyclerView.Adapter<HomeHolder> {

   Context c;
   ArrayList<HomeModel> models; //array tto create a list of array which parameters define in our model class

    public HomeRcAdapter(Context c, ArrayList<HomeModel> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_cardrv,null);
        return new HomeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {

        holder.name.setText(models.get(position).getName());
        holder.mImageView.setImageResource(models.get(position).getImage());
        holder.type.setText(models.get(position).getType());
        holder.ratings.setText(models.get(position).getRatings());
        holder.etd.setText(models.get(position).getEtd());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
