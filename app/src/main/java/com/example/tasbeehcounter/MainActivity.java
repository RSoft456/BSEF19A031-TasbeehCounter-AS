package com.example.tasbeehcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button inc,dec,reset,count;
    String counted;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inc = findViewById(R.id.Inc);
        dec = findViewById(R.id.Dec);
        reset = findViewById(R.id.reset);
        count=findViewById(R.id.counter);
        counted=(String) count.getText();
        inc.setOnClickListener(v->{
            counter+=1;
            counted=Integer.toString(counter);
            count.setText(counted);
        });
        dec.setOnClickListener(v->{
            counter-=1;
            if(counter<0)
                counter=0;
            counted=Integer.toString(counter);
            count.setText(counted);
        });
        reset.setOnClickListener(v->{
            counter=0;
            counted=Integer.toString(counter);
            count.setText(counted);
        });
    }
}