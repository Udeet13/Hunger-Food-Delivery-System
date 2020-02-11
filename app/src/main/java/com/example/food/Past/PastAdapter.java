package com.example.food.Past;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.R;

import java.util.ArrayList;

public class PastAdapter extends RecyclerView.Adapter<PastViewHolder> {

    private Context context;
    private ArrayList<PastModel> models;

    public PastAdapter(Context context,ArrayList<PastModel> models){
        this.context= context;
        this.models = models;
    }

    @NonNull
    @Override
    public PastViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order_past,null);
        return new PastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PastViewHolder holder, int position) {

        holder.restaurant_name.setText(models.get(position).getRestaurant_name());
        holder.img.setImageResource(models.get(position).getImage());
        holder.date.setText(models.get(position).getDate());
        holder.time.setText(models.get(position).getTime());
        holder.quantity.setText(String.valueOf(models.get(position).getQuantity()));
        holder.dish_name.setText(models.get(position).getDish_name());
        holder.order_id.setText(models.get(position).getOrder_id());
        holder.delivery_boy_name.setText(models.get(position).getDeliver_boy_name());
        holder.amount.setText(String.valueOf(models.get(position).getAmount()));
    }

    @Override
    public  int getItemCount() {
        return models.size();
    }



}
