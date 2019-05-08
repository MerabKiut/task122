package com.example.task122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView message;
    private int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button back_button = findViewById(R.id.back_button);
        Button forward_button = findViewById(R.id.forward_button);

        message = findViewById(R.id.result);

        forward_button.setOnClickListener(forwardButtonListener);
        back_button.setOnClickListener(backButtonListener);


        a = (int) ( Math.random() * 100 );
        message.setText("http://myfile.org/" + a);
    }

    private final View.OnClickListener forwardButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };
    private final View.OnClickListener backButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();

        }
    };


}
