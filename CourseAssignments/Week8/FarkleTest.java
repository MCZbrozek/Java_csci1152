import java.security.SecureRandom;

public class FarkleTest {
    public static void main(String[] args) {

        // SecureRandom class
        SecureRandom rand = new SecureRandom();
        int[] test = { 0, 0, 0, 0, 0 };
        int[] roll = rollDice(test, rand);
        printRoll(roll);
    }

    public static int[] rollDice(int[] test, SecureRandom rand) {

        int max = 6;
        int min = 1;

        for (int i = 0; i < test.length; i++) {
            if (test[i] == 1 || test[i] == 5) {
                test[i] = test[i];
            } else {
                test[i] = rand.nextInt(max - min + 1) + min;

            }
            System.out.print(test[i] + " ");
        }
        System.out.println("");
        return test;
    }

    public static void printRoll(int[] roll) {
        // String[] marker = new String[5];
        int last = roll.length - 1;
        for (int i = roll.length - 1; i >= 0; i--) {
            System.out.print(roll[i] + " ");
            if (roll[i] == 1 || roll[i] == 5) {
                roll[last] = roll[i];
                last = last - 1;
            }
        }
    }
}