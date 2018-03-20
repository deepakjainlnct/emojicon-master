
package com.deepak.emojicon.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;

import com.deepak.app.emojicon.EmojiconPage;
import com.deepak.app.emojicon.EmojiconsView;
import com.deepak.app.emojicon.emoji.Emojicon;

public class EmojiconsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emojicons);
        EmojiconsView emojiconsView = (EmojiconsView) findViewById(R.id.emojicons_view);
        emojiconsView.setPages(Arrays.asList(
                new EmojiconPage(Emojicon.TYPE_PEOPLE, null, false, R.drawable.ic_emoji_people_light),
                new EmojiconPage(Emojicon.TYPE_NATURE, null, false, R.drawable.ic_emoji_nature_light),
                new EmojiconPage(Emojicon.TYPE_OBJECTS, null, false, R.drawable.ic_emoji_objects_light),
                new EmojiconPage(Emojicon.TYPE_PLACES, null, false, R.drawable.ic_emoji_places_light),
                new EmojiconPage(Emojicon.TYPE_SYMBOLS, null, false, R.drawable.ic_emoji_symbols_light)
        ));
    }
}
