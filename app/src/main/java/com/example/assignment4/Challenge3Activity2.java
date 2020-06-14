package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Challenge3Activity2 extends AppCompatActivity {

    public static final String KEY2 = "key2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge3_activity2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(Challenge3Activity1.KEY);
            if (message != null) {
                TextView textViewStatus = findViewById(R.id.textView1Challenge3Activity2);
                textViewStatus.setText(R.string.message_received);

                TextView textViewMessage = findViewById(R.id.textView2Challenge3Activity2);
                textViewMessage.setText(message);
            }
        }
    }

    public void sendMessageToFirstActivity(View view) {
        Intent intent = new Intent();
        EditText editText = findViewById(R.id.editTextChallenge3Activity2);
        String response = editText.getText().toString();
        intent.putExtra(KEY2, response);

        //RESULT_OK means that we are OK
        setResult(RESULT_OK, intent);
        // close current activity
        finish();
    }
}