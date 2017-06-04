package com.example.yuecheng.day4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//make the text empty, put the value in the hint property for delete
public class MainActivity extends AppCompatActivity {

    Button fifteenPercent;
    Button eighteenPercent;
    Button twentyPercent;
    Button custom;
    Button convert;
    EditText editText1;
    EditText editText2;
    TextView textView1;

    Double money;
    Double finalAmount;
    Double customPercent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fifteenPercent = (Button) findViewById(R.id.fifteenPercent);
        eighteenPercent = (Button) findViewById(R.id.eighteenPercent);
        twentyPercent = (Button) findViewById(R.id.twentyPercent);
        custom = (Button) findViewById(R.id.custom);
        convert = (Button) findViewById(R.id.convert);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView1 = (TextView) findViewById(R.id.textView1);

        finalAmount = 1.00;

    }


    public void btnCalculate(View view) {
        money = Double.parseDouble(editText1.getText().toString());



        if (view.getId() == fifteenPercent.getId()) {
            finalAmount = money * .15;
            finalAmount = Math.round(finalAmount * 100.0) / 100.0;
            textView1.setText("$" + finalAmount.toString());
            Toast.makeText(this, "clicked and calculated", Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == eighteenPercent.getId()) {
            finalAmount = money * .18;
            finalAmount = Math.round(finalAmount * 100.0) / 100.0;
            textView1.setText("$" + finalAmount.toString());
            Toast.makeText(this, "clicked and calculated", Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == twentyPercent.getId()) {
            finalAmount = money * .2;
            finalAmount = Math.round(finalAmount * 100.0) / 100.0;
            textView1.setText("$" + finalAmount.toString());
            Toast.makeText(this, "clicked and calculated", Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == custom.getId()) {
            editText2 = (EditText) findViewById(R.id.editText2);

            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
        }
    }

        public void btnConvert(View view) {

            money = Double.parseDouble(editText1.getText().toString());
            customPercent = Double.parseDouble(editText2.getText().toString());
            finalAmount = money * customPercent;
            finalAmount = Math.round(finalAmount * 100.0) / 100.0;
            textView1.setText("$" + finalAmount.toString());
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
        }



}

