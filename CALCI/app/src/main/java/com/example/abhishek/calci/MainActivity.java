package com.example.abhishek.calci;

//import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity {
    //put all the id's of the numbers in an array
    private int[] numericArray = {R.id.btn1, R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,R.id.btn0, R.id.btnd0};
    //put all the id's of the operators in an array
    private int[] operatorArray = {R.id.btnadd, R.id.btnsub, R.id.btndiv, R.id.btnmulti};
    //keep track of the current state
    private boolean stateError;
    //keep track of the last number
    private boolean lastNumeric;
    //keep track of lastdot
    private boolean lastDot;
    //recording the result
    private TextView txtScreen ;
    //String to check previous data
    private String check ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtScreen = (TextView) findViewById(R.id.txtScreen);
        txtScreen.setText("0");
        setNumericListener();
        setOperatorListener();
    }

    private void setNumericListener(){
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                if(stateError){
                    txtScreen.setText(button.getText());
                    stateError = false;
                    lastDot = false;
                }else{
                    String rstr = txtScreen.getText().toString();
                    for(int i = 0; i < rstr.length(); i++){
                        if(rstr.charAt(i) == '='){
                            txtScreen.setText(rstr.substring(i + 1));
                            break;
                        }
                    }
                    if(txtScreen.getText().toString().equals("0")){
                        txtScreen.setText(button.getText());
                    }else {
                        txtScreen.append(button.getText());
                    }
                }
                lastNumeric = true;
            }
        };
        for(int id : numericArray){
            findViewById(id).setOnClickListener(listener);
        }
    }
    private void setOperatorListener(){
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button)view;
                if(lastNumeric && !stateError){
                    String rstr = txtScreen.getText().toString();
                    for(int i = 0; i < rstr.length(); i++){
                        if(rstr.charAt(i) == '='){
                            txtScreen.setText(rstr.substring(i + 1));
                            break;
                        }
                    }
                    txtScreen.append(button.getText());
                    lastNumeric = false;
                    lastDot = false;
                }
            }
        };
        for(int id : operatorArray){
            findViewById(id).setOnClickListener(listener);
        }
        findViewById(R.id.btnclear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.setText("0");
                stateError = false;
                lastNumeric = false;
                lastDot = false;
            }
        });
        findViewById(R.id.btndot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button)view;
                String rstr = txtScreen.getText().toString();
                for(int i = 0; i < rstr.length(); i++){
                    if(rstr.charAt(i) == '='){
                        txtScreen.setText(rstr.substring(i + 1));
                        break;
                    }
                }
                if(lastNumeric && !lastDot){
                    txtScreen.append(button.getText());
                    lastNumeric = false;
                    lastDot = true;
                }
            }
        });
        findViewById(R.id.btnEqual).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check = txtScreen.getText().toString();
                equal();
            }
        });
        findViewById(R.id.btndel).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String str = txtScreen.getText().toString();
                if (str != "0") {
                    String newStr;
                    if (!lastNumeric && !lastDot) {
                        newStr = str.substring(0, str.length() - 1);
                        txtScreen.setText(newStr);
                        lastNumeric = true;

                    } else if (lastDot) {
                        newStr = str.substring(0, str.length() - 1);
                        txtScreen.setText(newStr);
                        lastDot = false;
                    } else {
                        newStr = str.substring(0, str.length() - 1);
                        if(str.length() == 1){
                            txtScreen.setText("0");
                        }else {
                            txtScreen.setText(newStr);
                        }
                        if(newStr != "") {
                            int l = txtScreen.getText().toString().length();
                            char ch = txtScreen.getText().toString().charAt(l - 1);
                            if (ch >= '0' && ch <= '9') {
                                lastNumeric = true;

                            } else if (ch == '.') {
                                lastDot = true;
                                lastNumeric = false;
                            } else {
                                lastNumeric = false;
                            }
                        }else{
                            lastDot = false;
                            lastNumeric = false;
                            stateError = false;
                        }
                    }

                }else{
                    Toast.makeText(getApplicationContext(), "Hey buddy!! There's no text to delete", Toast.LENGTH_SHORT).show();
                }
            }
        });
        findViewById(R.id.btnchk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScreen.setText(check);
            }
        });


    }
    private void equal(){
        try{
            String str = txtScreen.getText().toString();
            Expression expression = new ExpressionBuilder(str).build();
            double result = expression.evaluate();
            txtScreen.setText("="+ Double.toString(result));
            lastDot = true;


        }catch(Exception e){
            txtScreen.setText("NaN");
            stateError = true;
            lastNumeric = false;
            lastDot = false;
        }
    }

}
