package Game;
import GameMaster.GameMaster;
import Player.HumanPlayer;
import Player.VirtualPlayer;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        GameMaster gm = new GameMaster();
        System.out.println("Enter the number of human players: ");
        Scanner sc = new Scanner(System.in);
        int numberplayer = sc.nextInt();

        /* Generate the virtual players */
        if(numberplayer < 4) {
            for(int i = 1; i <= 4 -numberplayer; i++) {
                String str = "Machine";
                VirtualPlayer tmp = new VirtualPlayer(str + i);
                gm.AddPlayer(tmp);
            }
        }

        /* Enter all human players */
        for(int i = 1; i <= numberplayer; i++) {
            String str = sc.next();
            HumanPlayer temp = new HumanPlayer(str);
            gm.AddPlayer(temp);
        }

        /* Start the game */
        gm.Play();
    }
}
