package com.cmy.www.sharedpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonInput = findViewById(R.id.buttonInput);
        buttonInput.setOnClickListener(this);
        Button buttonGet = findViewById(R.id.buttonGet);
        buttonGet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent1, intent2;
        switch (id){
            case R.id.buttonInput:
                intent1 = new Intent(this, ReferenceInputActivity.class);
                startActivityForResult(intent1, 100);
                break;
            case R.id.buttonGet:
                intent2 = new Intent(this, ReferenceGetActivity.class);
                startActivityForResult(intent2, 100);
                break;
        }

    }
}
