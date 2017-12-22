package com.example.lilia.practicescoutingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button helloButton, backButton;
        int count = 0;

        helloButton = (Button) findViewById(R.id.helloButton);
        backButton = (Button) findViewById(R.id.back);


            helloButton.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View v) {

                    setContentView(R.layout.woah);
                }

            });

    }
}
