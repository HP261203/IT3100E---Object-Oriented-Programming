import java.util.Comparator;

abstract public class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

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
    abstract public void display();
    public static final Comparator<Media> COMPARE_BY_COST = new MediaComparatorByCost();
    public static final Comparator<Media> COMPARE_BY_TITLE = new MediaComparatorByTitle();
}
