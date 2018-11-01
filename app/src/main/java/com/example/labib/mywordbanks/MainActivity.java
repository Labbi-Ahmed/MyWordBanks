package com.example.labib.mywordbanks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button collected_word , save_word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        collected_word = (Button) findViewById(R.id.new_word);
        save_word = (Button) findViewById(R.id.my_collection);

        save_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUpdateActivity();
            }
        });


        collected_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCollectedActivity();
            }
        });


    }

    public void openUpdateActivity(){
            Intent intent = new Intent(this , Update_word.class);
            startActivity(intent);
    }

    public void openCollectedActivity(){
        Intent intent = new Intent(this, Collected_words.class);
        startActivity(intent);
    }



}
