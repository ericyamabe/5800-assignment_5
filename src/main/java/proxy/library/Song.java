package proxy.library;

public class Song {
    private Integer songID;
    private String title;
    private String album;
    private String artist;
    private Integer duration;

    public Integer getSongID() {
        return this.songID;
    }

    public void setSongID(Integer songID) {
        this.songID = songID;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song ID: " + this.songID + ", Title: " + this.title + ", Album: " + this.album + ", Artist: "
                + this.artist + ", Duration: " + this.duration;
    }
}
