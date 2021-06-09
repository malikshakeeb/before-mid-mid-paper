package com.example.labb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class secactivity extends AppCompatActivity {
    Button btnRegestered;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_secactivity);

        btnRegestered = (Button) findViewById(R.id.btnSignup);
        btnRegestered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(secactivity.this,"You have seccessfully regestered ",Toast.LENGTH_LONG).show();
            }
        });
    }
}