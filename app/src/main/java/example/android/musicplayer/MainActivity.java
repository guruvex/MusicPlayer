package example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView getMusic = findViewById(R.id.getMusic);
        ImageView skipBack = findViewById(R.id.skipBack);
        ImageView playPause = findViewById(R.id.playPause);
        ImageView skipForward = findViewById(R.id.skipForward);
        ImageView album = findViewById(R.id.album);


        skipBack.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the skip back View is clicked on.
            @Override
            public void onClick(View view) {
                dontWorkYet();
            }
        });
        skipForward.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the skip forward View is clicked on.
            @Override
            public void onClick(View view) {
                dontWorkYet();
            }
        });
        playPause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play or paused View is clicked on.
            @Override
            public void onClick(View view) {
                dontWorkYet();
            }
        });
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album image View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, MyAlbum.class);
                startActivity(albumIntent);
            }
        });
        getMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the get music image View is clicked on.
            @Override
            public void onClick(View view) {
                Intent getMusicIntent = new Intent(MainActivity.this, GetMusic.class);
                startActivity(getMusicIntent);
            }
        });

    }

    public void dontWorkYet() {
        /** this will be replaced when the play music part works */
        Toast.makeText(this, "Sorry this function is not working yet", Toast.LENGTH_SHORT).show();
    }

    public void playPause() {
        // todo: put play pause image swap in here.
        Toast.makeText(this, "Sorry this function is not working yet", Toast.LENGTH_SHORT).show();

    }


}
