package com.example.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingViewHolder> {

    private Context context;
    private ArrayList<UpcomingModel> models;

    public UpcomingAdapter(Context context, ArrayList<UpcomingModel> models) {

        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public UpcomingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order_upcoming,null);
        return new UpcomingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UpcomingViewHolder holder, int position) {

    holder.restaurant_name.setText(models.get(position).getRestaurant_name());
    holder.img.setImageResource(models.get(position).getImage());
    holder.date.setText(models.get(position).getDate());
    holder.time.setText(models.get(position).getTime());
    holder.quantity.setText(String.valueOf(models.get(position).getQuantity()));
    holder.dish_name.setText(models.get(position).getDish_name());
    holder.order_id.setText(models.get(position).getOrder_id());
    holder.delivery_boy_name.setText(models.get(position).getDelivery_boy_name());
    holder.amount.setText(String.valueOf(models.get(position).getAmount()));

    }

    @Override
    public int getItemCount() {

        return models.size();
    }

}
