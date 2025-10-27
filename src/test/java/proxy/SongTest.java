package proxy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import proxy.library.Song;

public class SongTest {
    @Test
    public void testSongID() {
        Integer songID = 1;
        Song song = new Song();
        song.setSongID(songID);
        assertEquals(song.getSongID(), songID);
    }

    @Test
    public void testSongTitle() {
        String title = "title";
        Song song = new Song();
        song.setTitle(title);
        assertEquals(song.getTitle(), title);
    }

    @Test
    public void testSongArtist() {
        String artist = "artist";
        Song song = new Song();
        song.setArtist(artist);
        assertEquals(song.getArtist(), artist);
    }

    @Test
    public void testSongAlbum() {
        String album = "album";
        Song song = new Song();
        song.setAlbum(album);
        assertEquals(song.getAlbum(), album);
    }

    @Test
    public void testSongDuration() {
        int duration = 100;
        Song song = new Song();
        song.setDuration(duration);
        assertEquals(song.getDuration(), duration);
    }
}
