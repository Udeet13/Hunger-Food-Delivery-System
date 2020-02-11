package com.example.food;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UpcomingViewHolder extends RecyclerView.ViewHolder {

    TextView restaurant_name, date,time,quantity,dish_name,order_id,delivery_boy_name,amount;
    ImageView img;

    public UpcomingViewHolder(@NonNull View itemView) {
        super(itemView);

        this.restaurant_name = itemView.findViewById(R.id.restaurant_name);
        this.img = itemView.findViewById(R.id.past_image);
        this.date = itemView.findViewById(R.id.date);
        this.time =  itemView.findViewById(R.id.time);
        this.quantity = itemView.findViewById(R.id.quantity);
        this.dish_name = itemView.findViewById(R.id.dish_name);
        this.order_id = itemView.findViewById(R.id.order_id);
        this.delivery_boy_name = itemView.findViewById(R.id.delivery_boy_name);
        this.amount = itemView.findViewById(R.id.amount);

    }

}
