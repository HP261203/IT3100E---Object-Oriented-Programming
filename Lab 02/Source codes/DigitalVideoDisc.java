package lab2;
class DigitalVideoDisc {
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title){
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String directory, String category, String title, float cost){
        this.directory = directory;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String directory, int length, float cost){
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.length = length;
        this.cost = cost;
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

    public static void main(String[] args) {
        DigitalVideoDisc dvd = new DigitalVideoDisc("Anime","Doraemon",3.84f);
        dvd.setLength(10);
        System.out.println(dvd.getTitle());
        System.out.println(dvd.getCategory());
        System.out.println(dvd.length);
    }
}
