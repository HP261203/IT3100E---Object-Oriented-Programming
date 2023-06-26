package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.Playable;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }

    @Override
    public void play() throws PlayerException {
        if(this.getLength() > 0) {
            System.out.println("Playing Track: " + this.getTitle());
            System.out.println("Track Length: " + this.getLength());
        } else
            throw new PlayerException("ERROR: Track Length is non-positive");
    }
}
