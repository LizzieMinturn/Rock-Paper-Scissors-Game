package com.LickingHeights;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        boolean value = true;
        System.out.println("Let's play a game of rock, paper, scissors!");
        while (value) {
            System.out.println("what's your move?");
            String Player = keyboard.nextLine();

            String choose[] = new String[3];
            choose[0] = "rock";
            choose[1] = "paper";
            choose[2] = "scissors";
            int Computer = new Random().nextInt(choose.length);

            //printing for computer choice
                    if(Computer==0){
                        System.out.println("I choose rock");
                    }
                    else if(Computer==1){
                        System.out.println("I choose paper");
                    }
                    else if(Computer==3){
                        System.out.println("I choose scissors");
                    }
            }
        }
    }
