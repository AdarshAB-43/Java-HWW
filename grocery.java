import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class GroceryStore {

    static double calculateTotal(int[] quantities, int[] prices) {
        int total = 0;

        for (int i = 0; i < quantities.length; i++) {
            total += quantities[i] * prices[i];
        }

        if (total > 500) {
            System.out.println("10% Discount Applied!");
            total = total - (total * 10 / 100);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
        int[] prices = {50, 40, 100, 25, 30};
        int[] quantities = new int[items.length];

        System.out.println("---- Grocery Store ----");

        for (int i = 0; i < items.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter quantity for " + items[i] + ": ");
                    quantities[i] = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next(); // clear wrong input
                }
            }
        }

        double finalAmount = calculateTotal(quantities, prices);

        System.out.println("\nTotal Amount to Pay: Rs." + finalAmount);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Purchase Time: " + now.format(format));

        sc.close();
    }
}