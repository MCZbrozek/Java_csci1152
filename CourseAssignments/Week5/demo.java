public class demo {

    public static void main(String[] args) {
        System.out.println("Yo!");
        displayStock(50, "apples");

    }

    // Takes a percent and an item an displays a visual representation of how much
    // of that item (as a percent) remains in stock.
    // Apples: 50% | ====== |
    // Oranges: 50% | ====== |
    // Durain: 15% | = |

    public static void displayStock(double percent, String item) {
        String bar = "";
        int p = (int) (percent * 100);
        for (int i = 0; i < p; i = i + 10) {
            bar = bar + "=";
        }
        System.out.printf("%-10s: %3d%%%n", item, percent);
    }
}
