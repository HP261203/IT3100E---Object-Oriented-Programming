import lab2.DigitalVideoDisc;
public class Store {
    public static final int MAX = 200;
    private int qtyStored = 0;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX];

    public void addDvD(DigitalVideoDisc dvd){
        if(this.qtyStored >= MAX)
            System.out.println("The store is full");
        else{
            this.itemsInStore[qtyStored] = dvd;
            this.qtyStored++;
            System.out.println("The DVD has been successfully added");
        }
    }

    public void removeDvD(DigitalVideoDisc dvd){
        int pos = -1;
        for(int i = 0;i < this.qtyStored; i++)
            if(this.itemsInStore[i] == dvd){
                pos = i;
                break;
            }
        if(pos < 0) System.out.println("No such disc found!");
        else{
            for(int i = pos; i < this.qtyStored-1; i++){
                this.itemsInStore[i] = this.itemsInStore[i+1];
            }
            this.qtyStored = this.qtyStored - 1;
            System.out.println("The DVD was successfully removed");
        }
    }
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDvD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        store.addDvD(dvd2);

        store.removeDvD(dvd2);
    }
}
