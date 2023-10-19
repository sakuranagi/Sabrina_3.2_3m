package com.example.sabrina_32_3m;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ColorViewHolder extends RecyclerView.ViewHolder {

    private TextView tvColorType;
    public ColorViewHolder(@NonNull View itemView) {
        super(itemView);
        tvColorType = itemView.findViewById(R.id.tv_colors_type);

    }

    public void OnBind(String colorType){
        tvColorType.setText(colorType);

    }
}
