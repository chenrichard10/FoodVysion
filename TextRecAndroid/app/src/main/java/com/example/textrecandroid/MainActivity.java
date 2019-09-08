package com.example.textrecandroid;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText enterKeywords = findViewById(R.id.keyword);
        Button addKeyword= findViewById(R.id.addKeyword);
        //Change the support action bar title
        getSupportActionBar().setTitle("Vysion");
        //set the placeholder text for enterKeyWords
       enterKeywords.setText("Keyword to search: ");
        enterKeywords.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                enterKeywords.setText("");

            }
        });
        //ActionBar bar = getActionBar();
       // bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6200EE")));
        addKeyword.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String word = enterKeywords.getText().toString();
                Intent startIntent = new Intent(getApplicationContext(), TextRec.class);
                startIntent.putExtra("KEY",word);
                startActivity(startIntent);

            }
        });
    }
}
