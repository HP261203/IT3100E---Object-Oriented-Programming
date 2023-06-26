package hust.soict.globalict.aims.test;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.screen.CartScreen;

import javax.naming.LimitExceededException;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "Doraemon", 1.80f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Drama", "Mr.Queen", 3.81f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Science Fiction", "Avatar", 24.99f);
        try{
            cart.addMedia(dvd1);
        } catch (LimitExceededException e) {
            e.printStackTrace();
        }

        try{
            cart.addMedia(dvd2);
        } catch (LimitExceededException e) {
            e.printStackTrace();
        }

        try {
            cart.addMedia(dvd3);
        } catch (LimitExceededException e) {
            e.printStackTrace();
        }
        new CartScreen(cart);
    }
}
