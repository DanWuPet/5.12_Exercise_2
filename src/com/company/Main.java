package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int x = 0;
        int guess;
        Random rnd = new Random();
        int number = rnd.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100\n(Including both)." +
                " Can you guess what it is? \nYou have 3 tries.");

        while(x != 3){
            System.out.print("Type a number: ");
            Scanner in = new Scanner(System.in);
            guess = in.nextInt();
            System.out.println("Your guess is: " + guess);
            if (guess < number){
                System.out.println("Higher!");
            } else if (guess > number){
                System.out.println("Lower!");
            } else{
                System.out.println("You guessed the number!");
                x = 3;
            }
            x = x+1;
            System.out.println((3 - x) + " tries left!");
        }
    }
}
