import java.security.SecureRandom;

public class badSort {
    public static void main(String[] args) {

        double toSort[] = { 4.6, 8, 6, 9, 4, 3, 2, 1, 2, 3, 4, 3.3, 4.44, 3.33 };
        System.out.println("Original Array!");
        for (double d : toSort) {
            System.out.print(d + ", ");
        }
        // Run badSort Method and store output in variable called sorted
        double sorted[] = badSorter(toSort);

        // Print sorted (we have to loop through each position in the array and print
        // that number.)
        System.out.println("\nSorted array");
        for (double d : sorted) {
            System.out.print(d + ", ");
        }
    }

    public static double[] badSorter(double toSort[]) {
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i <= 1000; i++) {
            int rand_int1 = rand.nextInt(toSort.length);
            int rand_int2 = rand.nextInt(toSort.length);

            if (toSort[rand_int1] > toSort[rand_int2]) {
                double storage = toSort[rand_int1];
                toSort[rand_int1] = toSort[rand_int2];
                toSort[rand_int2] = storage;
            }
        }
        return toSort;

    }
}
