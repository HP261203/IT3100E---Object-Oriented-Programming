import java.util.ArrayList;

public class Book extends Media {
    /* private int id;
    private String title;
    private String category;
    private float cost; */
    private ArrayList<String> authors = new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public boolean searchAuthor(String authorName){
        boolean found = false;
        for(String element:this.authors){
            if(authorName.equals(element))
                found = true;
        }
        return found;
    }

    public void addAuthor(String authorName){
        boolean found = this.searchAuthor(authorName);
        if(found == false){
            this.authors.add(authorName);
        }
        else
            System.out.println("Already have");
    }

    public void showAuthor(){
        for(String author:this.authors){
            System.out.println(author);
        }
    }

    public void removeAuthor(String authorName){
        boolean found = this.searchAuthor(authorName);
        if(found == true){
            this.authors.remove(authorName);
        }else
            System.out.println("No author!");
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Convex Optimization");
        book1.addAuthor("Stephen Boyd");
        book1.addAuthor("Lieven Vandenberghe");
        book1.showAuthor();
        book1.removeAuthor("Stephen Boyd");
        book1.showAuthor();
    }
}
