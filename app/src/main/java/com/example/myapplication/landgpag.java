package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class landgpag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landgpag);

        ImageButton navigateButton = findViewById(R.id.inibutton);

        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(landgpag.this, loginnn.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton = findViewById(R.id.inibut2);

        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(landgpag.this, regist.class);
                startActivity(intent);
            }
        });
    }
}