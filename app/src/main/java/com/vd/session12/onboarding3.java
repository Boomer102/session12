package com.vd.session12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class onboarding3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding3);
        ConstraintLayout layout = findViewById(R.id.onboarding3_layout);

        layout.setOnTouchListener(new OnSwipeTouchListener(onboarding3.this) {

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
            }
            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                Intent r = new Intent(onboarding3.this, onboarding2.class);
                startActivity(r);
            }
        });
    }

public void skip(View v) {

}

}