// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week6: FishStore
// Purpose: Take fish information from user, recommend tank size
/* FileNames: "FishTankStore.java"
 * "Fish.java
 * TankHelper.java"
 */

import java.util.Scanner; // Import the Scanner class

public class Tankhelper {
    public int getUserInt(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String getUserString(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
