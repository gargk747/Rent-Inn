package com.example.rentalbazaar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PasswordChangeOTP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_change_o_t_p);
    }

    public void forgotpasswordVerifyClick(View view) {
        Intent intent= new Intent(PasswordChangeOTP.this,NewPassword.class);
        startActivity(intent);
        finish();
    }
}