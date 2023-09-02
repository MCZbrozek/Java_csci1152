// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week1: Variables Exercise
// Purpose: Apply differing variable types 
// FileName: "Exercise.java"

public class Exercise {
    public static void main(String[] args) {
        int x = 34;
        int y = 45;
        int product = x * y;

        System.out.println("Product = " + product);

        int landSpeed;
        landSpeed = x + y;
        System.out.println("Sum = " + landSpeed);

        float decimalValue = 99.3f;
        float weight = 33.21f;

        double difference = decimalValue - weight;
        System.out.println("Diff = " + difference);

        double result = product / difference;
        System.out.println("Result = " + result);

        char letter = 'x';
        System.out.println("The value of letter is " + letter);

        System.out.println("<<--- --- --- \\\\\\ -o- /// --- --- --->>");

        System.out.println(
                "#     #   #####   ####### \n##   ##  #     #       # \n# # # #  #            #  \n#  #  #  #           #   \n#     #  #          #    \n#     #  #     #   #    \n#     #   #####   ####### ");

    }

}
