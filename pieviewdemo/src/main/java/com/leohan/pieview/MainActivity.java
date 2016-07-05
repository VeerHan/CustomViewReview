package com.leohan.pieview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private PieView pieView;

    private PieData pieData;
    private ArrayList<PieData> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieView = (PieView) findViewById(R.id.pieView);
        pieData = new PieData("", 100);
        mData.add(pieData);
        pieData = new PieData("", 200);
        mData.add(pieData);
        pieData = new PieData("", 400);
        mData.add(pieData);
        pieData = new PieData("", 300);
        mData.add(pieData);
        pieData = new PieData("", 800);
        mData.add(pieData);
        pieView.setStartAngle(-90);
        pieView.setData(mData);
    }
}
