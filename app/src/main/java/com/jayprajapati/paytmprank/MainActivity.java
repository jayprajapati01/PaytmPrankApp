package com.jayprajapati.paytmprank;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // define the variable
    Button send_button;
    EditText send_name,send_num,send_amount,send_time,send_date;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button = (Button)findViewById(R.id.send_button_id);
        send_name = (EditText)findViewById(R.id.send_text_name);
        send_amount = (EditText)findViewById(R.id.send_text_amount);
        send_num = (EditText)findViewById(R.id.send_text_num);
        send_date = (EditText)findViewById(R.id.send_text_date);
        send_time = (EditText)findViewById(R.id.send_text_time);

        // add the OnClickListener in sender button
        // after clicked this button following Instruction will run
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                // get the value which input by user in EditText
                // and convert it to string
                String str1 = send_name.getText().toString();
                String str2 = send_num.getText().toString();
                String str3 = send_amount.getText().toString();
                String str4 = send_date.getText().toString();
                String str5 = send_time.getText().toString();

                // Create the Intent object of this class Context() to Second_activity class
                Intent intent = new Intent(getApplicationContext(), Success.class);

                // now by putExtra method put the value in key, value pair
                // key is message_key by this key we will receive the value, and put the string

                intent.putExtra("message_key1", str1);
                intent.putExtra("message_key2", str2);
                intent.putExtra("message_key3", str3);
                intent.putExtra("message_key4", str4);
                intent.putExtra("message_key5", str5);


                // start the Intent
                startActivity(intent);
            }
        });
    }
}
