package Player;

public class HumanPlayer extends Player {
    public HumanPlayer(String name){
        super();
        this.name = name;
        this.score = 0;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Score: " + this.score;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
