package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

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

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firtNumEditText = (EditText) findViewById(R.id.firtNumEditText);
                EditText secondNumberEditText = (EditText) findViewById(R.id.secondNumberEditText);

                TextView sumTextView = (TextView) findViewById(R.id.sumTextView);

                int num1 = Integer.parseInt(firtNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumberEditText.getText().toString());
                int result = num1 + num2;
                sumTextView.setText((result + ""));
            }
        });
    }


}