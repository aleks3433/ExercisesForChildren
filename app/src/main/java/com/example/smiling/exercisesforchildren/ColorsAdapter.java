package com.example.smiling.exercisesforchildren;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Smiling on 26.08.2017.
 */

public class ColorsAdapter extends RecyclerView.Adapter<ColorsAdapter.ColorsDataViewHolder> {

    public static class ColorsDataViewHolder extends RecyclerView.ViewHolder {

        RecyclerView colorsRecyclerView;
        TextView colorName;
        TextView color;

        ColorsDataViewHolder(View itemView) {
            super(itemView);
            colorsRecyclerView = (RecyclerView) itemView.findViewById(R.id.rv_colors);
            colorName = (TextView)itemView.findViewById(R.id.color_name);
            color = (TextView)itemView.findViewById(R.id.color);
        }

    }

    List<ColorsData> colorsData;
    ColorsAdapter(List<ColorsData> colorsData){
        this.colorsData = colorsData;
    }

    @Override
    public int getItemCount() {
        return colorsData.size();
    }

    @Override
    public ColorsDataViewHolder onCreateViewHolder(ViewGroup colorsDataViewGroup, int colorsDataViewType) {
        View colorsDataView = LayoutInflater.from(colorsDataViewGroup.getContext()).inflate(R.layout.recycler_view_layout, colorsDataViewGroup, false);
        ColorsDataViewHolder colorsDataViewHolder = new ColorsDataViewHolder(colorsDataView);
        return colorsDataViewHolder;
    }

    @Override
    public void onBindViewHolder(ColorsDataViewHolder holder, int position) {
        holder.colorName.setText(colorsData.get(position).colorName);
        holder.colorName.setTextColor(colorsData.get(position).color);
        holder.color.setBackgroundColor(colorsData.get(position).color);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
