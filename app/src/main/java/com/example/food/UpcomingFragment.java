package com.example.food;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class UpcomingFragment extends Fragment {

    RecyclerView recyclerView;
    UpcomingAdapter adapter;
    ImageView imageView;


    public UpcomingFragment() {
        // Required empty public constructor
    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upcoming, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);

        recyclerView = getView().findViewById(R.id.upcomingRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new UpcomingAdapter(getActivity(), getMyList());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<UpcomingModel> getMyList() {
        ArrayList<UpcomingModel> models = new ArrayList<>();

        models.add(new UpcomingModel(R.drawable.biriyani,"21 dec 2019","01:00 PM","Navjivan Restaurant",1,299,"Pasta Italiano","#56462","Arijit Singh"));
        models.add(new UpcomingModel(R.drawable.chinese,"1 jan 2020","05:00 PM","Vanagi Restaurant",2,99,"Veg Manchurian","#56462","Mohit Chauhan"));
        return models;
    }


}
