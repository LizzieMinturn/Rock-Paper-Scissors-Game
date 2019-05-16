package com.LickingHeights;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //rock beats scissors, scissors beats paper, paper beats rock
        Scanner keyboard = new Scanner(System.in);

        boolean value = true;
        boolean win=true;
        //loop for game to start completely over
        while (value) {
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

                //using if/else statement, or switches to build the core game
                //for computer choice
                if (Computer == 0) {
                    System.out.println("I choose rock");
                } else if (Computer == 1) {
                    System.out.println("I choose paper");
                } else if (Computer == 2) {
                    System.out.println("I choose scissors");
                }

                int ComputerScore=ComputerWins(Player, Computer, ComputerScore);
                int PlayerScore=PlayerWins(Player, Computer, PlayerScore);
                System.out.println("Computer Score: "+ComputerScore);
                System.out.println("Player Score: "+PlayerScore);
            }
        }
    }
    //feedback
    //player loses
    public static int ComputerWins(String Player, int Computer, int ComputerScore) {
        if (Player == "rock" && Computer == 1 ||
                Player == "paper" && Computer == 2 ||
                Player == "scissors" && Computer == 0)
            ComputerScore = ComputerScore+1;
        else
            ComputerScore=ComputerScore+0;
        return ComputerScore;
    }
    //player wins
    public static int PlayerWins(String Player, int Computer, int PlayerScore) {
        if (Player == "scissors" && Computer == 1 ||
                Player == "rock" && Computer == 2 ||
                Player == "paper" && Computer == 0)
            PlayerScore = PlayerScore+1;
        else
            PlayerScore=PlayerScore+0;
        return PlayerScore;
    }
    public static boolean StartOver(boolean win, int PlayerScore, int ComputerScore){
        if(PlayerScore==2||ComputerScore==2){
            win=true;
        }
        else win=false;
        return win;
    }
}
