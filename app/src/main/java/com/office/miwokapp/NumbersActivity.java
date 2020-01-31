package com.office.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One", "lutti", R.drawable.number_one));
        words.add(new Word("Two", "otiiko",R.drawable.number_two));
        words.add(new Word("Three", "tolookosu",R.drawable.number_three));
        words.add(new Word("Four", "oyyisa",R.drawable.number_four));
        words.add(new Word("Five", "massokka",R.drawable.number_five));
        words.add(new Word("Six", "temmokka",R.drawable.number_six));
        words.add(new Word("Seven", "kenekaku",R.drawable.number_seven));
        words.add(new Word("Eight", "kawinta",R.drawable.number_eight));
        words.add(new Word("Nine", "wo’e",R.drawable.number_nine));
        words.add(new Word("Ten", "na’aacha",R.drawable.number_ten));
        words.add(new Word("Elleven", "lutti"));
        words.add(new Word("Twelve", "lutti"));
        words.add(new Word("Thirteen", "lutti"));
        words.add(new Word("Fourteen", "lutti"));
        words.add(new Word("Fifteen", "lutti"));

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_number);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        Toast.makeText(this,"item clicked",Toast.LENGTH_LONG).show();

    }

}