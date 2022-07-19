package com.dev.mysoko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
Button login;
TextInputEditText usern;
TextInputEditText userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.btnLogin);
        usern =findViewById(R.id.usrname);
        userId =findViewById(R.id.usrID);
        String user = Objects.requireNonNull(usern.getText()).toString();
        String userID = Objects.requireNonNull(userId.getText()).toString();
        Log.e("TAG", "onClick: "+user );

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,GroceryActivity.class );
                intent.putExtra("username",user);
                intent.putExtra("userId",userID);
                startActivity(intent);
            }
        });

    }
}