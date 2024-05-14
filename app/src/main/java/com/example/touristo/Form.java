package com.example.touristo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

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
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suggestDestination();
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
    public void suggestDestination() {
        String destination = "";

        // Question 1: Do you prefer sun and beaches or mountainous landscapes?
        if (beaches.isChecked()) {
            destination = "Northern Tunisia";
        } else  {
            destination = "Central Tunisia";
        }

        // Question 2: Do you prefer relaxing activities or exciting adventures?
        if (activities.isChecked()) {
            destination = "Southern Tunisia";
        } else  {
            destination = "Northern Tunisia";
        }

        // Question 3: Do you prefer cultural events or places for shopping and entertainment?
        if (events.isChecked()) {
            destination = "Central Tunisia";
        } else  {
            destination = "Northern Tunisia";
        }

        // Question 4: Are you interested in local flora and fauna or archaeological sites?
        if (sites.isChecked()) {
            destination = "Southern Tunisia";
        } else  {
            destination = "Central Tunisia";
        }
        String suggestionMessage = "We suggest you visit " + destination + ".";
        Toast.makeText(getApplicationContext(), suggestionMessage, Toast.LENGTH_LONG).show();
    }
}