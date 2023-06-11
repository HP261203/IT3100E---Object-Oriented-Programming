import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    public Cart(){
        System.out.println("An cart has been created");
    }

    private ArrayList<Media>  itemsOrdered = new ArrayList<Media>();
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

    public float getCost(){
        float cost = 0;
        for(Media element:this.itemsOrdered){
            cost = cost + element.getCost();
        }
        return cost;
    }

    public void sortByTitle(){
        MediaComparatorByTitle compare = new MediaComparatorByTitle();
        Collections.sort(this.itemsOrdered,compare);
        for(Media element:this.itemsOrdered)
            element.display();
    }

    public void sortByCost(){
        MediaComparatorByCost compare = new MediaComparatorByCost();
        Collections.sort(this.itemsOrdered,compare);
        for(Media element:this.itemsOrdered)
            element.display();
    }
    public void display(){

    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "Doraemon", 1.80f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Drama", "Mr.Queen", 3.81f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Science Fiction", "Avatar", 24.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Horror", "Annabelle", 10.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Comedy", "Friends", 8.19f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Science Fiction", "Star Wars", 19.99f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Animation", "Vinland Saga", 8.99f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Animation", "Jujutsu Kaisen", 10.99f);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Superhero", "Spiderman 1", 15.99f);
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        cart.addMedia(dvd4);
        cart.sortByTitle();
        System.out.println("");
        cart.sortByCost();
        System.out.println(cart.getCost());
        cart.removeMedia(dvd4);
        System.out.println(cart.getCost());
    }
}
