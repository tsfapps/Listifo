package com.listifo.listifo.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.listifo.listifo.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonLog = findViewById(R.id.btn_login);

        findViewById(R.id.btn_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_login:

                startActivity(new Intent(this, SingUpActivity.class));

                break;



        }

    }
}
