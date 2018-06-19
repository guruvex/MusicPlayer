package example.android.musicplayer;

/**
 * Created by james on 6/19/2018.
 * this is to hold all the data for the Songs objects
 */

public class Songs {
    //songs title
    private String mSongTitle;
    //artist name
    private String mArtistName;

    public Songs(String songTitle, String artistName){
        mSongTitle = songTitle;
        mArtistName = artistName;
    }

    public String getSongTitle() {return mSongTitle;}
    public String getArtistName() {return mArtistName;}

}
