package com.example.food.Past;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.R;

import java.util.ArrayList;


public class PastFragment extends Fragment {

    RecyclerView recyclerView;
    PastAdapter adapter;
    ImageView imageView;


    public PastFragment() {
        // Required empty public constructor
    }


   // @Override
    //public void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_past, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);

        recyclerView = getView().findViewById(R.id.pastRcyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new PastAdapter(getActivity(),getMyList());
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<PastModel> getMyList() {
        ArrayList<PastModel> models =  new ArrayList<>();

        models.add(new PastModel("Sankalp Restaurant",R.drawable.pasta,"31 Dec 2019","04:00 PM",1,179,"Gujarati Thali Full","#562384","Prakash Rao"));
        models.add(new PastModel("Kalpana Food Plaza",R.drawable.pizza,"1 Jan 2020","03:00 PM",1,179,"Gujarati Thali Full","#562384","Prakash Rao"));
        return models;
    }


}
