

public class TestPassingParameter {

    //Incorrect swapping function
    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    } 

    public static void trueswap(DVDWrapper wrapper1, DVDWrapper wrapper2){
        DigitalVideoDisc temp = wrapper1.dvd;
        wrapper1.dvd = wrapper2.dvd;
        wrapper2.dvd = temp;
    } 

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    public static void main(String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("False swap: ");
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle()); 

        System.out.println("True swap: ");
        DVDWrapper wrapper1 = new DVDWrapper(jungleDVD);
        DVDWrapper wrapper2 = new DVDWrapper(cinderellaDVD);
        trueswap(wrapper1, wrapper2);
        System.out.println(wrapper1.dvd.getTitle());
        System.out.println(wrapper2.dvd.getTitle());
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
}
