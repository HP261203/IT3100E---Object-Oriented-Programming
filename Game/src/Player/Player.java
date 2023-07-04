package Player;
import Dice.Dice;

abstract public class Player {
    protected String name;
    public int score = 0;
    protected Dice dice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    abstract public void display();
}
