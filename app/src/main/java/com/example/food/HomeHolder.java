package com.example.food;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeHolder extends RecyclerView.ViewHolder {

    ImageView mImageView;
    TextView name,type,etd,ratings;


    public HomeHolder(@NonNull View itemView) {
        super(itemView);
        this.mImageView = itemView.findViewById(R.id.itmimg1);
        this.name = itemView.findViewById(R.id.namerc);
        this.type = itemView.findViewById(R.id.typerc);
        this.etd = itemView.findViewById(R.id.etdrc);
        this.ratings = itemView.findViewById(R.id.ratingsrc);

    }
}
