package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int random, guess;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        random = generator.nextInt(30) + 1;
        int counter = 0;

        System.out.print("I am thinking of a number between 0 and 30, what do you think it is?");

        do {
            guess = keyboard.nextInt();
            if (counter == 9) {
                break;
            } else if (guess > random) {
                System.out.print("Lower!");
            } else if (guess < random) {
                System.out.print("Higher!");
            } else if (guess == random) {
                System.out.print(random + " is the correct answer and it took you " + counter + " attempts to guess it!");
            }

            if (counter == 3) {
                System.out.println(" You have 6 tries left");
            } else if (counter == 6) {
                System.out.println(" You have 3 tries left");
            }

            counter = counter + 1;
        } while (guess != random);


    }
}




