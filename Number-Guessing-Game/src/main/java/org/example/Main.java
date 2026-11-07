package org.example;
import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       Random random = new Random();
       Scanner scanner = new Scanner(System.in);

        int randomNum;
        int guess = 0;
        int attempts = 0;


        randomNum = random.nextInt(1, 101);


        while (guess != randomNum) {
            attempts++;
            System.out.print("Guess a number ranging from 1 - 100: ");
            guess = scanner.nextInt();
            if (guess > randomNum) {
                System.out.println("Too High! Try again.");

            } else if (guess < randomNum) {
                System.out.println("Too Low! Try again.");

            }
            System.out.println("Attempts: " + attempts);

        }
        System.out.println("Congratulation🎊, You guess the random number correctly. It took you " + attempts + " attempts.");
        }
    }
