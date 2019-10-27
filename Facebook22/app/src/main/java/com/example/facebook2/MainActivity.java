package com.example.facebook2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText ed1 , ed2;
    private static final String username = "Hoang Viet";
    private  static final String password = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.bt1);
        ed1 = (EditText) findViewById(R.id.e1);
        ed2 = (EditText) findViewById(R.id.e2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });
    }
    public void openLoginActivity(){
        if(ed1.getText().toString().isEmpty() || ed2.getText().toString().isEmpty()){
            Toast.makeText(this , "please input your  username or password !", Toast.LENGTH_SHORT).show();
            return;
        }
        if(ed1.getText().toString().equals(username) && ed2.getText().toString().equals(password)){
            Intent intent = new Intent(MainActivity.this , LoginActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this , "Your password is wrong !" , Toast.LENGTH_SHORT).show();
            return;
        }
    }
    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putString("Login" , String.valueOf(btn));
    }
}
