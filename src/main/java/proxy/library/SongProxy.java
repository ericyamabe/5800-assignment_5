package proxy.library;

public class SongProxy implements DisplayObject {
    private Integer songID;
    private Song song;

    public SongProxy(Integer songID) {
        this.songID = songID;
    }

    public void displayMetadata() {
        if(this.song == null) {
            SongServer songServer = SongServer.getInstance();
            this.song = songServer.searchById(this.songID);

            if(this.song == null) {
                System.out.println("Song not found");
            }
        }

        System.out.println(this.song);
    }
}
