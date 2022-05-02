package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        TextView txt = findViewById(R.id.textView1);
        TextView txt2 = findViewById(R.id.textView2);
        TextView txt3 = findViewById(R.id.textView3);

        EditText fName = findViewById(R.id.name1);
        EditText lName =findViewById(R.id.name2);
        EditText emAddress = findViewById(R.id.address);

        txt.setText(fName.getText().toString());
        txt2.setText(lName.getText().toString());
        txt3.setText(emAddress.getText().toString());
    }
}