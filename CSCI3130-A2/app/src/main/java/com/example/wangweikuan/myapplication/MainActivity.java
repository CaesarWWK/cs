package com.example.wangweikuan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textview1;
    private  Button button1;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = (TextView)findViewById(R.id.textview);
        editText = (EditText)findViewById(R.id.editText);

        button1 = (Button)findViewById(R.id.button);
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String password =editText.getText().toString();
               stage one = new stage();
               if(one.test(password)==5)
               textview1.setText("validate");
               else textview1.setText("Not validate");
           }
       });
    }

}
