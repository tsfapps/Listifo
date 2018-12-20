package com.listifo.listifo.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.listifo.listifo.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        btnSingUp = findViewById(R.id.btn_singUp);
        findViewById(R.id.btn_singUp).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.btn_singUp:

                startActivity(new Intent(this, MainActivity.class));

                break;



        }
    }
}
