package com.example.rentalbazaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);
    }

    public void newPasswordChanged(View view) {
        Intent intent= new Intent(NewPassword.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}