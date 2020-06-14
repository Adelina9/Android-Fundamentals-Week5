package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Challenge2Activity1 extends AppCompatActivity {

    public static String TITLE_KEY = "title key";
    public static String AUTHOR_KEY = "author key";
    public static String LYRICS_KEY = "lyrics key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge2_activity1);
    }

    public void openSecondActivityTextOne(View view) {
        Intent intent = new Intent(Challenge2Activity1.this, Challenge2Activity2.class);
        intent.putExtra(TITLE_KEY, "One");
        intent.putExtra(AUTHOR_KEY, "Three Dog Night");
        intent.putExtra(LYRICS_KEY, getString(R.string.text_one_msg));
        startActivity(intent);
    }

    public void openSecondActivityTextTwo(View view) {
        Intent intent = new Intent(Challenge2Activity1.this, Challenge2Activity2.class);
        intent.putExtra(TITLE_KEY, "Two Young lovers");
        intent.putExtra(AUTHOR_KEY, "Dire Straits");
        intent.putExtra(LYRICS_KEY, getString(R.string.text_two_msg));
        startActivity(intent);
    }

    public void openSecondActivityTextThree(View view) {
        Intent intent = new Intent(Challenge2Activity1.this, Challenge2Activity2.class);
        intent.putExtra(TITLE_KEY, "Three little birds");
        intent.putExtra(AUTHOR_KEY, "Bob Marley");
        intent.putExtra(LYRICS_KEY, getString(R.string.text_three_msg));
        startActivity(intent);
    }
}