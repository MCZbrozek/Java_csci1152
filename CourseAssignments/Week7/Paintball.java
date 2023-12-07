
// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week7: Paintball
/* Purpose: Read in text file as 2d array
* As user to shoot "Paint" at cluster of 1's on the target
* When user hits all the ones in the target, they win.
* --- Files associated with this assignment
* Gamehelper.java
* target.txt
* target2.txt
 */
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Paintball {
    public static void main(String[] args) {

        // Read in text file and display as 2d array.
        // path =
        // "C:\\Users\\mczbr\\Java_csci1152\\CourseAssignments\\Week7\\target.txt"
        Path path = Paths.get("target2.txt");

        // Scanner
        Scanner fileIn = null;
        // Empty array variable
        int[][] target = null;
        // Count Ones in target
        int onesInTarget = 0;

        try {
            fileIn = new Scanner(path);

            // Initialize 2d array with row and column length
            int rows = fileIn.nextInt();
            int cols = fileIn.nextInt();
            target = new int[rows][cols];

            populateTargetArray(fileIn, target);

            // This block used to check against user score.
            onesInTarget = onesInTarget(target, rows, cols);

        } catch (java.io.IOException e) {
            System.out.println("Input Output Exception");
            System.exit(2);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input did not match");
            System.exit(3);
        }
        fileIn.close(); // Close file scanner

        // +++ GAME PLAY OCCURS HERE +++

        // new userPrompt object to handle user responses
        // class defined in Gamehelper.java
        Gamehelper userPrompt = new Gamehelper();

        // Outside While loop for each game
        String playAgain = "y";
        while (playAgain.equalsIgnoreCase("y")) {
            printTargetArray(target);

            int userScore = 0;
            // inside while loop for each user guess
            Boolean win = false;
            while (!win) {
                // get user coordinates
                int[] userGuess = userCoordinates(userPrompt);
                int row = userGuess[0] - 1;
                int col = userGuess[1] - 1;

                // evaluate hit/miss and tally score
                userScore = scoreTally(target, row, col, userScore);

                // update the target with user "paint"
                target = updateTarget(target, row, col);
                printTargetArray(target);

                // Show user their score
                System.out.println("You have hit " + userScore + " of " + onesInTarget + " targets!");

                // Check to see if user has hit all targets
                win = winnerWinner(onesInTarget, userScore);
                if (win) {
                    System.out.println("You got all of the targets! ");
                }
            } // end while loop

            // ask if user wants to play again.
            playAgain = userPrompt.getUserString("Play again? (y/n) ");
        }

    }

    // -$-$- METHOD DEFINITIONS -$-$-

    // Method to populate the array from the text file
    public static int[][] populateTargetArray(Scanner fileIn, int[][] target) {
        for (int row = 0; row < target.length; row++) {
            for (int col = 0; col < target[row].length; col++) {
                target[row][col] = fileIn.nextInt();
            }
        }

        return target;
    }

    // Method to print the array.
    public static void printTargetArray(int[][] target) {
        for (int row = 0; row < target.length; row++) {
            for (int col = 0; col < target[row].length; col++) {
                System.out.printf("%-2d", target[row][col]);
            }
            System.out.printf("\n");
        }
    }

    // Method to get row and column information from the user.
    // Ouputs an array named userGuess
    public static int[] userCoordinates(Gamehelper userPrompt) {
        // Get target location data from user
        int[] userGuess = new int[2];
        int userRow = userPrompt.getUserInt("Enter Row number ");
        int userColumn = userPrompt.getUserInt("Enter Column number");
        userGuess[0] = userRow;
        userGuess[1] = userColumn;
        return userGuess;

    }

    // Method to validate userGuess to avoid "Out of bounds" exception
    public static boolean checkValid(int[][] target, int row, int col) {
        if (row < 0)
            return false;
        else if (col < 0)
            return false;
        else if (row > target.length - 1)
            return false;
        else if (col > target.length - 1)
            return false;
        else
            return true;
    }

    // Method to see how many 1's are on the target
    public static int onesInTarget(int[][] target, int row, int col) {
        int onesInTarget = 0;
        for (int irow = 0; irow < target.length; irow++) {
            for (int icol = 0; icol < target[0].length; icol++) {
                if (target[irow][icol] == 1) {
                    // System.out.println("Found a one: " + target[irow][icol]);
                    onesInTarget = onesInTarget + 1;
                }
                // This block used for testing
                // else {
                // // System.out.println(" no 1's @ " + irow + icol);
                // }
            }
        }
        return onesInTarget;
    }

    // Method to evaluate user guess and tally the score.
    public static int scoreTally(int[][] target, int row, int col, int userScore) {
        if (checkValid(target, row, col) && (target[row][col] == 1))
            userScore++;
        if (checkValid(target, row - 1, col) && (target[row - 1][col] == 1))
            userScore++;
        if (checkValid(target, row + 1, col) && (target[row + 1][col] == 1))
            userScore++;
        if (checkValid(target, row, col - 1) && (target[row][col - 1] == 1))
            userScore++;
        if (checkValid(target, row, col + 1) && (target[row][col + 1] == 1))
            userScore++;

        return userScore;
    }

    // Method runs "checkValid" method if true, update the array
    public static int[][] updateTarget(int[][] target, int row, int col) {
        if (checkValid(target, row, col))
            target[row][col] = 5;
        if (checkValid(target, row - 1, col))
            target[row - 1][col] = 5;
        if (checkValid(target, row + 1, col))
            target[row + 1][col] = 5;
        if (checkValid(target, row, col - 1))
            target[row][col - 1] = 5;
        if (checkValid(target, row, col + 1))
            target[row][col + 1] = 5;

        return target;
    }

    // Method to check userScore vs onesInTarget and return true or false.
    public static boolean winnerWinner(int onesInTarget, int userScore) {
        if (userScore == onesInTarget) {
            return true;
        } else {
            return false;
        }

    }

}