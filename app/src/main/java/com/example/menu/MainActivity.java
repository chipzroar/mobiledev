package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btnMenu);
        Button sms = findViewById(R.id.sms);

        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,MainActivity2_Menu.class);
            startActivity(intent);
        });

        sms.setOnClickListener(v -> {
            Intent intent1 = new Intent(MainActivity.this, Activity_SendSMSPage.class);
            startActivity(intent1);
        });
    }



}