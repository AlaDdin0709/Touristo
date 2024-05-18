package com.example.touristo.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.touristo.Activies.Place0Activity;
import com.example.touristo.Activies.Place1Activity;
import com.example.touristo.R;

public class Map extends AppCompatActivity {
    private Button bizerte ,jendouba,sousse,kairouan,kasserine,sbz,gabes,tozeur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        init();
        /*
        bizerte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Map.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        jendouba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Map.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });*/
        sousse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Map.this, Place1Activity.class);
                startActivity(intent);
                finish();
            }
        });/*
        kairouan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Map.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        kasserine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Map.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });*/
        sbz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Map.this, Place0Activity.class);
                startActivity(intent);
                finish();
            }
        });/*
        gabes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Map.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        tozeur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Map.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });*/
    }
    public void init()
    {
        bizerte = findViewById(R.id.bizerte);
        jendouba =findViewById(R.id.jendouba);
        sousse =findViewById(R.id.sousse);
        kairouan =findViewById(R.id.kairouan);
        kasserine =findViewById(R.id.kasserine);
        sbz = findViewById(R.id.sbz);
        gabes =findViewById(R.id.gabes);
        tozeur =findViewById(R.id.tozeur);
}
}
