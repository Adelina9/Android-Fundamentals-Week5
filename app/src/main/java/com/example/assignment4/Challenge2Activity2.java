package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Challenge2Activity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge2_activity2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String title = bundle.getString(Challenge2Activity1.TITLE_KEY);
            textView = findViewById(R.id.textViewChallenge2Activity2Title);
            textView.setText(title);

            String author = bundle.getString(Challenge2Activity1.AUTHOR_KEY);
            textView = findViewById(R.id.textViewChallenge2Activity2Author);
            textView.setText(author);

            String lyrics = bundle.getString(Challenge2Activity1.LYRICS_KEY);
            textView = findViewById(R.id.textViewChallenge2Activity2Text);
            textView.setText(lyrics);
        }
    }
}