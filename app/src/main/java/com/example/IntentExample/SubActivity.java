package com.example.IntentExample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);

        Intent intent = getIntent(); // 전송되는 데이터가 있다면 저장
        String str = intent.getStringExtra("str"); // main에서 똑같은 이름으로 받기

        tv_sub.setText(str);

    }
}