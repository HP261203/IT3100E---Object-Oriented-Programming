
public class Cart {
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

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if(this.qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        }else{
            this.itemsOrdered[this.qtyOrdered] = dvd1;
            this.qtyOrdered ++;
            System.out.println("The first disc has been added");
            if(this.qtyOrdered >= MAX_NUMBERS_ORDERED){
                System.out.println("The cart is almost full");
            }else{
                this.itemsOrdered[this.qtyOrdered] = dvd1;
                this.qtyOrdered ++;
                System.out.println("The second disc has been added");
            }
        }
    }

    /*  public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        int N = dvdList.length;
        if(this.qtyOrdered >= MAX_NUMBERS_ORDERED)
            System.out.println("The cart is almost full");
        else if(this.qtyOrdered + N > MAX_NUMBERS_ORDERED)
            System.out.println("Too many discs");
        else{
            for(int i = 0;i < N;i++){
                this.itemsOrdered[this.qtyOrdered] = dvdList[i];
                this.qtyOrdered ++;
            }
            System.out.println("A series of disc was added");
        }
    } */

    public void addDigitalVideoDisc(DigitalVideoDisc... dvd){
        for(int i = 0;i < dvd.length;i++){
            if(this.qtyOrdered >= MAX_NUMBERS_ORDERED){
                System.out.println("The cart is almost full");
                break;
            }else{
                this.itemsOrdered[this.qtyOrdered] = dvd[i];
                this.qtyOrdered ++;
                System.out.println("The disc has been added");
            }
        }
    } 

    public void removeDigitalVideoDisc(DigitalVideoDisc dvd){
        System.out.println("A disc was removed from the cart");
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

    public float totalCost(){
        float result = 0;
        for(int i = 0;i < this.qtyOrdered; i++)
            result = result + this.itemsOrdered[i].getCost();
        return result;
    }

    public int getQtyOrdered() {
        return this.qtyOrdered;
    }

    public void display(){
        System.out.println("**********CART**********");
        System.out.println("Ordered Items:");
        float total = 0;
        for(int i = 0;i < this.qtyOrdered;i++){
            total = total + this.itemsOrdered[i].getCost();
            System.out.println((i+1) + ". " + this.itemsOrdered[i].getTitle() + " " + this.itemsOrdered[i].getCategory() + " "  + this.itemsOrdered[i].getDirectory() + " "  + this.itemsOrdered[i].getLength() + " "  + this.itemsOrdered[i].getCost());
        }
        System.out.println("Total cost: " + total);
        System.out.println("**************************");
    }

    public void searchid(int id){
        if(id < 0||id > this.qtyOrdered)
            System.out.println("No such disc was found");
        else{
            int i = id-1;
            System.out.println("The DVD was found");
            System.out.println((i+1) + ". " + this.itemsOrdered[i].getTitle() + " " + this.itemsOrdered[i].getCategory() + " "  + this.itemsOrdered[i].getDirectory() + " "  + this.itemsOrdered[i].getLength() + " "  + this.itemsOrdered[i].getCost());
        }
    }

    public void searchtitle(DigitalVideoDisc dvd){
        int found = 0;
        for(int i = 0;i < this.qtyOrdered;i++){
            boolean check = this.itemsOrdered[i].getTitle() == dvd.getTitle();
            if(check == true){
                System.out.println("The DVD was found");
                System.out.println((i+1) + ". " + this.itemsOrdered[i].getTitle() + " " + this.itemsOrdered[i].getCategory() + " "  + this.itemsOrdered[i].getDirectory() + " "  + this.itemsOrdered[i].getLength() + " "  + this.itemsOrdered[i].getCost());
                found ++;
                break;
            }
        }
        if(found == 0) System.out.println("No such disc was found");
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
        DigitalVideoDisc[] dvdList = {dvd6, dvd7};
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
        System.out.println('\n');

        cart.addDigitalVideoDisc(dvd4, dvd5);
        
        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
        System.out.println('\n');

    /*     cart.addDigitalVideoDisc(dvdList);
        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
        System.out.println('\n'); */

        cart.addDigitalVideoDisc(dvd8,dvd9,dvd10);
        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
        System.out.println('\n'); 

        cart.display();
        System.out.println('\n');
        cart.searchtitle(dvd6);
        System.out.println('\n');
        cart.searchtitle(dvd10);
        System.out.println('\n');
        cart.searchid(3);

        cart.removeDigitalVideoDisc(dvd3);
        System.out.printf("The total cost is %.3f\n", cart.totalCost());
        System.out.println("The number of disc is: " + cart.getQtyOrdered());
    }
}
