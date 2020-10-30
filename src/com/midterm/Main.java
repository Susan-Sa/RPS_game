package com.midterm;

public class Main {

    public static void main(String[] args) {
        Game RPS = new Game();
        boolean newGame = true;

        //Game loop
        while (newGame == true) {
            /** Choose which game method you would like to use, and comment out the other.
             * They both do the same thing, using different methods of logic.
             */

            /**RPS method [Doesn't use Rock, Paper, and Scissors classes]*/
            //RPS.startGame();

            /**RPS method [Uses Rock, Paper, and Scissors classes]*/
            //RPS.startGame2();

            //Check if new game
            newGame = RPS.playAgain();
        }
    }
}
