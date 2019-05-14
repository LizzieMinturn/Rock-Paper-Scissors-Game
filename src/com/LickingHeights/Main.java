package com.LickingHeights;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //rock beats scissors, scissors beats paper, paper beats rock

        Scanner keyboard = new Scanner(System.in);


        boolean value = true;
        //loop for game to start completely over
        while(value){
        System.out.println("Let's play a game of rock, paper, scissors!");
        //score keeping veriable
        int playerWins = 0;
        int computerWins = 0;
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
                    //for player choice
                    if(Player=="rock"){
                        Player=choose[0];
                    }
                    else if(Player=="paper"){
                        Player=choose[1];
                    }
                    else if(Player=="scissors"){
                        Player=choose[2];
                    }

                    //for computer choice
                    if(Computer==0){
                        System.out.println("I choose rock");
                    }
                    else if(Computer==1){
                        System.out.println("I choose paper");
                    }
                    else if(Computer==2){
                        System.out.println("I choose scissors");
                    }

                    //feedback
                    //using if/else statement, or switches to build the core game
                    //player loses
                    if(Computer==0&&Player==choose[2]){
                        System.out.println("Computer Score: "+ computerWins+1);
                        System.out.println("Player Score: "+ playerWins+0);
                    }
                    else if(Computer==1&&Player==choose[0]){
                        System.out.println("Computer Score: "+ computerWins+1);
                        System.out.println("Player Score: "+ playerWins+0);
                    }
                    else if(Computer==2&&Player==choose[1]) {
                        System.out.println("Computer Score: " + computerWins+1);
                        System.out.println("Player Score: " + playerWins+0);
                    }
                    //player wins
                    else if(Computer==0&&Player==choose[1]) {
                        System.out.println("Computer Score: " + computerWins+0);
                        System.out.println("Player Score: " + playerWins+1);
                    }
                    else if(Computer==1&&Player==choose[2]) {
                        System.out.println("Computer Score: " + computerWins+0);
                        System.out.println("Player Score: " + playerWins+1);
                    }
                    else if(Computer==2&&Player==choose[0]) {
                        System.out.println("Computer Score: " + computerWins+0);
                        System.out.println("Player Score: " + playerWins+1);
                    }
                    }
                }
            }
        }
