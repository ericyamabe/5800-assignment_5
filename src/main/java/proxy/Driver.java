package proxy;

import proxy.library.DisplayObject;
import proxy.library.Song;
import proxy.library.SongProxy;
import proxy.library.SongServer;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Song songOne =  new Song();
        songOne.setTitle("Girls Like You");
        songOne.setAlbum("Red Pill Blues");
        songOne.setArtist("Maroon 5");
        songOne.setDuration(5);

        Song songTwo =  new Song();
        songTwo.setTitle("So Far Away");
        songTwo.setAlbum("14 Shades of Grey");
        songTwo.setArtist("Staind");
        songTwo.setDuration(4);

        Song songThree =  new Song();
        songThree.setTitle("Runaway Train");
        songThree.setAlbum("Grave Dancers Union");
        songThree.setArtist("Soul Asylum");
        songThree.setDuration(5);

        Song songFour =  new Song();
        songFour.setTitle("In The End");
        songFour.setAlbum("Hybrid Theory");
        songFour.setArtist("Linkin Park");
        songFour.setDuration(4);

        Song songFive =  new Song();
        songFive.setTitle("Somebody You Loved");
        songFive.setAlbum("Somebody You Loved");
        songFive.setArtist("Lewis Capaldi");
        songFive.setDuration(3);

        SongServer songServer = SongServer.getInstance();
        songServer.addSong(songOne);
        songServer.addSong(songTwo);
        songServer.addSong(songThree);
        songServer.addSong(songFour);
        songServer.addSong(songFive);

        DisplayObject song1 = new SongProxy(0);
        DisplayObject song2 = new SongProxy(1);
        DisplayObject song3 = new SongProxy(2);
        DisplayObject song4 = new SongProxy(3);
        DisplayObject song5 = new SongProxy(4);

        song5.displayMetadata();
        song2.displayMetadata();
        song3.displayMetadata();
        song5.displayMetadata();
        song2.displayMetadata();
        song1.displayMetadata();
        song4.displayMetadata();
        song2.displayMetadata();
        song3.displayMetadata();
    }
}
