import java.util.Scanner; // Import the Scanner class

public class Gamehelper {
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
