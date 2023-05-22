package com.example.oasis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class yogaPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_page);

        ImageView relaxation = findViewById(R.id.relaxbtn);
        relaxation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(yogaPage.this, Relaxation.class);
                startActivity(i);
            }
        });

        ImageView beginners = findViewById(R.id.beginnersbtn);
        beginners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(yogaPage.this, Beginners.class);
                startActivity(i);
            }
        });

        ImageView flexibility = findViewById(R.id.flexbtn);
        flexibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(yogaPage.this, Flexibility.class);
                startActivity(i);
            }
        });

        ImageView stress = findViewById(R.id.stressfbtn);
        stress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(yogaPage.this, StressRelief.class);
                startActivity(i);
            }
        });
    }
}