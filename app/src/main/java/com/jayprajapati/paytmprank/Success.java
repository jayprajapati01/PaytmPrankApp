package com.jayprajapati.paytmprank;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Success extends AppCompatActivity {

    TextView receiver_msg1,receiver_msg2,receiver_msg3,receiver_msg4,receiver_msg5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.Resized).into(imageView);
        receiver_msg1 = findViewById(R.id.received_value_name);
        receiver_msg2 = findViewById(R.id.received_value_num);
        receiver_msg3 = findViewById(R.id.received_value_amount);
        receiver_msg4 = findViewById(R.id.received_value_date);
        receiver_msg5 = findViewById(R.id.received_value_time);

        // create the get Intent object
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str1 = intent.getStringExtra("message_key1");
        String str2 = intent.getStringExtra("message_key2");
        String str3 = intent.getStringExtra("message_key3");
        String str4 = intent.getStringExtra("message_key4");
        String str5 = intent.getStringExtra("message_key5");

        // display the string into textView
        receiver_msg1.setText(str1);
        receiver_msg2.setText(str2);
        receiver_msg3.setText(getResources().getString(R.string.rp,  str3));
        receiver_msg4.setText(str4);
        receiver_msg5.setText(str5);

    }
}
