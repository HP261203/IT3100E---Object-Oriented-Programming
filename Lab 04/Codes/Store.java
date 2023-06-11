import java.util.ArrayList;

public class Store {
    public static final int MAX = 200;
    private int qtyStored = 0;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public void addMedia(Media media){
        this.itemsOrdered.add(media);
    }
    public void removeMedia(Media media){
        boolean found = this.itemsOrdered.contains(media);
        if(found == true)
            this.itemsOrdered.remove(media);
        else
            System.out.println("No such was found");
    }


    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        store.addMedia(dvd2);
    }
}
