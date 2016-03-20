package com.example.android.driverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private GridLayout changeTire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeTire = (GridLayout)findViewById(R.id.changeTire);

        changeTire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChangeTire(v, TireChange.class);
            }
        });


    }

    private void openChangeTire(View view, Class c){
        Intent intent = new Intent(this, c);
        this.startActivity(intent);
    }
}
