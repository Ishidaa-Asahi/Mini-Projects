package com.example.arithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //transferring xml values to java variables
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.addBtn);
        sub = (Button) findViewById(R.id.subBtn);
        mul = (Button) findViewById(R.id.mulBtn);
        div = (Button) findViewById(R.id.divBtn);
        answer = (TextView) findViewById(R.id.ans);

        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float sum = number1 + number2;
                answer.setText("Answer: "+String.valueOf(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float difference = number1 - number2;
                answer.setText("Answer: "+String.valueOf(difference));
            }
        });

        mul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float product = number1 * number2;
                answer.setText("Answer: "+String.valueOf(product));
            }
        });

        div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float quotient = number1 / number2;
                answer.setText("Answer: "+String.valueOf(quotient));
            }
        });
    }
}