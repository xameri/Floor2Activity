package com.example.xusenweli.floor2activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textViewData;
    Double width;
    Double length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewData = (TextView) findViewById(R.id.textViewData);

        Bundle extras = getIntent().getExtras();
        width = extras.getDouble("MainWidth");
        length = extras.getDouble("MainLength");
        Double floorResult = width * length;
        //textViewData.setText("Flooring needed : " + floorResult);

        textViewData.setText("Width is " + width + " " + "and Length is " + length + " " + "and flooring needed is " + floorResult);

    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("NewName", width+"@css.edu");
        intent.putExtra("NewNum", length * 2);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}