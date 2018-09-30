package com.example.sabahathamid.q1_and_q2activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // views reference
    private TextView titleTextView;
    private Button addButton ,clearButton ,openCalculatorActivity;
    private EditText inputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // initializing the views reference with views object from xml
        titleTextView=findViewById(R.id.title);
        addButton=findViewById(R.id.add);
        clearButton=findViewById(R.id.clear);
        openCalculatorActivity=findViewById(R.id.openCalculator);
        inputEditText=findViewById(R.id.input);

        //click listerner of clear button
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputEditText.getText().toString().length() == 0 ){
                    if(titleTextView.getText().toString().length() !=0  ){
                        titleTextView.setText("");
                    }
                    Toast.makeText(MainActivity.this , "No text to clear", Toast.LENGTH_LONG).show();
                    return;

                }
                if(titleTextView !=null){
                    titleTextView.setText("");
                }
                if(inputEditText !=null){
                    inputEditText.setText("");
                }
            }
        });

        //click listerner of calculator activity

        openCalculatorActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this ,MiniCalActivity.class));
            }
        });

        // click listerner of add button

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if (inputEditText.getText().toString().length() == 0 ){
                     Toast.makeText(MainActivity.this,"Enter Text Here",Toast.LENGTH_LONG).show();
                     return;

                 }
                 if(inputEditText != null){
                     if(titleTextView != null){
                         titleTextView.setText(inputEditText.getText().toString());
                     }
                 }

            }
        });

    }
}
