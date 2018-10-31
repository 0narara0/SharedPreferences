package com.cmy.www.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ReferenceGetActivity extends AppCompatActivity {
    TextView textViewResult1, textViewResult2, textViewResult3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_get);
        textViewResult1 = findViewById(R.id.textViewResult1);
        textViewResult2 = findViewById(R.id.textViewResult2);
        textViewResult3 = findViewById(R.id.textViewResult3);

        SharedPreferences sharedPreferences = getSharedPreferences("Login", Context.MODE_PRIVATE);
        String Name = sharedPreferences.getString("Name",null);
        String Password = sharedPreferences.getString("Password",null);
        String Email = sharedPreferences.getString("Email",null);

        textViewResult1.setText("Name: "+Name);
        textViewResult2.setText("Password: "+Password);
        textViewResult3.setText("E-mail: "+Email);

    }
}
