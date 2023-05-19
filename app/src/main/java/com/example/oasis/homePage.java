package com.example.oasis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homePage extends AppCompatActivity {
    private Button chatBtn;
    private Button yogaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        chatBtn = findViewById(R.id.cbutton);
        yogaBtn = findViewById(R.id.yogaBtn);


        chatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             openChatPage();
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYogaPage();
            }
        });
    }
    public void openChatPage(){
        Intent i = new Intent(this, Chat.class);
        startActivity(i);
    }

    public void openYogaPage(){
        Intent i = new Intent(this, yogaPage.class);
        startActivity(i);
    }
}