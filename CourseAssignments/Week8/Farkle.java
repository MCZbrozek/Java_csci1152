// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week8: Farkle
/* Purpose: Single player version of Farkle game
* Player rolls 5 dice.
* When user reaches 1000 pts, they win.
* --- Files associated with this assignment
* Gamehelper.java
 */

import java.security.SecureRandom;

public class Farkle {

    public static void main(String[] args) {

        // GameHelper Object
        Gamehelper userPrompt = new Gamehelper();

        // SecureRandom class
        SecureRandom rand = new SecureRandom();

        // Set Game variables
        int roundNumber = 0;
        int playerScore = 0;
        int[] roll = new int[5];
        int[] newDice = new int[roll.length];
        int[] prevDice = new int[roll.length];

        // While win != true
        Boolean win = false;
        while (win != true) {
            // Call method to reset the integer arrays to 0's
            roll = resetDice(roll);
            newDice = resetDice(newDice);
            prevDice = resetDice(prevDice);

            // count number of player rolls
            int rollNumber = 0;

            // Increment the number of the round "Round 1, 2 etc."
            roundNumber++;
            System.out.printf("\nBegin Round %d", roundNumber);

            // Inner while loop for each round of the game.
            String rollAgain = "y";
            while (rollAgain.equalsIgnoreCase("y")) {

                // will be used to evaluate if 1 or 5 is present at each roll
                Boolean rollValue = true;

                // roll all dice not showing 1 or 5 using random
                roll = rollDice(roll, rand);
                rollValue = oneOrFive(roll);
                rollNumber++;

                if (rollNumber > 1) {
                    prevDice = prevDice(roll, prevDice, newDice);
                    // after round 1, the prevDice[] is evaluated instead of the roll[]
                    // to determine if NEW 1's or 5's were rolled
                    rollValue = oneOrFive(prevDice);
                    // if NEW 1's or 5's were rolled
                    if (rollValue == true) {
                        newDice = newDice(roll, newDice, rollNumber);
                        prevDice = newDice;
                        // Ask user to roll again or keep points
                        String rollOrKeep = userPrompt.getUserString("\nKeep Rolling (y) or Keep your points(n)");
                        if (rollOrKeep.equalsIgnoreCase("y")) {
                            rollAgain = "y";
                        } else {
                            playerScore = playerScore(roll, playerScore);
                            System.out.printf("%nRound %d complete. Your current score is %d\n", roundNumber,
                                    playerScore);
                            rollAgain = "n";
                        }
                    } else {
                        System.out.printf("\nNo new points were scored, round %d ends with a loss\n", roundNumber);
                        System.out.printf("Round %d complete. Your current score is %d\n", roundNumber, playerScore);
                        rollAgain = "n";
                    }
                    // If this is the first roll of the round
                } else {
                    if (rollValue == true) {
                        newDice = newDice(roll, newDice, rollNumber);
                        prevDice = newDice;
                        // Ask user to roll again or keep points
                        String rollOrKeep = userPrompt.getUserString("\nKeep Rolling (y) or Keep your points(n)");
                        if (rollOrKeep.equalsIgnoreCase("y")) {
                            rollAgain = "y";
                        } else {
                            playerScore = playerScore(roll, playerScore);
                            System.out.printf("%nRound %d complete. Your current score is %d\n", roundNumber,
                                    playerScore);
                            rollAgain = "n";
                        }
                    } else {
                        System.out.printf("\nNo new points were scored, round %d ends with a loss\n", roundNumber);
                        System.out.printf("Round %d complete. Your current score is %d\n", roundNumber, playerScore);
                        rollAgain = "n";
                    }
                    // Evaluate if the player has enough points to win at the end of the round.
                    win = win(playerScore);
                    if (win) {
                        System.out.printf("\nGreat!! You scored %d points, and won the game!", playerScore);
                        String playAgain = userPrompt.getUserString("\nPlay again? (y/n)");
                        if (playAgain.equalsIgnoreCase("y")) {
                            playerScore = 0;
                            roundNumber = 0;
                            win = false;
                        }
                    }
                }
            }

        }
        System.out.println("Thank you for playing the FARKLE");

    }

    // &*&*& METHOD DEFINITIONS &*&*&

    // Method to reset the integer arrays to 0's
    public static int[] resetDice(int[] roll) {
        for (int i = 0; i < roll.length; i++) {
            roll[i] = 0;
        }
        return roll;
    }

    // Method to roll all dice not showing 1 or 5 using random and print to console
    public static int[] rollDice(int[] roll, SecureRandom rand) {
        String[] marker = new String[5];
        int max = 6;
        int min = 1;
        System.out.println("");
        for (int i = 0; i < roll.length; i++) {
            if (roll[i] == 1 || roll[i] == 5) {
                roll[i] = roll[i];
            } else {
                roll[i] = rand.nextInt(max - min + 1) + min;
                marker[i] = "i";
            }
            System.out.print(roll[i] + " ");
        }
        // Print marker point to show 1's and 5's
        System.out.println("");
        for (int i = 0; i < marker.length; i++) {
            if (roll[i] == 1 || roll[i] == 5) {
                marker[i] = "^";
            } else {
                marker[i] = " ";
            }
            System.out.print(marker[i] + " ");
        }
        return roll;
    }

    /*
     * This method keeps the 9's added by newDice() method, and also keeps 1's or
     * 5's from the previous roll to be evaluated by onesOrFives() method
     */
    public static int[] prevDice(int[] roll, int[] newDice, int[] prevDice) {
        for (int i = 0; i < newDice.length; i++) {
            if (newDice[i] == 9) {
                prevDice[i] = 9;
            } else if (newDice[i] != 9) {
                prevDice[i] = roll[i];
            }
        }
        return prevDice;
    }

    // This method updates the values from the roll, replacing 1's or 5s with 9
    // before the next roll starts
    public static int[] newDice(int[] roll, int[] newDice, int rollNumber) {
        for (int i = 0; i < roll.length; i++) {
            if (roll[i] == 1 || roll[i] == 5) {
                newDice[i] = 9;
            } else {
                newDice[i] = roll[i];
            }
        }
        return newDice;
    }

    // method to evaluate the roll for 1's or 5s
    public static boolean oneOrFive(int[] roll) {
        Boolean rollValue = false;
        for (int i = 0; i < roll.length; i++) {
            if (roll[i] == 1) {
                rollValue = true;
                break;
            } else if (roll[i] == 5) {
                rollValue = true;
                break;
            } else {
                rollValue = false;
            }
        }
        return rollValue;
    }

    // Method to tally the score at the end of each loop.
    public static int playerScore(int[] roll, int playerScore) {
        for (int i = 0; i < roll.length; i++) {
            if (roll[i] == 1) {
                playerScore = playerScore + 100;
            } else if (roll[i] == 5) {
                playerScore = playerScore + 50;
            }
        }
        return playerScore;
    }

    // Method to determine if player has won the game
    public static boolean win(int playerScore) {
        if (playerScore < 1000) {
            return false;
        } else {
            return true;
        }
    }

}
