package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public static final int MAX = 200;
    private int qtyStored = 0;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void addMedia(Media media){
        this.itemsInStore.add(media);
        System.out.println("A media was added");
    }
    public void removeMedia(Media media){
        boolean found = this.itemsInStore.contains(media);
        if(found == true)
            this.itemsInStore.remove(media);
        else
            System.out.println("No such was found");
    }
}
