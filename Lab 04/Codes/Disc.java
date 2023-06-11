public class Disc extends Media{
    protected int length;
    protected String directory;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirectory() {
        return directory;
    }
    @Override
    public String toString(){
        return "Disc: " + title + " Cost: " + cost;
    }
    public void display(){
        System.out.println(this.toString());
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
