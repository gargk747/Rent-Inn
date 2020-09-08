package com.example.rentalbazaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GetStarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);
    }

    public void email(View view) {
        Intent intent= new Intent(GetStarted.this,LoginActivity.class);
        startActivity(intent);
    }
}