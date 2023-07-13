package com.demirgroup.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtnumber1;
    EditText txtnumber2;
    TextView lblresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnumber1=findViewById(R.id.txtnumber1);
        txtnumber2=findViewById(R.id.txtnumber2);
        lblresult=findViewById(R.id.lblresult);
    }
    public void total(View view){
        int number1,number2,result;
        if(txtnumber2.getText().toString().matches("") || txtnumber1.getText().toString().matches("")){
            lblresult.setText("Enter number.");
        }else {
            number1 = Integer.parseInt(txtnumber1.getText().toString());
            number2 = Integer.parseInt(txtnumber2.getText().toString());
            result = number1 + number2;
            lblresult.setText("result: " + result);
        }
    }
    public void devision(View view){
        int number1,number2,result;
        if(txtnumber2.getText().toString().matches("") || txtnumber1.getText().toString().matches("")){
            lblresult.setText("Enter number.");
        }else {
            number1 = Integer.parseInt(txtnumber1.getText().toString());
            number2 = Integer.parseInt(txtnumber2.getText().toString());
            result = number1 / number2;
            lblresult.setText("result: " + result);
        }
    }
    public void subtract(View view){
        int number1,number2,result;
        if(txtnumber2.getText().toString().matches("") || txtnumber1.getText().toString().matches("")){
            lblresult.setText("Enter number.");
        }else {
            number1 = Integer.parseInt(txtnumber1.getText().toString());
            number2 = Integer.parseInt(txtnumber2.getText().toString());
            result = number1 - number2;
            lblresult.setText("result: " + result);
        }
    }
    public void multiplay(View view){
        int number1,number2,result;
        if(txtnumber2.getText().toString().matches("") || txtnumber1.getText().toString().matches("")){
            lblresult.setText("Enter number.");
        }else {
            number1 = Integer.parseInt(txtnumber1.getText().toString());
            number2 = Integer.parseInt(txtnumber2.getText().toString());
            result = number1 * number2;
            lblresult.setText("result: " + result);
        }
    }
}
















