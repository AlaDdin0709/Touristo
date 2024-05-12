package com.example.touristo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Form extends AppCompatActivity {
private Button btnSubmit,btnSkip;
private RadioButton beaches,activities,events,sites;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        init();
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Form.this, Map.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void init()
    {
        btnSubmit=findViewById(R.id.btnSubmit);
        btnSkip=findViewById(R.id.btnSkip);
        beaches=findViewById(R.id.beaches);
        activities=findViewById(R.id.activities);
        events=findViewById(R.id.events);
        sites=findViewById(R.id.sites);
    }
}