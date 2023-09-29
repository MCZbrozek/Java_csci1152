// This is just some test code to make sure I get answers right on the test
public class testCode {
    public static void main(String[] args) {
        int x = 9;
        int y = 8;

        System.out.print(x != y);
        System.out.println(x <= y && x != y);

        int x1 = 5;
        if (x1 > 3) {
            System.out.println("x is greater than 3.");
        } else {
            System.out.println("x is not greater than 3.");
        }

        int height = 48;
        boolean safe = true;
        if (height < 54) {
            safe = false;
        }
        System.out.println("Is it safe to ride this rollercoaster? " + safe);

        for (int i = 0; i <= 3; i++) {
            String x2 = "-";
            System.out.print(x2);
        }
    }

}
