package com.example.vinayakks.x;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText loginText;
    EditText passText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginText = (EditText) findViewById(R.id.login_page_social_login_text);
        passText = (EditText) findViewById(R.id.login_page_social_login_password);

        TextView login, register, skip;
        login = (TextView) findViewById(R.id.login);
        register = (TextView) findViewById(R.id.register);
        skip = (TextView) findViewById(R.id.skip);

        login.setOnClickListener(this);
        register.setOnClickListener(this);
        skip.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        if (v instanceof TextView) {
            TextView tv = (TextView) v;
            Toast.makeText(this, tv.getText(), Toast.LENGTH_SHORT).show();
            Intent i = new Intent(LoginActivity.this,MainActivity.class);
           startActivity(i);
        }
    }
}
