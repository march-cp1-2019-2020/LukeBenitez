package murach.business;

public class Album extends Product {

    private String artist;

    public Album() {
        super();
        artist = "";
        count++;
    }

    public void setAuthor(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist;
    }
}