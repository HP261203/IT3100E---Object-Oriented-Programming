package Player;

public class VirtualPlayer extends Player {
    public VirtualPlayer(String name){
        super();
        this.name = name;
        this.score = 0;
    }

    @Override
    public String toString() {
        return "Virtual Player: " + name + " Score: " + score;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    public void reaction() {
        System.out.println("Virtual Player " + this.name + " failed!");
    }
}
