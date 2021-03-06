package com.midterm;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public int startGame() {
        Scanner scanner = new Scanner(System.in);
        int winner = -1;

        //start game
        System.out.println("\n~~~~~~~~~~Welcome to ROCK PAPER SCISSORS!!!~~~~~~~~~~");
        System.out.println("\nYou will be competing against our smartest computer!" +
                "\nHere are your options." +
                "\n1. Rock" +
                "\n2. Paper" +
                "\n3. Scissors");

        //create a variable to hold the user response using the Scanner object. The response needs to be an integer between 1-3 (1 = Rock, 2 = Paper, 3 = Scissors)
        int response = scanner.nextInt();

        // create a variable to hold the cpu response generated by the getCPUResponse() method.
        int cpu = getCPUResponse();

        //compare user and cpu response with each other to decide the winner.
        /*
        Key to understanding logic
        (1 = Rock, 2 = Paper, 3 = Scissors)
        winning number = option v option ~~ SUM of options
        1 = 1 v 3 ~~ (SUM = 4)
        2 = 2 v 1 ~~ (SUM = 3)
        3 = 3 v 2 ~~ (SUM = 5)
        Tie = 1v1, 2v2, 3v3
         */

        if (response <= 0 || response > 3) {
            //No value should be outside the range of 1-3
            System.out.println("Wrong value! You automatically lose!");
            winner = 0;

        } else if (cpu == response) {
            //If the values are the same no one wins
            System.out.println("There's a tie!! No one wins!");
            winner = 3;

        } else {
            //The sum of both values
            int total = cpu + response;

            switch (total) {


                case 4:
                    if (cpu == 1) {
                        System.out.println("Hahaha! The computer wins!");
                        winner = 1;

                    } else if (response == 1) {
                        System.out.println("Yaaayy!!! You win!!");
                        winner = 2;

                    } else {
                        System.out.println("Uuuummmm, we don't know what just happened. Try again!");
                        winner = 4;
                    }

                    break;

                case 3:
                    if (cpu == 2) {
                        System.out.println("Hahaha! The computer wins!");
                        winner = 1;

                    } else if (response == 2) {
                        System.out.println("Yaaayy!!! You win!!");
                        winner = 2;

                    } else {
                        System.out.println("Uuuummmm, we don't know what just happened. Try again!");
                        winner = 4;
                    }
                    break;

                case 5:
                    if (cpu == 3) {
                        System.out.println("Hahaha! The computer wins!");
                        winner = 1;

                    } else if (response == 3) {
                        System.out.println("Yaaayy!!! You win!!");
                        winner = 2;

                    } else {
                        System.out.println("Uuuummmm, we don't know what just happened. Try again!");
                        winner = 4;
                    }
                    break;
            }
        }

        return winner;
    }

    public int getCPUResponse() {
        // Generate random integers in range 1 to 3
        Random r = new Random();
        return r.nextInt(3) + 1;
    }

    public int startGame2() {

        Scanner scanner = new Scanner(System.in);
        int winner = -1;

        //start game
        System.out.println("~~~~~~~~~~Welcome to ROCK PAPER SCISSORS!!!~~~~~~~~~~");
        System.out.println("\nYou will be competing against our smartest computer!" +
                "\nIf there is a tie, you lose!" +
                "\nHere are your options." +
                "\n1. Rock" +
                "\n2. Paper" +
                "\n3. Scissors");

        int response = scanner.nextInt();
        int cpu = getCPUResponse();
        int answer;

        if (response == 1) {
            //If player chooses rock, print out computer response and check outcome
            Rock rock = new Rock(getCPUResponse());
            answer = rock.checkOutcome();
            System.out.println("Our computer chose " + rock.cpuAnswer);

        } else if (response == 2) {
            //If player chooses paper, print out computer response and check outcome
            Paper paper = new Paper(getCPUResponse());
            answer = paper.checkOutcome();
            System.out.println("Our computer chose " + paper.cpuAnswer);

        } else if (response == 3) {
            //If player chooses scissors, print out computer response and check outcome
            Scissors scissors = new Scissors(getCPUResponse());
            answer = scissors.checkOutcome();
            System.out.println("Our computer chose " + scissors.cpuAnswer);

        } else {
            System.out.println("Invalid response, please try again!");
            answer = -1;
        }

        //If the check response was 1, the player wins. If not, they lost.
        if (answer == 1) {
            System.out.println("Yaaayyy!! You won!");

        } else if (answer == 0) {
            System.out.println("Ouch! You lost!!");

        }

        return answer;
    }

    public boolean playAgain() {
        //Returns true if player decides to play again
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to play again? Y/N");
        char answer = scanner.next().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            return true;
        } else {
            return false;
        }

    }
}
