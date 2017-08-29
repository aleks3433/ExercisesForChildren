package com.example.smiling.exercisesforchildren;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class ColorsActivity extends AppCompatActivity {

    private RecyclerView mColorsRV;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<ColorsData> colorsData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        mColorsRV = (RecyclerView) findViewById(R.id.rv_colors);

        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mColorsRV.setLayoutManager(mLayoutManager);
        mColorsRV.setHasFixedSize(true);

        initializeData();
        initializeAdapter();

    }

    private void initializeData(){
        colorsData = new ArrayList<>();
        colorsData.add(new ColorsData(R.string.red, Color.RED));
        colorsData.add(new ColorsData(R.string.green, Color.GREEN));
        colorsData.add(new ColorsData(R.string.blue, Color.BLUE));
        colorsData.add(new ColorsData(R.string.yellow, Color.YELLOW));
    }

    private void initializeAdapter(){
        mAdapter = new ColorsAdapter(colorsData);
        mColorsRV.setAdapter(mAdapter);
    }

}
