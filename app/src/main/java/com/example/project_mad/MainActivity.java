package com.example.project_mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton click;
    TextView text;
    TextView text1;
    ImageButton click2;
    ImageButton click3;
    ImageButton click4;
    ImageButton click5;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.imageButton);
        click.setOnClickListener(this);
        text = findViewById(R.id.textView);

        text1 = findViewById(R.id.textView2);

        click2 = findViewById(R.id.imageButton2);
        click2.setOnClickListener(this);
        click3 = findViewById(R.id.imageButton3);
        click3.setOnClickListener(this);
        click4 = findViewById(R.id.imageButton4);
        click4.setOnClickListener(this);
        click5 = findViewById(R.id.imageButton5);
        click5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton:
                Intent intent = new Intent(MainActivity.this, Emoji1Activity.class);
                startActivity(intent);
                break;
            case R.id.imageButton2:
                Intent intent1 = new Intent(MainActivity.this, Emoji2Activity.class);
                startActivity(intent1);
                break;
            case R.id.imageButton3:
                Intent intent2 = new Intent(MainActivity.this, Emoji3Activity.class);
                startActivity(intent2);
                Intent intent3 = new Intent(MainActivity.this, Emoji3Activity.class);
                startActivity(intent3);
                break;
            case R.id.imageButton4:
                Intent intent4 = new Intent(MainActivity.this, Emoji4Activity.class);
                startActivity(intent4);
                break;
            case R.id.imageButton5:
                Intent intent5 = new Intent(MainActivity.this, Emoji5Activity.class);
                startActivity(intent5);
                break;

        }
    }
}
