package com.example.edik.simpleviewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class WeatherFragment extends Fragment{

    View view;



    public WeatherFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.weather_fragment, container, false);
        ImageView weatherImage = view.findViewById(R.id.weatherImage);
        Picasso.with(getActivity().getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/13/14/34/cat-1977415_960_720.jpg").into(weatherImage);
        return view;
    }




}
