package com.example.sabrina_32_3m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> colorTypeList = new ArrayList<>();
    private RecyclerView rvColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData() {
        colorTypeList.add("Red");
        colorTypeList.add("White");
        colorTypeList.add("Black");
        colorTypeList.add("Blue");
        colorTypeList.add("Pink");
        colorTypeList.add("Orange");
        colorTypeList.add("Grey");
        colorTypeList.add("Green");
        colorTypeList.add("Yellow");
        colorTypeList.add("Brown");
        colorTypeList.add("Purple");
        initAdapter();
    }

    private void initAdapter() {
        ColorAdapter adapter = new ColorAdapter(colorTypeList);
        rvColors.setAdapter(adapter);
    }

    private void initView() {
        rvColors = findViewById(R.id.rv_colors);
    }
}