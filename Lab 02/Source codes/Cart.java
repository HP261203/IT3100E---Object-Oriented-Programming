package lab2;
class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public Cart(){
        System.out.println("An cart has been created");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd){
        if(this.qtyOrdered >= MAX_NUMBERS_ORDERED)
            System.out.println("The cart is almost full");
        else{
            this.itemsOrdered[this.qtyOrdered] = dvd;
            this.qtyOrdered ++;
            System.out.println("The disc has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc dvd){
        int pos = -1;
        for(int i = 0;i < this.qtyOrdered; i++)
            if(this.itemsOrdered[i] == dvd){
                pos = i;
                break;
            }
        if(pos < 0) System.out.println("No such disc found!");
        else{
            for(int i = pos; i < this.qtyOrdered-1; i++){
                this.itemsOrdered[i] = this.itemsOrdered[i+1];
            }
            this.qtyOrdered = this.qtyOrdered - 1;
        }
    }

    public double totalCost(){
        double result = 0;
        for(int i = 0;i < this.qtyOrdered; i++)
            result = result + this.itemsOrdered[i].getCost();
        return result;
    }

    public int getQtyOrdered() {
        return this.qtyOrdered;
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "Doraemon", 1.80f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Drama", "Mr.Queen", 3.81f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        
        System.out.printf("%.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());

        cart.removeDigitalVideoDisc(dvd3);
        System.out.printf("%.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
    }
}
