package com.nengvangboygmail.laotravelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText=findViewById(R.id.edtx);
        final EditText editText1=findViewById(R.id.edty);
        final TextView textView=findViewById(R.id.resault);
        Button button=findViewById(R.id.btCululate);
        Button button1=findViewById(R.id.btMinus);
        Button button2=findViewById(R.id.btMultiple);
        Button button3=findViewById(R.id.btDivide);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(editText.getText().toString());
                float num2=Float.parseFloat(editText1.getText().toString());
                String rs=Float.toString(num1+num2);
                textView.setText(rs);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                float num1=Float.parseFloat(editText.getText().toString());
                float num2=Float.parseFloat(editText1.getText().toString());
                String rs=Float.toString(num1-num2);
                textView.setText(rs);
            }
        });
    }
}
