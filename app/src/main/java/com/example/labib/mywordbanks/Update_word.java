package com.example.labib.mywordbanks;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Update_word extends AppCompatActivity {


    Button update_this_word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_word);

        update_this_word = (Button)findViewById(R.id.save_this_word);

        update_this_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnterMeaning();
            }

        });

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void openEnterMeaning(){

        Intent intent = new Intent(this, EnterMeaning.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }
}
