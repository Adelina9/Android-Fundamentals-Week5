package com.example.assignment4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Challenge3Activity1 extends AppCompatActivity {

    public static final String KEY = "key";
    public static final int CHANNEL = 255;
    private TextView textViewStatus;
    private TextView textViewMessage;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge3_activity1);
    }

    public void sendMessageToSecondActivity(View view) {
        Intent intent = new Intent(Challenge3Activity1.this, Challenge3Activity2.class);
        editText = findViewById(R.id.editTextChallenge3Activity1);
        String message = editText.getText().toString();
        intent.putExtra(KEY, message);
        startActivityForResult(intent, CHANNEL);

    }

    // this method is used in order to get the result sent by Challenge3Activity2
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CHANNEL && resultCode == RESULT_OK) {
            editText.setText("");
            String response = data.getStringExtra(Challenge3Activity2.KEY2);
            textViewStatus = findViewById(R.id.textView1Challenge3Activity1);
            textViewStatus.setText(R.string.reply_received);

            textViewMessage = findViewById(R.id.textView2Challenge3Activity1);
            textViewMessage.setText(response);
        }
    }
}