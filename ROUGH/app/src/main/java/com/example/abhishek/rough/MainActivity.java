package com.example.abhishek.rough;

//import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import net.objecthunter.exp4j.Expression;
//import net.objecthunter.exp4j.ExpressionBuilder;
import android.widget.Toast;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.txtScreen = (TextView)findViewById(R.id.txtScreen);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button = (Button) findViewById(R.id.btn5);
        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                txtScreen.setText(button.getText().toString());
            }
        });
        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                txtScreen.setText(button.getText().toString());
            }
        });
//        txtScreen.append("adad");
//        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Button btn = (Button)view;
//                txtScreen.setText(btn.getText());
//            }
//        });
//        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Button btn = (Button)view;
//                txtScreen.setText(btn.getText());
//            }
//        });
//        findViewById(R.id.btnadd).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Button btn = (Button)view;
//                txtScreen.setText(btn.getText());
//            }
//        });
//        findViewById(R.id.btnEqual).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Button btn = (Button)view;
//                txtScreen.append(btn.getText());
//            }
//        });
    }


}
