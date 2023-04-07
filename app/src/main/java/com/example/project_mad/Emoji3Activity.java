package com.example.project_mad;

import android.os.Bundle;
import android.view.View;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Emoji3Activity extends MainActivity implements View.OnClickListener {

    TextView text3;
    TextView text4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoji3);
        text3 = (TextView) findViewById(R.id.textView3);
        text4 = (TextView) findViewById(R.id.textView4);

        // Text view number 1 to add hyperlink
        TextView linkTextView = findViewById(R.id.textView8);
        // method to redirect to provided link
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link = findViewById(R.id.t13);
        // method to redirect to provided link
        link.setMovementMethod(LinkMovementMethod.getInstance());


    }

    @Override
    public void onClick(View v) {
        text3.setText("Here's the playlist for you:");
        text4.setText("Hope, it makes your day better! Enjoy!!!!");

    }
}
