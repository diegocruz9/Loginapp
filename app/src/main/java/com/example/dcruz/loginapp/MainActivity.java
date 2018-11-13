package com.example.dcruz.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private Button login;
    private Button registe;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.etname);
        password = (EditText)findViewById(R.id.etpass);
        login = (Button)findViewById(R.id.btnlogin);
        registe =(Button)findViewById(R.id.btnregis);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(), password.getText().toString());
            }
        });

        registe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, register.class);
                startActivity(intent);
            }
        });
    }

    private void validate(String userName, String userPassword)
    {
        if ((userName.equals("admin")) && (userPassword.equals("1234")))
        {
            Intent intent = new Intent(MainActivity.this, MainMenu.class);
            startActivity(intent);
        }
    }
}
