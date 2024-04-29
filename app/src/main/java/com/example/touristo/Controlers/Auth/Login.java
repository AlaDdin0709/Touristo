package com.example.touristo.Controlers.Auth;

import android.content.Intent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.touristo.MainActivity;
import com.example.touristo.Views.LoginActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login {

    FirebaseAuth mAuth;
    LoginActivity loginActivity;

    public Login(LoginActivity loginActivity){
        mAuth = FirebaseAuth.getInstance();
        this.loginActivity = loginActivity;
    }

    public FirebaseUser getCurrentUser(){
        return mAuth.getCurrentUser();
    }

    public void signUp(String email, String password, ProgressBar progressBar){
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);
                        if (task.isSuccessful()) {
                            Intent intent = new Intent( loginActivity.getApplicationContext(), MainActivity.class );
                            loginActivity.startActivity(intent);
                            loginActivity.finish();
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(loginActivity, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}