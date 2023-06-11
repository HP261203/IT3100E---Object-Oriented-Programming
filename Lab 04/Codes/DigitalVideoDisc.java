
public class DigitalVideoDisc extends Disc implements Playable {
    /*private String title;
    private String category;
    private int id = 0;
    private float cost; */
    private String directory;

    private int length;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title){
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, float cost){
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.nbDigitalVideoDiscs ++;
        this.id = this.nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String directory, String category, String title, float cost){
        super();
        this.directory = directory;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.nbDigitalVideoDiscs ++;
        this.id = this.nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String directory, int length, float cost){
        super();
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.length = length;
        this.cost = cost;
        this.nbDigitalVideoDiscs ++;
        this.id = this.nbDigitalVideoDiscs;
    }

    public String getTitle(){
        return this.title;
    }

    public String getCategory(){
        return this.category;
    }

    public String getDirectory(){
        return this.directory;
    }

    public int getLength(){
        return this.length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getCost(){
        return this.cost;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public int getId() {
        return id;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD Length: " + this.getLength());
    }
    @Override
    public String toString(){
        return "DVD Title: " + title + " Cost: " + cost;
    }
    public void display(){
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        DigitalVideoDisc dvd = new DigitalVideoDisc("Anime","Doraemon",3.84f);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation","Jujutsu Kaisen",5.99f);
        dvd1.display();
        dvd.play();
        System.out.println(dvd.getId());
    }
}