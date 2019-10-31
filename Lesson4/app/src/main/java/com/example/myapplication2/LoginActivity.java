package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setUp();
        openMainActivity();
    }
    public void setUp(){
        btn2 = (Button) findViewById(R.id.bt1);
    }
    public void openMainActivity(){
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process();
            }
        });
    }
    public void process(){
        Intent intent = new Intent(LoginActivity.this , MainActivity.class);
        startActivity(intent);
    }
}
