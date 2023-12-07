// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week6: FishStore
// Purpose: Take fish information from user, recommend tank size
/* FileNames: "FishTankStore.java"
 * "Fish.java
 * TankHelper.java"
 */
public class FishTankStore {
    public static void main(String[] args) {
        // Inititialize prompt object from Tank Helper Class
        /*
         * From Book Headfirst Java
         * https://learning.oreilly.com/library/view/head-first-java/9781492091646/ch05.
         * html#the_gameapostrophes_mainleft_parenthesis
         */
        Tankhelper userPrompt = new Tankhelper();
        // A place to store our fish objects (a tank? haha)
        int counter = 0;
        Fish[] fishTank = new Fish[8];

        String do_another = "y";
        while (do_another.equals("y")) {
            // run a method that has a loop that sets value back to null
            refreshTank(fishTank);
            counter = 0;

            while (true) {
                // Get fish name
                String name = userPrompt.getUserString("What is the name of the fish or press 'Enter' when done");
                if (name.equals("")) {
                    break;
                } // end if
                  // Get fish length
                int length = userPrompt.getUserInt("What is the adult length of your fish in inches?");
                // Get fish quantity
                int quantity = userPrompt.getUserInt("How many of these fish will you have in this tank?");
                // Is this fish aggressive
                String aggressive = userPrompt.getUserString("Is this fish aggressive (y/n)?");
                Fish fish = new Fish();

                // Set fish attributes
                fish.setName(name);
                fish.setLength(length);
                fish.setQuantity(quantity);
                fish.setAggressive(aggressive);
                fishTank[counter] = fish;
                counter++;
            } // end while
            /*
             * when user exits first loop, run the
             * following methods to generate tank estimate
             */
            String isAggro = evalAggressive(fishTank, counter);
            int totalLength = totalLengthCalc(fishTank, counter);
            double gallons = tankSizeCalc(fishTank, totalLength, isAggro);
            String tankSize = evalTankSize(gallons);
            // Print Tank Estimate
            System.out.printf(
                    "\n\nTropical Fish Store Tank Requirements - \nAggressive: %5s\nTotal Fish Length: %4d\"\nGallons: %5.0f\nTank Size: %5s",
                    isAggro, totalLength, gallons, tankSize);
            do_another = userPrompt.getUserString("\n\nWould you like to calculate another tank? (y/n)");
        } // end while

    } // end main

    // -----Method Defintions ----
    // Method to loop through array if aggressive = true return value
    public static String evalAggressive(Fish[] fishTank, int counter) {
        String isAggro = "";
        for (int i = 0; i < counter; i++) {
            if (fishTank[i].aggressive == true) {
                isAggro = "Yes";
                break;
            } else {
                isAggro = "No";
            }
        }
        return isAggro;
    }

    // Method to loop through array and sum length * quantity return totalLength
    public static int totalLengthCalc(Fish[] fishTank, int counter) {
        int sumInches = 0;
        for (int i = 0; i < counter; i++) {
            sumInches = (fishTank[i].quantity * fishTank[i].length) + sumInches;
        } // end for
        return sumInches;
    }

    /*
     * Method to multiply totalLength * 2
     * if aggressive fish are present multiply by
     * 1.5 and return the gallons
     */
    public static double tankSizeCalc(Fish[] fishTank, int totalLength, String isAgro) {
        double gallons = 0;
        // if aggressive = true multiply by 1.5
        if (isAgro.equalsIgnoreCase("yes")) {
            gallons = (totalLength * 2) * 1.5;
        } else {
            // Sum variable inches and multiply times 2
            gallons = totalLength * 2;
        }

        // return tank volume
        return gallons;
    } // end tankSizeCalc

    /*
     * Method to evaluate gallons and return a string
     * constructor for tank size
     * recomendation.
     */
    public static String evalTankSize(double gallons) {
        // if gallons > 80 recommend custom tank
        String tankSize = "";
        if (gallons > 80) {
            tankSize = "hire a contractor to build a custom tank.";
            return tankSize;
        }
        // if gallons > 60 && <= 80 recommend 80 gal
        if (gallons > 60 && gallons <= 80) {
            tankSize = "80 gallon tank";
            return tankSize;
        }
        // if gallons > 40 && <= 60 recommend 60 gal
        if (gallons > 40 && gallons <= 60) {
            tankSize = "60 gallon tank";
            return tankSize;
        }
        // if gallons > 20 && <= 40 recommend 40 gal
        if (gallons > 20 && gallons <= 40) {
            tankSize = "40 gallon tank";
            return tankSize;
        }
        // else recommend 20 gal
        else {
            tankSize = "20 gallon tank";
            return tankSize;
        }

    }

    public static void refreshTank(Fish[] fishTank) {
        for (int i = 0; i < fishTank.length; i++) {
            fishTank[i] = null;
        }
    }
}
