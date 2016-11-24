package com.example.dapre.stattracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button hitsMin, hitsAdd, walksMin, walksAdd, soAdd, soMin, rbiAdd, rbiMin;
    private TextView txtTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        hitsMin = (Button)findViewById(R.id.hitsMin);
        hitsAdd = (Button)findViewById(R.id.hitsAdd);
        walksMin = (Button)findViewById(R.id.walksMin);
        walksAdd = (Button)findViewById(R.id.walksAdd);
        soMin = (Button)findViewById(R.id.soMin);
        soAdd = (Button)findViewById(R.id.soAdd);
        rbiMin = (Button)findViewById(R.id.rbiMin);
        rbiAdd = (Button)findViewById(R.id.rbiAdd);
        txtTest = (TextView)findViewById(R.id.txtTest);

        hitsMin.setOnClickListener(this);
        hitsAdd.setOnClickListener(this);
        walksMin.setOnClickListener(this);
        walksAdd.setOnClickListener(this);
        soMin.setOnClickListener(this);
        soAdd.setOnClickListener(this);
        rbiMin.setOnClickListener(this);
        rbiAdd.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (view.getId()){
            case R.id.hitsMin:
                break;

        }
    }
}
