package com.example.integertofloat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;

    public  Float Integer_to_Float (Integer kk)
    {
        //Integer kk = 5;
        int hh = kk;
        float jj = (float) hh;
        //Float dd = jj;
        return jj;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display);

        display.setText(Integer_to_Float(12).toString());


    }
}