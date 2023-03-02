package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {
    TextView alreadylogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        alreadylogin=findViewById(R.id.already);
        alreadylogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(sign_up.this, "Register", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(sign_up.this , sign_in.class);
                startActivity(intent);

            }
        });

    }
}