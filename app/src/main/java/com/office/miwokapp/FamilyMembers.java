package com.office.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father", "әpә",R.drawable.family_father));
        words.add(new Word("Mother", "әṭa",R.drawable.family_mother));
        words.add(new Word("Son", "angsi",R.drawable.family_son));
        words.add(new Word("Daughter", "tune",R.drawable.family_daughter));
        words.add(new Word("Older Brother", "taachi",R.drawable.family_older_brother));
        words.add(new Word("Younger Brother", "chalitti",R.drawable.family_younger_brother));
        words.add(new Word("Older Sister", "teṭe",R.drawable.family_older_sister));
        words.add(new Word("Younger Sister", "kolliti",R.drawable.family_younger_sister));
        words.add(new Word("Grand Mother", "ama",R.drawable.family_grandmother));
        words.add(new Word("Grand Father", "paapa",R.drawable.family_grandfather));
        words.add(new Word("Uncle", "Ghura"));
        words.add(new Word("Aunty", "Mussalit"));
        words.add(new Word("Cousine", "Mogembo"));
        words.add(new Word("Wife", "Fabido"));
        words.add(new Word("Husband", "Luchha"));


        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
