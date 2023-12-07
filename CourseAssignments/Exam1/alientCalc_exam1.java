
// Import Scanner
import java.util.Scanner;
// Import math
import java.lang.Math;

public class alientCalc_exam1 {

    public static void main(String[] args) {
        // Initialize scanner
        Scanner input = new Scanner(System.in);
        // Intro
        System.out.print(
                "Welcome, earthling!\nAllow me to reveal the mysteries of universe in 4 simple calculations...\n ");
        alienCalculator(input);
        while (true) {
            System.out.println("\nFor more wisdom and calculations type 'y' otherwise type 'n'");
            String userInput = input.next();
            if (userInput.equalsIgnoreCase("Y"))
                alienCalculator(input);
            else if (userInput.equalsIgnoreCase("N")) {
                System.out.print("What's the matter, can't handle the knowledge?");
                break;
            } else {
                System.out.print("Try Again With (Y/N) only !");
            }

        }

        // close
    }

    // method: alienCalculator
    public static void alienCalculator(Scanner input) {
        // Initialize varible for Scanner
        // Scanner input = new Scanner(System.in);
        // Array of calucation names
        String[] calculationNames = { "blish", "glern", "awawz", "Canopnr'74" };

        // Ask the user which operation they want to perform
        System.out.println("The calculations are:\n 1.\"blish\"\n 2.\"glern\"\n 3.\"awawz\"\n 4.\"Canopnr'74\"\n");
        System.out.println("Type the number corresponding to the calculation you wish to perform: ");
        int userSelection = input.nextInt() - 1;
        // evaluate which method to perform
        if (calculationNames[userSelection].equals("blish")) {
            blish(input);
        } else if (calculationNames[userSelection].equals("glern")) {
            glern(input);
        } else if (calculationNames[userSelection].equals("awawz")) {
            awawz(input);
        } else {
            canopnr74(input);
        }
        // input.close();
    }

    // method: blish.
    public static void blish(Scanner input) {
        // Scanner blishInput = new Scanner(System.in);
        System.out.println(
                "The sacred \"Blish\" method takes an integer and gives you a more complex number with lots of decimals");
        System.out.print("Give me an integer: ");
        int blishVar = input.nextInt();
        double blishVar2 = Double.valueOf(blishVar);
        double blishResult = Math.sqrt(blishVar2 * Math.PI);
        System.out.println("Behold the decimals: " + blishResult);
        // input.close();
    }

    // method: glern.
    public static void glern(Scanner input) {
        // Scanner var
        // Scanner userInput = new Scanner(System.in);
        // initialize variable zero
        int zero = "zero".length();
        // Tell the user how this works -
        System.out.println(
                "The sacred \"Glern\" method allows you to divide by zero, magically - ");
        // Get an Int from the user
        System.out.println("Give me an interger to divide by zero: ");
        // Assign the int to a variable
        int glernVar = input.nextInt();
        // Protect against zero numerator
        while (glernVar == 0) {
            if (glernVar == 0) {
                System.out.println("Zero by Zero? Boring! Give me another number: ");
                glernVar = input.nextInt();
            } else {
                break;
            }
        }
        // Tell the user what calc we are performing
        System.out.printf("Glern\ncacluating %d divided by z-e-r-o\nGlern\n", glernVar);
        // Perform Calc
        int glernResult = glernVar / zero;
        // Print result for user
        System.out.printf("The number %d divided by z-e-r-o is %d\n", glernVar, glernResult);
        // Close scanner
        // input.close();
    }

    // method: awawz.
    public static void awawz(Scanner input) {
        // Scanner var
        // Scanner userInput = new Scanner(System.in);
        // Tell the user how this works -
        System.out.println(
                "The sacred \"awawz\" method allows you predict what time lunch should be from two POSITIVE inputs - ");
        // Get double1 from the user
        System.out.println("Give me the first number to calculate: ");
        double double1 = input.nextDouble();
        // Avoid accepting a value of zero
        while (double1 <= 0) {
            System.out.print("\nGive me a POSITIVE number: ");
            double1 = input.nextDouble();
        }
        // Get double2 from the user
        System.out.println("Give me the second number to calculate: ");
        double double2 = input.nextDouble();
        // Avoid accepting a value of zero
        while (double2 <= 0) {
            System.out.print("\nGive me a POSITIVE number: ");
            double2 = input.nextDouble();
        }
        // Tell the user what calc we are performing
        System.out.printf("Awawz\nI'm hungry, the square root %f ... \nAwawz\n", double1);
        System.out.printf("\nI'm hungry ... carry the 2 ... \nAwawz\n");
        // Perform Calc
        double awawzResult = (Math.sqrt(Math.abs(double1)) * double2) / (double2 - 7);
        int awazInt = (int) awawzResult;
        // Print result for user
        System.out.printf("\nLooks like you should have lunch at %d O\'Clock\n", awazInt);
        // Close scanner
        // userInput.close();
    }

    // method: canopnr'74.
    public static void canopnr74(Scanner input) {
        // array of operators to print
        String[] operators = { "times", "plus", "divided by", "squared", "cos", "tan", "minus",
                "the absolute value of" };
        // Tell the user how this works -
        System.out.println(
                "The sacred \"canopnr74\" method allows you to always get the perfect result... 74");
        // Get double1 from the user
        System.out.println("Give me the first number to calculate: ");
        double double1 = input.nextDouble();
        // Get double2 from the user
        System.out.println("Give me the second number to calculate: ");
        double double2 = input.nextDouble();
        // get 3 random operators from array
        int min = 0;
        int max = operators.length - 1;
        // generate secret number(rand decimal * 100, rounded down with .floor)
        int randomOp1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int randomOp2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        // System.out.printf("The value of randOp1 is %d. The value of randomOp2 is %d",
        // randomOp1, randomOp2);
        // Tell the user what calc we are performing
        System.out.printf("\nCanopnr\n%f %s + %f %s - e^x \nCanopnr\n ", double1, operators[randomOp1], double2,
                operators[randomOp2]);
        // Perform Calc
        int canopnrResult = 74;
        // Print result for user
        System.out.printf("Equals %d, just like I said it would\n", canopnrResult);
        // Close scanner
        // userInput.close();
    }

}
