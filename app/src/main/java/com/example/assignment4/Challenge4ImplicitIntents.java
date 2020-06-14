package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Challenge4ImplicitIntents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge4_implicit_intents);
    }

    public void openWebsite(View view) {
        EditText editTextWebsite = findViewById(R.id.editTextWebsiteURL);
        String websiteURL = editTextWebsite.getText().toString();
        Intent openUrlImplicitIntent = new Intent(Intent.ACTION_VIEW);
        openUrlImplicitIntent.setData(Uri.parse(websiteURL));
        startActivity(openUrlImplicitIntent);
    }

    public void openLocation(View view) {
        EditText editTextLocation = findViewById(R.id.editTextLocation);
        String location = "geo:0,0?q=" + editTextLocation.getText().toString();
        Uri gmmIntentUri = Uri.parse(location);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void shareText(View view) {
        EditText editTextText = findViewById(R.id.editTextText);
        String text = editTextText.getText().toString();
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, text);
        sendIntent.setType("text/plain");
        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }

    public void callNumber(View view) {
        Intent callImplicitIntent = new Intent(Intent.ACTION_DIAL);
        callImplicitIntent.setData(Uri.parse("tel:0744444444"));
        // check if the implicit intent could be run on the current device
        if(callImplicitIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(callImplicitIntent);
        } else {
            // display an alert
        }
    }
}