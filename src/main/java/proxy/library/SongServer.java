package proxy.library;

import java.util.ArrayList;
import java.util.List;

public class SongServer implements SongService {
    private static SongServer instance;
    List<Song> songs = new ArrayList<>();

    public static SongServer getInstance() {
        if (instance == null) {
            instance = new SongServer();
        }
        return instance;
    }

    public List<Song> getSongs() {
        return this.songs;
    }

    public void addSong(Song song) {
        song.setSongID(this.songs.size());
        this.songs.add(song);
    }

    public Song searchById(Integer songID) {
        try {
            System.out.println("Simulating network delay...");
            Thread.sleep(1000);
        } catch (Exception e) {}

        Song song = this.songs.get(songID);

        return song;
    }

    public List<Song> searchByTitle(String title) {
        List<Song> songResults = new ArrayList<>();
        try {
            System.out.println("Simulating network delay...");
            Thread.sleep(1000);
        } catch (Exception e) {}

        Song foundSong = null;

        for (Song song : this.songs) {
            if (song.getTitle().equals(title)) {
                songResults.add(song);
            }
        }

        return songResults;
    }

    public List<Song> searchByAlbum(String album) {
        List<Song> songResults = new ArrayList<>();
        try {
            System.out.println("Simulating network delay...");
            Thread.sleep(1000);
        } catch (Exception e) {}

        for (Song song : this.songs) {
            if (song.getAlbum().equals(album)) {
                songResults.add(song);
            }
        }

        return songResults;
    }
}
