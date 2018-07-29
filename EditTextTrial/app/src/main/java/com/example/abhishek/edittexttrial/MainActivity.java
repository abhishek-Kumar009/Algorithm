package com.example.abhishek.edittexttrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity {
    private TextView txtScreen ;
    private EditText etxt;
    private double ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txtScreen = (TextView)findViewById(R.id.txtScreen);
        etxt = (EditText)findViewById(R.id.editText);
        findViewById(R.id.btnCalc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display();
            }
        });

    }
    public void display(){
        try{
            String str = etxt.getText().toString().trim();
            String result = str.substring(0, str.length() - 1);
            Expression exp = new ExpressionBuilder(result).build();
             this.ans = exp.evaluate();
             txtScreen.setText(Double.toString(ans));


        }catch(NumberFormatException exception){
            this.ans = 0;
            txtScreen.setText(Double.toString(ans));
        }catch(Exception e){
            txtScreen.setText("Error");
        }

    }

}
