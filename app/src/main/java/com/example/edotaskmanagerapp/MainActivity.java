package com.example.edotaskmanagerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView goalCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        goalCard=findViewById(R.id.Card1);

        goalCard.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),GoalActivity.class);
            startActivity(intent);
            finish();
        });
    }
}