package example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GetMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_music);

        TextView findMusic = findViewById(R.id.findMusic);

        findMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the find music View is clicked on.
            @Override
            public void onClick(View view) {
                dontWorkYet();
            }
        });
        /** building get music list
         * this is a temp list.
         * this list will be replaced with a dynamic
         * list from online
         */

        ArrayList<Songs> newSongsList = new ArrayList<>();
        newSongsList.add(new Songs("Dream On", "Aerosmith"));
        newSongsList.add(new Songs("Janie's Got a Gun", "Aerosmith"));
        newSongsList.add(new Songs("Walk This Way", "Aerosmith"));
        newSongsList.add(new Songs("Pink", "Aerosmith"));
        newSongsList.add(new Songs("Dude (Looks Like a Lady)", "Aerosmith"));
        newSongsList.add(new Songs("Sweet Emotion", "Aerosmith"));
        newSongsList.add(new Songs("The Other Side", "Aerosmith"));
        newSongsList.add(new Songs("Rag Doll", "Aerosmith"));
        newSongsList.add(new Songs("What It Takes", "Aerosmith"));
        newSongsList.add(new Songs("Remember (Walking in the Sand)", "Aerosmith"));
        newSongsList.add(new Songs("Last Child", "Aerosmith"));
        newSongsList.add(new Songs("Same Old Song and Dance", "Aerosmith"));
        newSongsList.add(new Songs("Crazy", "Aerosmith"));
        newSongsList.add(new Songs("Back in the Saddle", "Aerosmith"));
        newSongsList.add(new Songs("Seasons of Wither", "Aerosmith"));
        newSongsList.add(new Songs("Livin' on the Edge", "Aerosmith"));
        newSongsList.add(new Songs("Cryin'", "Aerosmith"));

        SongAdaptor displayGetAdapter = new SongAdaptor(this, newSongsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(displayGetAdapter);

    }

    private void dontWorkYet() {
        /** this will search for the info added in the edit text view */
        Toast.makeText(this, "Sorry this function is not working yet", Toast.LENGTH_SHORT).show();
    }
}

