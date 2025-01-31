public class Music {
    public String title;
    public String artist;

    public Music(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    public Music() {

    }

    @Override
    public String toString() {
        return "Title: " + title + "  Artista: " + artist;
    }
}
