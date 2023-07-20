package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    static final int STARTPOSITION = 0;
    public static void main(String[] args) {
        System.out.println("The player position is " + STARTPOSITION);
        int dieValue = (int)(Math.random()*6-1+1)+1;
        System.out.println("The die value is " + dieValue);
    }
}
