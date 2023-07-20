package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    static final int STARTPOSITION = 0;
    static final int FINALPOSITION = 100;
    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("The player start position is " + STARTPOSITION);
        while (playerPosition < FINALPOSITION) {
            int dieValue = (int)(Math.random()*6-1+1)+1;
            System.out.println("The die value is " + dieValue);
            playerPosition += dieValue;
            if (playerPosition > FINALPOSITION) {
                playerPosition -= dieValue;
            }
            System.out.println("The player position is " + playerPosition);
            int option = (int)(Math.random()*3-1+1)+1;
            switch (option) {
                case 1: {
                    System.out.println("The player in the same position");

                }break;
                case 2: {
                    System.out.println("The player got the Ladder");
                    playerPosition += dieValue;
                    if (playerPosition > FINALPOSITION) {
                        playerPosition -= dieValue;
                    }
                }break;
                case 3: {
                    System.out.println("The player got the Snake");
                    playerPosition -= dieValue;
                }break;
            }
            System.out.println("The player position is " + playerPosition);
        }
        System.out.println("The player wins.");
        System.out.println("The player final position is " + playerPosition);
    }
}
