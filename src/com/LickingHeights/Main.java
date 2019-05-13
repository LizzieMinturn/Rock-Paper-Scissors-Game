package com.LickingHeights;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //using if/else statement, or switches to build the core game
        //rock beats scissors, scissors beats paper, paper beats rock

        Scanner keyboard = new Scanner(System.in);


        boolean value = true;
        //loop for game to start completely over
        while(value){
        System.out.println("Let's play a game of rock, paper, scissors!");
        System.out.println("what's your first move?");
        int playerWins = 0;
        int computerWins = 0;
        //loop for core game code
        while (value) {
            System.out.println("what's your next move?");
            String Player = keyboard.nextLine();

            //use simple array to pull computer choice
            String choose[] = new String[3];
            choose[0] = "rock";
            choose[1] = "paper";
            choose[2] = "scissors";
            int Computer = new Random().nextInt(choose.length);

                    //for computer wins
                    if(Computer==0){
                        System.out.println("I choose rock");
                    }
                    else if(Computer==1){
                        System.out.println("I choose paper");
                    }
                    else if(Computer==2){
                        System.out.println("I choose scissors");
                    }

                    //score keeping veriable with feedback
                    if(){

                    }
                    }
                }
            }
        }
