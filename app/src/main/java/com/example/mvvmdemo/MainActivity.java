package com.example.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText editText1;
    TextView result;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        result = (TextView) findViewById(R.id.textView1);
        button1 = (Button) findViewById(R.id.button1);
        /*
            Submit Button
        */
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = editText1.getText().toString();
                result.setText(name);

            }
        });
    }
}
