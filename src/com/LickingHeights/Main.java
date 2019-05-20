package com.LickingHeights;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //rock beats scissors, scissors beats paper, paper beats rock
        Scanner keyboard = new Scanner(System.in);

        boolean value = true;
        boolean win=true;
        int PlayerScore=0;
        int ComputerScore=0;
        //loop for game to start completely over
        while (win) {
            System.out.println("Let's play a game of rock, paper, scissors!");
            //score keeping veriable
            //loop for core game code
            while (value) {
                System.out.println("what's your move?");
                String Player = keyboard.nextLine();

                //use simple array to pull computer choice
                String choose[] = new String[3];
                choose[0] = "rock";
                choose[1] = "paper";
                choose[2] = "scissors";
                int Computer = new Random().nextInt(choose.length);

                if (Computer == 0) {
                    System.out.println("I choose rock");
                } else if (Computer == 1) {
                    System.out.println("I choose paper");
                } else if (Computer == 2) {
                    System.out.println("I choose scissors");
                }
                //feedback
                ComputerScore=ComputerWins(Player, Computer, ComputerScore);
                PlayerScore=PlayerWins(Player, Computer, PlayerScore);
                System.out.println("Computer Score: "+ComputerScore);
                System.out.println("Player Score: "+PlayerScore);

                if(PlayerScore==2||ComputerScore==2){
                    break;
                }
                else{
                }
            }
        }
    }
    //using if/else statement, or switches to build the core game
    //computer wins
    public static int ComputerWins(String Player, int Computer, int ComputerScore) {
        if (Player.equals("rock") && Computer == 1 ||
                Player.equals("paper") && Computer == 2 ||
                Player.equals("scissors") && Computer == 0){
            ComputerScore = ComputerScore+1;}
        else{
            ComputerScore=ComputerScore;}
        return ComputerScore;
    }
    //player wins
    public static int PlayerWins(String Player, int Computer, int PlayerScore) {
        if (Player.equals("scissors") && Computer == 1 ||
                Player.equals("rock") && Computer == 2 ||
                Player.equals("paper") && Computer == 0)
            PlayerScore = PlayerScore+1;
        else
            PlayerScore=PlayerScore;
        return PlayerScore;
    }
}
