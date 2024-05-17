package com.example.touristo.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.touristo.R;

public class Form extends AppCompatActivity {
private Button btnSubmit,btnSkip;
private RadioButton beaches,activities,events,sites,shopping,ff,adventures,mounts;
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
        mounts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Décocher le premier bouton radio
                beaches.setChecked(false);
                // Cocher le deuxième bouton radio
                mounts.setChecked(true);
}
        });
        beaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Décocher le premier bouton radio
                mounts.setChecked(false);
                // Cocher le deuxième bouton radio
                beaches.setChecked(true);
}
        });
        sites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Décocher le premier bouton radio
                ff.setChecked(false);
                // Cocher le deuxième bouton radio
                sites.setChecked(true);
            }
        });
        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Décocher le premier bouton radio
                sites.setChecked(false);
                // Cocher le deuxième bouton radio
                ff.setChecked(true);
            }
        });
        activities .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Décocher le premier bouton radio
                adventures.setChecked(false);
                // Cocher le deuxième bouton radio
                activities .setChecked(true);
            }
        });
        adventures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Décocher le premier bouton radio
                activities .setChecked(false);
                // Cocher le deuxième bouton radio
                adventures.setChecked(true);
            }
        });
        events .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Décocher le premier bouton radio
                shopping.setChecked(false);
                // Cocher le deuxième bouton radio
                events .setChecked(true);
            }
        });
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Décocher le premier bouton radio
                events .setChecked(false);
                // Cocher le deuxième bouton radio
                shopping.setChecked(true);
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
        mounts=findViewById(R.id.mounts);
        adventures=findViewById(R.id.adventures);
        ff=findViewById(R.id.ff);
        shopping=findViewById(R.id.shopping);
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