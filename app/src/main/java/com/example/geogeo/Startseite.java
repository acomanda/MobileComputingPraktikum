package com.example.geogeo;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Startseite extends AppCompatActivity {

    TextView txtWillkommen;
    TextView txtGeo;
    Button btnSpielen;
    Button btnOption;
    Button btnBeenden;
    Button test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_startseite);

        txtWillkommen = findViewById(R.id.txtWillkommen);
        txtGeo = findViewById(R.id.txtGeo);
        btnSpielen = findViewById(R.id.btnSpielen);
        btnOption = findViewById(R.id.btnOption);
        btnBeenden = findViewById(R.id.btnBeenden);
        test = findViewById(R.id.testbutton);
    }


    public void spielenClick(View view) {
        Intent spielenIntent = new Intent(this, homescreen.class);
        startActivity(spielenIntent);
    }


    public void aboutUsClick(View view) {
        Intent aboutUsIntent = new Intent(this, AboutUs.class);
        startActivity(aboutUsIntent);
    }


    public void quitClick(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void testpicsact(View view){
        Intent intent = new Intent(this, TestPics.class);
        startActivity(intent);
    }
}
