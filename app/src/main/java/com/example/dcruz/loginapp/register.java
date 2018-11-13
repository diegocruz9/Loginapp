package com.example.dcruz.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity {

    private Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sign = (Button)findViewById(R.id.btnsign);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}
