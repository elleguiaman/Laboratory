package com.example.swapper_checker_guiman;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    TextView gu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent secondActivity = getIntent();
        gu = (TextView) findViewById(R.id.msg_text_view);
        String result = secondActivity.getStringExtra("same");
        gu.setText(result);
    }
}