package com.cmy.www.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ReferenceInputActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextName, editTextPassword, editTextEmail;
    String editTextNameString, editTextPasswordString, editTextEmailString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_input);
        Button buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(this);
        editTextName = findViewById(R.id.editTextName);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextEmail = findViewById(R.id.editTextEmail);



    }

    @Override
    public void onClick(View v) {
        editTextNameString = editTextName.getText().toString();
        editTextPasswordString = editTextPassword.getText().toString();
        editTextEmailString = editTextEmail.getText().toString();

        SharedPreferences.Editor editor = getSharedPreferences("Login", Context.MODE_PRIVATE).edit();
        editor.putString("Name", editTextNameString);
        editor.putString("Password", editTextPasswordString);
        editor.putString("Email", editTextEmailString);
        editor.commit();

        Toast.makeText(this,"Thanks!!",Toast.LENGTH_SHORT).show();

    }
}
