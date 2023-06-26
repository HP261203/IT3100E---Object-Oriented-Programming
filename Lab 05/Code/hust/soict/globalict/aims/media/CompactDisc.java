package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public boolean searchTrack(Track track){
        boolean found = this.tracks.contains(track);
        return found;
    }
    public void addTrack(Track track){
        boolean found = this.searchTrack(track);
        if(found == false)
            this.tracks.add(track);
        else
            System.out.println("The track already exists");
    }

    public void removeTrack(Track track){
        boolean found = this.searchTrack(track);
        if(found == false)
            System.out.println("No such track was found");
        else
            this.tracks.remove(track);
    }

    public CompactDisc(String artist, Track track) {
        this.artist = artist;
        this.tracks.add(track);
    }
    public int getLength(){
        int result = 0;
        for(Track element:this.tracks){
            result = result + element.getLength();
        }
        return result;
    }

    @Override
    public void play() throws PlayerException {
        if(this.getLength() > 0){
            //TODO Play all tracks in the CD as you have implemented
            java.util.Iterator iter = tracks.iterator();
            Track nextTrack;
            while(iter.hasNext()) {
                nextTrack = (Track) iter.next();
                try {
                    nextTrack.play();
                } catch (PlayerException e) {
                    throw e;
                }
            }
        } else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
    }

    public static void main(String[] args) {
        CompactDisc cd1 = new CompactDisc("Helen", new Track("Book",19));
        cd1.addTrack(new Track("Love",20));
        System.out.println(cd1.getLength());
        try {
            cd1.play();
        } catch (PlayerException e) {
            e.printStackTrace();
        }
    }
}
