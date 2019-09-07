package com.example.textrecandroid;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
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
        Button takePhoto = findViewById(R.id.checkPhoto);
        Button addKeyword= findViewById(R.id.addKeyword);
        //set the placeholder text for enterKeyWords
       enterKeywords.setText("Please enter the key words that you are looking for ");

         takePhoto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), TextRec.class);
                startActivity(startIntent);

            }
        });
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
