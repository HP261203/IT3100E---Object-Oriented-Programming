package GameMaster;

import Dice.Dice;
import Player.Player;
import java.util.ArrayList;
import java.util.Random;
import Player.VirtualPlayer;
public class GameMaster {
    private int EndGame = -1;
    private ArrayList<Player> Players = new ArrayList<>();
    public void AddPlayer(Player player) {
        this.Players.add(player);
    }

    public int getEndGame() {
        return EndGame;
    }

    public int NextTurn() {
        Random random = new Random();
        return random.nextInt(4);
    }
    public int Roll(int choice) {
        Dice dice = new Dice();
        return dice.Roll(choice);
    }
    public int CheckEndGame() {
        int i = 0;
        for(Player player : this.Players) {
            if(player.getScore() == 21)
            {
                return i;
            }
            i++;
        }
        return -1;
    }
    public void Display() {
        int i = 1;
        for(Player player : this.Players){
            System.out.println("Player " + i + " score is: " + player.getScore());
            i++;
        }
    }
    public void UpdateScore(Player player, int score) {
        if(player.score + score > 21) {
            player.setScore(0);
        }
        else player.setScore(player.getScore() + score);
    }
    public void Play() {
        int turn = 1;
        Random random = new Random();
        while (this.EndGame == -1) {
            int next = this.NextTurn();
            System.out.println("=================================");
            System.out.println("TURN: " + turn);
            System.out.println("Player " + (next + 1) + " is next");

            int choice = random.nextInt(4);
            int roll = this.Roll(choice);
            System.out.println("The dice roll: " + roll);

            Player thisturn = this.Players.get(next);
            this.UpdateScore(thisturn, roll);
            this.Display();
            System.out.println("=================================");
            this.EndGame = this.CheckEndGame();
            turn ++;
        }
        System.out.println("The winner is player " + (this.getEndGame() + 1));
        Player winner = this.Players.get(this.EndGame);
        winner.display();
        for(Player player : this.Players) {
            if(player.getName().equals(winner.getName()))
                continue;
            else {
                if(player instanceof VirtualPlayer) {
                    ((VirtualPlayer) player).reaction();
                }
            }
        }
    }
}
