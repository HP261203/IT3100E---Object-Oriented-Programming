package Dice;

import java.util.Random;

public class Dice {
    public int Roll(int choice) {
        Random random = new Random();
        int probability = random.nextInt(100);
        if(choice == 0) {
            if (probability < 20)
                return 1;
            else if (probability < 36)
                return 2;
            else if (probability < 52)
                return 3;
            else if (probability < 68)
                return 4;
            else if (probability < 84)
                return 5;
            else return 6;
        } else if(choice == 1) {
            if (probability < 16)
                return 1;
            else if (probability < 36)
                return 2;
            else if (probability < 52)
                return 3;
            else if (probability < 68)
                return 4;
            else if (probability < 84)
                return 5;
            else return 6;
        } else if(choice == 2) {
            if (probability < 16)
                return 1;
            else if (probability < 32)
                return 2;
            else if (probability < 52)
                return 3;
            else if (probability < 68)
                return 4;
            else if (probability < 84)
                return 5;
            else return 6;
        } else if(choice == 3) {
            if (probability < 16)
                return 1;
            else if (probability < 32)
                return 2;
            else if (probability < 48)
                return 3;
            else if (probability < 64)
                return 4;
            else if (probability < 84)
                return 5;
            else return 6;
        } else return -1;
    }
}

