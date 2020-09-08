package com.example.rentalbazaar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginClick(View view) {
        Intent intent= new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void newUserClick(View view) {
        Intent intent= new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(intent);
        finish();
    }

    public void forgotpasswordclick(View view) {
        final Dialog dialog = new Dialog(LoginActivity.this);
        dialog.setContentView(R.layout.forgotpassworddialog);
        dialog.setCanceledOnTouchOutside(false);

        final EditText emailforgot = dialog.findViewById(R.id.forgetemail);
        Button cancelforgot = dialog.findViewById(R.id.forgotcancel);
        Button okforgot = dialog.findViewById(R.id.forgotsend);

        cancelforgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        okforgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    dialog.dismiss();
                    Intent  intent = new Intent(LoginActivity.this,PasswordChangeOTP.class);
                    startActivity(intent);
                }
        });
        dialog.show();
    }
}