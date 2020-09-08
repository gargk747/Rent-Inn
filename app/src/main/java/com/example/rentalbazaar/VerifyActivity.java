package com.example.rentalbazaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void verifyClick(View view) {
        Intent intent= new Intent(VerifyActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}