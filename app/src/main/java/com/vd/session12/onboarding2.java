package com.vd.session12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class onboarding2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding2);

        ConstraintLayout layout = findViewById(R.id.onboarding2_layout);
        layout.setOnTouchListener(new OnSwipeTouchListener(onboarding2.this) {

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                Intent r = new Intent(onboarding2.this, onboarding3.class);
                startActivity(r);
            }
            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                Intent r = new Intent(onboarding2.this, onboarding1.class);
                startActivity(r);
            }
        });
    }
    public void skip (View v) {
        Intent r = new Intent(onboarding2.this, onboarding3.class);
        startActivity(r);
    }
}