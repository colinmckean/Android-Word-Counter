package com.codeclan.example.wordcounterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {
    TextView results;
    Button getResultsBtn;
    EditText sentenceInput;
    WordCounter wordMachine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        results = (TextView) findViewById(R.id.showWordCount);
        getResultsBtn = (Button) findViewById(R.id.getWordCount);
        sentenceInput = (EditText) findViewById(R.id.sentenceInput);
        wordMachine = new WordCounter();
    }

    public void getResults(View button) {
        String result = wordMachine.countOccurrences(sentenceInput.getText().toString());
        results.setText(result);
    }

    public void clearData(View button) {
        results.setText("");
        sentenceInput.setText("");
    }
}
