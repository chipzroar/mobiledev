package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_SendSMSPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_smspage);

        Button btnSend = findViewById(R.id.sendMessage);
        Button clearSMS = findViewById(R.id.clearSMS);
        EditText phoneNum = findViewById(R.id.number);
        EditText message = findViewById(R.id.message);


        btnSend.setOnClickListener(v -> {
            String strPhoneNum = phoneNum.getText().toString();
            String strMessage = message.getText().toString();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", strPhoneNum, null));
            intent.putExtra("sms_body", strMessage);
            startActivity(intent);

            Toast.makeText(Activity_SendSMSPage.this, "SMS Sent", Toast.LENGTH_SHORT).show();
        });

        clearSMS.setOnClickListener(v -> {
            phoneNum.setText("");
            message.setText("");
        });

    }
}