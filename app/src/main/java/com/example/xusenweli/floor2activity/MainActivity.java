package com.example.xusenweli.floor2activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextRoomWidth;
    EditText editTextRoomLength;

    // constant to determine which sub-activity returns
    private static final int CIS3334_REQUEST_CODE = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextRoomWidth = (EditText) findViewById(R.id.editTextRoomWidth);
        editTextRoomLength = (EditText) findViewById(R.id.editTextRoomLength);
    }

    public void onButtonClick( View view) {
        // Call the second activity
        Double width = Double.parseDouble(editTextRoomWidth.getText().toString());
        Double length = Double.parseDouble(editTextRoomLength.getText().toString() );
        Intent secActIntent = new Intent(this, SecondActivity.class);
        secActIntent.putExtra("MainWidth", width);
        secActIntent.putExtra("MainLength", length);
        //startActivity(secActIntent)     // if no result is returned
        startActivityForResult(secActIntent, CIS3334_REQUEST_CODE);
    }
}