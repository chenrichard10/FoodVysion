package com.example.textrecandroid;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.io.*;
import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        ArrayList<String> arrLi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Toast

        final String keywords = "";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText enterKeywords = findViewById(R.id.keyword);
        Button addKeywords= findViewById(R.id.addKeyword);
        Button beginSearch = findViewById(R.id.beginSearch);
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

        addKeywords.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                arrLi.add(enterKeywords.getText().toString());

                Context context = getApplicationContext();
                CharSequence text = enterKeywords.getText().toString()+
                        " was added!";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        beginSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                for(int i=0;i<arrLi.size();i++){
                    System.out.println(arrLi.get(i));
                }
                Intent startIntent = new Intent(getApplicationContext(), TextRec.class);
                startIntent.putStringArrayListExtra("KEY",arrLi);
                startActivity(startIntent);

            }

        });

    }
}
