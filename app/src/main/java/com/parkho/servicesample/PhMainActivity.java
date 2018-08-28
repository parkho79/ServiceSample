package com.parkho.servicesample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PhMainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 서비스 시작
        Button btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PhService.class);
                startService(intent);
            }
        });

        // 서비스 종료
        Button btnStop = findViewById(R.id.btn_stop);
        btnStop.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PhService.class);
                stopService(intent);
            }
        });
    }
}