package com.vd.session12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class onboarding1 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding1);

        ConstraintLayout layout = findViewById(R.id.onboarding1_layout);
        layout.setOnTouchListener(new OnSwipeTouchListener(onboarding1.this) {

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                Intent r = new Intent(onboarding1.this, onboarding2.class);
                startActivity(r);
            }
            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
            }
        });
    }
    public void skip (View v) {
        Intent r = new Intent(onboarding1.this, onboarding3.class);
        startActivity(r);
    }
}