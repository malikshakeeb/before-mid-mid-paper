package com.example.labb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Midterm3 extends AppCompatActivity {
    EditText a;
    EditText b;
    Button btnadd;
    Button btnsub;
    Button btnmul;
    Button btndiv;
    TextView txtrest;
    TextView txtres2;
    String string_res = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm3);
        a = (EditText) findViewById(R.id.edit1);
        b = (EditText) findViewById(R.id.edit2);
        btnadd = (Button) findViewById(R.id.btn_add);
        btnsub = (Button) findViewById(R.id.btn_sub);
        btnmul = (Button) findViewById(R.id.btn_mul);
        btndiv = (Button) findViewById(R.id.btn_div);
        txtrest= (TextView) findViewById(R.id.answer_is);
        txtres2= (TextView) findViewById(R.id.answer_is2);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((a.getText().length()>0) && (b.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(a.getText().toString());
                    double oper2 = Double.parseDouble(b.getText().toString());
                    double result = oper1 + oper2;
                    String text = oper1 +"+"+oper2+ " = "+ result;
                    txtrest.setText(text);
                    string_res = string_res+","+text;
                    txtres2.setText(string_res);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((a.getText().length()>0) && (b.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(a.getText().toString());
                    double oper2 = Double.parseDouble(b.getText().toString());
                    double result = oper1 - oper2;
                    String text = oper1 +"-"+oper2+ " = "+ result;
                    txtrest.setText(text);
                    string_res = string_res+","+text;
                    txtres2.setText(string_res);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((a.getText().length()>0) && (b.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(a.getText().toString());
                    double oper2 = Double.parseDouble(b.getText().toString());
                    double result = oper1 * oper2;
                    String text = oper1 +"*"+oper2+ " = "+ result;
                    txtrest.setText(text);
                    string_res = string_res+","+text;
                    txtres2.setText(string_res);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((a.getText().length()>0) && (b.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(a.getText().toString());
                    double oper2 = Double.parseDouble(b.getText().toString());
                    double result = oper1 / oper2;
                    String text = oper1 +"/"+oper2+ " = "+ result;
                    txtrest.setText(text);
                    string_res = string_res+","+text;
                    txtres2.setText(string_res);
                }
            }
        });
    }
}
