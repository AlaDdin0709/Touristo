package com.example.touristo.Controlers.Auth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.touristo.Views.MainActivityAladdin;
import com.example.touristo.R;
import com.example.touristo.Views.LoginActivity;
import com.example.touristo.Views.RegisterActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;

public class Register extends AppCompatActivity {

    FirebaseAuth mAuth;
    RegisterActivity registerActivity;

    public Register(RegisterActivity registerActivity){
        mAuth = FirebaseAuth.getInstance();
        this.registerActivity = registerActivity;
    }
    public FirebaseUser getCurrentUser(){
        return mAuth.getCurrentUser();
    }

    public void createUser(String email, String password, ProgressBar progressBar){
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);
                        if (task.isSuccessful()) {

                            FirebaseUser user = mAuth.getCurrentUser();
                            if (user != null) {
                                Log.i("Ala","here 0");
                                user.sendEmailVerification()
                                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                task.isSuccessful();
                                            }
                                        });
                            }
                            if (getCurrentUser().isEmailVerified()) {
                                Intent intent = new Intent(registerActivity.getApplicationContext(), LoginActivity.class);
                                registerActivity.startActivity(intent);
                                registerActivity.finish();
                            }
                            else{
                                Toast.makeText(registerActivity , "Verify you email then Login",Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(registerActivity , "Authentification failed or you didn't verify you email!!",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

}