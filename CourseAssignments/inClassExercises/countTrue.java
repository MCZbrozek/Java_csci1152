public class countTrue {
    public static void main(String[] args) {
        // Create a function that returns the number of true values in an array

        boolean arr1[] = new boolean[] { true, false, false, true, false };

        boolean arr2[] = new boolean[] { false, false, false, true, false };

        boolean arr3[] = new boolean[] {};

        int a1 = trueEval(arr1);
        int a2 = trueEval(arr2);
        int a3 = trueEval(arr3);

        System.out.println("There are" + a1 + "in arr1.");

        System.out.printf("There are %d in arr1\n", a1);
        System.out.printf("There are %d in arr2\n", a2);
        System.out.printf("There are %d in arr3\n", a3);
    }

    public static int trueEval(boolean[] arr) {
        int count = 0;
        // Write a loop to look at values
        for (int i = 0; i < arr.length; i++) {
            // Evaluate if true or false
            if (arr[i] == true) {
                count = count + 1;
            }
        }
        return count;
    }
}
