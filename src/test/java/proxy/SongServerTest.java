package proxy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import proxy.library.Song;
import proxy.library.SongServer;

import java.util.ArrayList;
import java.util.List;

public class SongServerTest {
    @Test
    public void testAddSong() {
        Song song = new Song();
        song.setTitle("Hello");
        song.setArtist("World");
        song.setAlbum("CS5800");
        song.setDuration(16);

        SongServer songServer = SongServer.getInstance();
        songServer.addSong(song);
        assertEquals(songServer.searchById(0), song);
    }

    @Test
    public void testSearchByID() {
        Song song = new Song();
        song.setTitle("Here we go again");
        song.setArtist("World");
        song.setAlbum("CS-5800");
        song.setDuration(16);

        SongServer songServer = SongServer.getInstance();
        songServer.addSong(song);
        assertEquals(songServer.searchById(1), song);
    }

    @Test
    public void testSearchByTitle() {
        Song song = new Song();
        song.setTitle("Song by Title");
        song.setArtist("World");
        song.setAlbum("CS 5800");
        song.setDuration(16);

        List<Song> expected = new ArrayList<>();
        expected.add(song);

        SongServer songServer = SongServer.getInstance();
        songServer.addSong(song);
        assertEquals(songServer.searchByTitle("Song by Title"), expected);
    }

    @Test
    public void testSearchByAlbum() {
        Song song = new Song();
        song.setTitle("Song by Album");
        song.setArtist("World");
        song.setAlbum("CS_5800");
        song.setDuration(16);
        song.setSongID(1);

        List<Song> expected = new ArrayList<>();
        expected.add(song);

        SongServer songServer = SongServer.getInstance();
        songServer.addSong(song);
        assertEquals(songServer.searchByAlbum("CS_5800"), expected);
    }
}
