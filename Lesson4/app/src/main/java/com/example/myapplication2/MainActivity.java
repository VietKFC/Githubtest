package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText ed1;
    private EditText ed2;
    private static final String acc = "HoangViet";
    private static final String pass = "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.edit);
        ed2 = (EditText) findViewById(R.id.edit2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });
    }
    public void openLoginActivity(){
        if(ed1.getText().toString().isEmpty() || ed2.getText().toString().isEmpty()){
            Toast.makeText(this , "Account or Password is empty" , Toast.LENGTH_SHORT).show();
        }
        if(ed1.getText().toString().equals(acc) || ed2.getText().toString().equals(pass)){
            Intent intent = new Intent(MainActivity.this , LoginActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this , "please input again" , Toast.LENGTH_SHORT).show();
        }
    }
    protected void onStart(){
        super.onStart();
        Log.i("start" , "On start ?");
    }
    protected void onRestart() {

        super.onRestart();
        Log.i("restart" , "On restart ?");
    }
    protected void onResume(){
        super.onResume();
        Log.i("resume" , "On resume ?");
    }
    protected void onPause(){
        super.onPause();
        Log.i("pause" , "On pause ?");
    }
    protected void onStop(){
        super.onStop();
        Log.i("stop" , "On stop ?");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("destroy" , "On destroy ?");
    }
}
