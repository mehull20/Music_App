package com.example.project_mad;

import android.os.Bundle;
import android.view.View;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Emoji2Activity extends MainActivity implements View.OnClickListener {

    TextView text10;
    TextView text11;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoji2);
        text10 = (TextView) findViewById(R.id.t10);
        text11 = (TextView) findViewById(R.id.t11);

        // Text view number 1 to add hyperlink
        TextView linkTextView = findViewById(R.id.t12);
        // method to redirect to provided link
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());




    }

    @Override
    public void onClick(View v) {
        text10.setText("Here's the playlist for you:");
        text11.setText("Hope, it makes your day better! Enjoy!!!!");

    }
}
