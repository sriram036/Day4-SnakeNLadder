package com.bridgelabz;


public class SnakeAndLadder {
    static final int STARTPOSITION = 0;
    static final int FINALPOSITION = 100;
    int count;
    int playerPosition;
    int option;
    int dieRoll(){
        count++;
        return (int) (Math.random()*6-1+1)+1;
    }
    int checkOption(){
        return (int) (Math.random()*3-1+1)+1;
    }
    void play(){
        int dieRollNum = dieRoll();
        System.out.println("The Dice Number is " + dieRollNum);
        if(playerPosition + dieRollNum > FINALPOSITION){
            playerPosition = playerPosition - dieRollNum;
        }
        else{
            playerPosition = playerPosition + dieRollNum;
        }
        option = checkOption();
        System.out.println("The option is " + option);
        switch (option) {
            case 1: {
                System.out.println("The Player in the same position.");
            }
            break;
            case 2: {
                System.out.println("The Player got the Ladder.");
                playerPosition += dieRollNum;
                if(playerPosition > FINALPOSITION){
                    playerPosition -= dieRollNum;
                }
            }
            break;
            case 3: {
                System.out.println("The Player got the snake.");
                playerPosition -= dieRollNum;
            }
            break;
        }
        System.out.println("The player position is " + playerPosition);
        if(playerPosition < 0){
            playerPosition = STARTPOSITION;
        }
    }
    public static void main(String[] args) {
        SnakeAndLadder player1 = new SnakeAndLadder();
        SnakeAndLadder player2 = new SnakeAndLadder();

        while (player1.playerPosition < FINALPOSITION && player2.playerPosition < FINALPOSITION) {
            do {
                player1.play();
                System.out.println("Player 1 position is " + player1.playerPosition);
            }while (player1.option == 2);
            do {
                player2.play();
                System.out.println("Player 2 position is " + player2.playerPosition);
            }while (player2.option == 2);
        }
        System.out.println("The total no of time player 1 die rolled is " + player1.count);
        System.out.println("The total no of time player 2 die rolled is " + player2.count);
        System.out.println("The player 1 is reached " + player1.playerPosition);
        System.out.println("The player 2 is reached " + player2.playerPosition);
        if(player1.playerPosition > player2.playerPosition){
            System.out.println("Player 1 wins the game.");
        }
        else {
            System.out.println("Player 2 wins the game.");
        }
    }
}
