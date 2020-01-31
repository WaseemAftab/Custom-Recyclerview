package com.office.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red", "weṭeṭṭi",R.drawable.color_red));
        words.add(new Word("Green", "chokokki",R.drawable.color_green));
        words.add(new Word("Brown", "ṭakaakki",R.drawable.color_brown));
        words.add(new Word("Grey", "ṭopoppi",R.drawable.color_gray));
        words.add(new Word("Black", "kululli",R.drawable.color_black));
        words.add(new Word("White", "kelelli",R.drawable.color_white));
        words.add(new Word("Dusty Yellow", "ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new Word("Mustard Yellow", "chiwiiṭә",R.drawable.color_mustard_yellow));
        words.add(new Word("Orange", "Luttad",R.drawable.color_red));
        words.add(new Word("Misted", "Mistgrd",R.drawable.color_white));
        words.add(new Word("Mehroon", "Ramnbow",R.drawable.color_mustard_yellow));
        words.add(new Word("Purple", "Bosda"));
        words.add(new Word("Pink", "Arham"));
        words.add(new Word("Wood", "faranhi"));
        words.add(new Word("Jet Black", "Chukamba"));


        WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
