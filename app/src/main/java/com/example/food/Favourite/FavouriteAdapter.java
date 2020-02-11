package com.example.food.Favourite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.R;

import java.util.ArrayList;

public class FavouriteAdapter extends RecyclerView.Adapter<HomeHolder> {

    private Context context;
    private ArrayList<FavouriteModel> models;


    public FavouriteAdapter(Context context, ArrayList<FavouriteModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cardrv,null);
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
