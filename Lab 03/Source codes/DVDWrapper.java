public class DVDWrapper {
    DigitalVideoDisc dvd;

    DVDWrapper(DigitalVideoDisc dvd){
        System.out.println("A wrapper was created");
        this.dvd = dvd;
    }
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "Doraemon", 1.80f);
        DVDWrapper wrapper1 = new DVDWrapper(dvd1);
        System.out.println(wrapper1.dvd.getTitle());
    }
}

