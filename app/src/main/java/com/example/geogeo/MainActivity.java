package com.example.geogeo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    DatabaseHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = DatabaseHandler.getInstance(getApplicationContext());
        db.open();
        Controller con = new Controller(this);
        con.bloßeintest02();
    }
}
