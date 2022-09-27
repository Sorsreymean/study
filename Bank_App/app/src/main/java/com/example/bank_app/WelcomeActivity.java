package com.example.bank_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    //declare variable
    int balance = 0;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //link java with xml
        TextView txtLogout = findViewById(R.id.txtLogOut);
        TextView txtBalance = findViewById(R.id.txtBalance);
        TextView txtAccount = findViewById(R.id.txtAccount);
        Button btnDes = findViewById(R.id.btnDeposit);
        Button btnWith = findViewById(R.id.btnWithdraw);

        //get data from intent
        username = getIntent().getStringExtra("Username");
        txtAccount.setText(username);

        btnDes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                balance = balance + 10;
                txtBalance.setText(String.valueOf(balance));
            }
        });

        btnWith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                balance = balance - 10;
                txtBalance.setText(String.valueOf(balance));
            }
        });

        txtLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}