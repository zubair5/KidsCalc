package com.example.abithhussainh.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ABITH HUSSAIN H on 8/11/2016.
 */
public class Fifth extends FirstPage {
    EditText ed1,ed2;
    TextView tv1,tv2;
    double num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tt=Toast.makeText(getApplicationContext(),"Got answer?",Toast.LENGTH_LONG);
                tt.show();

                num1 = Double.parseDouble(ed1.getText().toString());
                num2 = Double.parseDouble(ed2.getText().toString());
                sum = num1 / num2;
                tv2.setText(Double.toString(sum));


            }
        });
    }
}
