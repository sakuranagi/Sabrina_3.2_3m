package com.example.sabrina_32_3m;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ColorAdapter extends RecyclerView.Adapter<ColorViewHolder> {

    private ArrayList<String> colorTypeList;

    public ColorAdapter(ArrayList<String> colorNameList) {
        this.colorTypeList = colorNameList;
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ColorViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_colors, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder holder, int position) {

        holder.OnBind(colorTypeList.get(position));
    }

    @Override
    public int getItemCount() {
        return colorTypeList.size();
    }
}
