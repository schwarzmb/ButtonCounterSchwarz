package com.example.matthewschwarz.button_counter_schwarz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button addingButton;
    private Button subtractingButton;
    private Button resetCountButton;
    private TextView currentValue;
    private TextView countValue;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentValue = findViewById(R.id.currentValDisplay);
        //currentValue.
        //countValue.setText(String.valueOf(counter));
        countValue = findViewById(R.id.startValue);
        countValue.setText(String.valueOf(counter));
        addingButton = findViewById(R.id.adding);
        //subtractingButton = findViewById(R.id.subtract);
        //resetCountButton = findViewById(R.id.reset);

        addingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                countValue.setText(String.valueOf(counter));
            }
        });
        subtractingButton = findViewById(R.id.subtract);
        subtractingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                countValue.setText(String.valueOf(counter));
            }
        });
        resetCountButton = findViewById(R.id.reset);
        resetCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                countValue.setText(String.valueOf(counter));
            }
        });



    }
}
