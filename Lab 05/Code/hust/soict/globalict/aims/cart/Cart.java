package hust.soict.globalict.aims.cart;

import java.util.Collections;

import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.MediaComparatorByCost;
import hust.soict.globalict.aims.media.MediaComparatorByTitle;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javax.naming.LimitExceededException;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    public Cart(){
        System.out.println("An cart has been created");
    }

    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    public void addMedia (Media media) throws LimitExceededException{
        if(itemsOrdered.size() < MAX_NUMBERS_ORDERED){
            this.itemsOrdered.add(media);
        } else {
            throw new LimitExceededException("ERROR: The cart is full!");
        }
    }

    public void removeMedia(Media media) throws PlayerException {
        boolean found = this.itemsOrdered.contains(media);
        if(found == true)
            this.itemsOrdered.remove(media);
        else
            throw new PlayerException("ERROR: the item was not found!");
    }

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public float getCost(){
        float cost = 0;
        for(Media element:this.itemsOrdered){
            cost = cost + element.getCost();
        }
        return cost;
    }

    public void sortByTitle() {
        MediaComparatorByTitle compare = new MediaComparatorByTitle();
        Collections.sort(this.itemsOrdered,compare);
        for(Media element:this.itemsOrdered)
            element.display();
    }

    public void sortByCost() {
        MediaComparatorByCost compare = new MediaComparatorByCost();
        Collections.sort(this.itemsOrdered,compare);
        for(Media element:this.itemsOrdered)
            element.display();
    }
}
