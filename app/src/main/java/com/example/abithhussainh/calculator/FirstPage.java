package com.example.abithhussainh.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by ABITH HUSSAIN H on 8/11/2016.
 */
public class FirstPage extends MainActivity {
    ImageButton im1,im2,im3,im4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        im1=(ImageButton)findViewById(R.id.i1);
        im2=(ImageButton)findViewById(R.id.i2);
        im3=(ImageButton)findViewById(R.id.i3);
        im4=(ImageButton)findViewById(R.id.i4);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iv=new Intent("com.example.abithhussainh.calculator.SECONDPAGE");
                startActivity(iv);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent is=new Intent("com.example.abithhussainh.calculator.THIRDPAGE");
                startActivity(is);
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent("com.example.abithhussainh.calculator.FOURTH");
                startActivity(it);
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ix=new Intent("com.example.abithhussainh.calculator.FIFTH");
                startActivity(ix);
            }
        });


    }
}
