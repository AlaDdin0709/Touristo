package com.example.touristo.Views;

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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.touristo.Controlers.Auth.Login;
import com.example.touristo.Controlers.Auth.Register;
import com.example.touristo.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {
    EditText sign_up_email , sign_up_name;
    EditText sign_up_password , confirm_password;
    Button sign_up_button;
    TextView loginRedirectText;
    ProgressBar progressBar;
    Register registerController = new Register(this);;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = registerController.getCurrentUser();
        if(currentUser != null && currentUser.isEmailVerified() ){
            Intent intent = new Intent(getApplicationContext() , LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        sign_up_email = findViewById(R.id.sign_up_email);
        sign_up_password = findViewById(R.id.sign_up_password);
        sign_up_button = findViewById(R.id.Sign_up_button);
        loginRedirectText = findViewById(R.id.loginRedirectText);
        confirm_password = findViewById(R.id.confirm_password);
        sign_up_name  = findViewById(R.id.sign_up_name);
        progressBar = findViewById(R.id.progressBar);



        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( RegisterActivity.this, LoginActivity.class );
                startActivity(intent);
                finish();
            }
        });

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                String email , password , confirm , name;
                email = sign_up_email.getText().toString();
                password = sign_up_password.getText().toString();
                confirm = confirm_password.getText().toString();
                name = sign_up_name.getText().toString();
                Boolean ok = Boolean.TRUE;
                if (TextUtils.isEmpty(name))
                {
                    Toast.makeText(RegisterActivity.this, "Enter a name!!!", Toast.LENGTH_SHORT).show();
                    ok = Boolean.FALSE;
                }
                if (TextUtils.isEmpty(email))
                {
                    Toast.makeText(RegisterActivity.this, "Enter an email!!!", Toast.LENGTH_SHORT).show();
                    ok = Boolean.FALSE;
                }
                if (TextUtils.isEmpty(password))
                {
                    Toast.makeText(RegisterActivity.this, "Enter a password!!!", Toast.LENGTH_SHORT).show();
                    ok = Boolean.FALSE;
                }
                if (TextUtils.isEmpty(confirm))
                {
                    Toast.makeText(RegisterActivity.this, "Fill the confirmation area!!!", Toast.LENGTH_SHORT).show();
                    ok = Boolean.FALSE;
                }
                if (password.equals(confirm) && ok == Boolean.TRUE)
                {
                    registerController.createUser(email, password, progressBar);
                } else if (ok == Boolean.FALSE) {
                    Toast.makeText(RegisterActivity.this, "Fill all fields please!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "Password problem", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }

}