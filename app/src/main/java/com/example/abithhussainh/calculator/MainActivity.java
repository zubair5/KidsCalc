package com.example.abithhussainh.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Toast t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.tv1);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tt=Toast.makeText(getApplicationContext(),"Hi Childrens KIDS CAL C Welcomes You",Toast.LENGTH_LONG);
                tt.show();

                Intent i=new Intent("com.example.abithhussainh.calculator.FIRSTPAGE");
                startActivity(i);
            }
        });
    }
}
