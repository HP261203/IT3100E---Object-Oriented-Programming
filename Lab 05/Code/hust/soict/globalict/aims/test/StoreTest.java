package hust.soict.globalict.aims.test;

import hust.soict.globalict.aims.exception.RepeatException;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.screen.StoreScreen;
import hust.soict.globalict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        store.addMedia(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Science Fiction", "Avatar", 24.99f);
        store.addMedia(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Horror", "Annabelle", 10.99f);
        store.addMedia(dvd5);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Comedy", "Friends", 8.19f);
        store.addMedia(dvd6);

        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Science Fiction", "Star Wars", 19.99f);
        store.addMedia(dvd7);

        Book book1 = new Book();
        book1.setTitle("Convex Optimization");
        try{
            book1.addAuthor("Stephen Boyd");
        } catch (RepeatException r) {
            r.printStackTrace();
        }

        try{
            book1.addAuthor("Lieven Vandenberghe");
        } catch (RepeatException r) {
            r.printStackTrace();
        }
        book1.setCost(10.99f);
        store.addMedia(book1);

        CompactDisc cd1 = new CompactDisc("Helen", new Track("Book",19));
        cd1.addTrack(new Track("Love",20));
        store.addMedia(cd1);

        new StoreScreen(store);

    }
}
