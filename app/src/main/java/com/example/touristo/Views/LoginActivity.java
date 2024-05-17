
package com.example.touristo.Views;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.example.touristo.Controlers.Auth.Login;
import com.example.touristo.Controlers.Auth.Register;
import com.example.touristo.R;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    EditText login_email;
    EditText login_password;
    Button login_button;
    TextView signupRedirectText;
    ProgressBar progressBar;

    Login loginController = new Login(this);

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = loginController.getCurrentUser();
        if(currentUser != null && currentUser.isEmailVerified() ){
            Intent intent = new Intent(getApplicationContext() , Form.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        login_email = findViewById(R.id.login_email);
        login_password = findViewById(R.id.login_password);
        login_button = findViewById(R.id.login_button);
        signupRedirectText = findViewById(R.id.signupRedirectText);
        progressBar = findViewById(R.id.progressBar);



        //moving from login activity to the signup activity
        signupRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class );
                startActivity(intent);
                finish();
            }
        });

        //login user
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                String email , password ;
                email = login_email.getText().toString();
                password = login_password.getText().toString();

                if (TextUtils.isEmpty(email))
                {
                    Toast.makeText(LoginActivity.this, "Enter an email!!!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password))
                {
                    Toast.makeText(LoginActivity.this, "Enter a password!!!", Toast.LENGTH_SHORT).show();
                    return;
                }

                loginController.signUp(email, password, progressBar);


            }
        });
    }

}