package com.example.abithhussainh.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ABITH HUSSAIN H on 8/11/2016.
 */
public class SecondPage extends FirstPage {
    EditText e1,e2;
    TextView t1,t2;
    double num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        e1=(EditText)findViewById(R.id.ed1);
        e2=(EditText)findViewById(R.id.ed2);
        t1=(TextView)findViewById(R.id.b1);
        t2=(TextView)findViewById(R.id.tv);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tt=Toast.makeText(getApplicationContext(),"Got answer?",Toast.LENGTH_LONG);
                tt.show();

                num1 = Double.parseDouble(e1.getText().toString());
                num2 = Double.parseDouble(e2.getText().toString());
                sum = num1 + num2;
                t2.setText(Double.toString(sum));



            }
        });
    }
}
