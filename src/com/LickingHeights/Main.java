package com.LickingHeights;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //rock beats scissors, scissors beats paper, paper beats rock

        Scanner keyboard = new Scanner(System.in);


        boolean value = true;
        //loop for game to start completely over
        while (value) {
            System.out.println("Let's play a game of rock, paper, scissors!");
            //score keeping veriable
            int playerScore = 0;
            int computerScore = 0;
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
                //for player choice

                //for computer choice
                if (Computer == 0) {
                    System.out.println("I choose rock");
                } else if (Computer == 1) {
                    System.out.println("I choose paper");
                } else if (Computer == 2) {
                    System.out.println("I choose scissors");
                }
                //player wins

            }
        }

    }   //feedback
        //player loses
        public static int ComputerWins(String Player, int Computer, int ComputerScore){
            if(Player=="rock"&&Computer==1 ||
                    Player=="paper"&&Computer==2 ||
                    Player=="scissors"&&Computer==0)
                ComputerScore=ComputerScore+1;
            return ComputerScore;
        }
        public static int PlayerWins(String Player, int Computer, int PlayerScore){
            if(Player=="rock"&&Computer==1 ||
                    Player=="paper"&&Computer==2 ||
                    Player=="scissors"&&Computer==0)
                PlayerScore=PlayerScore+1;
            return PlayerScore;

}
