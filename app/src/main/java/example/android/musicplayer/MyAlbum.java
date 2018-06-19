package example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MyAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_album);

        /** building album list
         * this is a temp list.
         * this list will be replaced with a dynamic
         * list from the system folder
         */

        ArrayList<Songs> songsList = new ArrayList<>();
        songsList.add(new Songs("S.O.S.", "ABBA"));
        songsList.add(new Songs("Mamma Mia", "ABBA"));
        songsList.add(new Songs("Waterloo", "ABBA"));
        songsList.add(new Songs("I Do, I Do, I Do, I Do, I Do", "ABBA"));
        songsList.add(new Songs("Dancing Queen", "ABBA"));
        songsList.add(new Songs("Fernando", "ABBA"));
        songsList.add(new Songs("Gimme! Gimme! Gimme!", "ABBA"));
        songsList.add(new Songs("Does Your Mother Know", "ABBA"));
        songsList.add(new Songs("The Name Of The Game", "ABBA"));
        songsList.add(new Songs("Knowing Me, Knowing You", "ABBA"));
        songsList.add(new Songs("The Winner Takes It All", "ABBA"));
        songsList.add(new Songs("Poison Arrow", "ABC"));
        songsList.add(new Songs("The Look of Love, Pt. 1", "ABC"));
        songsList.add(new Songs("Be Near Me", "ABC"));
        songsList.add(new Songs("Always Always", "Abstracts"));
        songsList.add(new Songs("You Shook Me All Night Long", "AC/DC"));
        songsList.add(new Songs("T.N.T.", "AC/DC"));
        songsList.add(new Songs("Highway To Hell", "AC/DC"));
        songsList.add(new Songs("Hells Bells", "AC/DC"));
        songsList.add(new Songs("Back In Black", "AC/DC"));
        songsList.add(new Songs("Rock and Roll Ain't Noise Pollution", "AC/DC"));
        songsList.add(new Songs("Dirty Deeds Done Dirt Cheap", "AC/DC"));
        songsList.add(new Songs("Whole Lotta Rosie", "AC/DC"));
        songsList.add(new Songs("Let There Be Rock", "AC/DC"));


        SongAdaptor displaySongAdapter = new SongAdaptor(this, songsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(displaySongAdapter);
    }
}
