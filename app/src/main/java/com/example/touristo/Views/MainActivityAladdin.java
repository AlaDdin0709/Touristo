package com.example.touristo.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.touristo.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivityAladdin extends AppCompatActivity {

    Button log_out_button;
    TextView text_view;
    FirebaseAuth mAuth;
    FirebaseUser user;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        log_out_button = findViewById(R.id.log_out_button);
        text_view = findViewById(R.id.text_view);
        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();
        if(user == null){
            Intent intent = new Intent(getApplicationContext() , LoginActivity.class);
            startActivity(intent);
            finish();
        }
        else{
            text_view.setText(user.getEmail());
        }

        log_out_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext() , LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }



}