package com.example.s8q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=(TextView) findViewById(R.id.textView);

        Intent i=getIntent();

        String res=i.getStringExtra("MESSAGE");
        t1.setText(res);
    }
}
