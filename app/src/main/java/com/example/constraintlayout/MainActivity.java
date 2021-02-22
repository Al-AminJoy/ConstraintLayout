package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btOrder=findViewById(R.id.bt_order);
        btOrder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this,SecondActivity.class));
    }
}