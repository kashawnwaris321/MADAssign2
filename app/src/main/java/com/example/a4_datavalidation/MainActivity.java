package com.example.a4_datavalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void SignUp(View view) {
        Toast.makeText(this,"Sign Up Successfully",Toast.LENGTH_LONG).show();

    }
    public void Login(View view){
        Intent switchLogin=new Intent(this,LoginnActivity.class);
        startActivity(switchLogin);
    }
}