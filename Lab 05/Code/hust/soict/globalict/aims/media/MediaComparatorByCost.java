package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByCost implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        if(o1.getCost() > o2.getCost()) return 1;
        else if (o1.getCost() < o2.getCost()) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        DigitalVideoDisc dvd = new DigitalVideoDisc("Anime","Doraemon",3.84f);
        Book book2 = new Book();
        book2.setCost(5.99f);
        MediaComparatorByCost compare1 = new MediaComparatorByCost();
        System.out.println(compare1.compare(dvd,book2));
    }
}
