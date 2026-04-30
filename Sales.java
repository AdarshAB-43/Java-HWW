import java.util.Scanner;
 class SalesTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5 days × 3 products
        int[][] sales = new int[5][3];

        // Input sales data
        System.out.println("Enter sales for 5 days (3 products each day):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Day " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Product " + (j + 1) + ": ");
                sales[i][j] = sc.nextInt();
            }
        }

        // Calculate total sales for each product
        int[] totalSales = new int[3];

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                totalSales[j] += sales[i][j];
            }
        }

        // Display results
        System.out.println("\nWeekly Sales Report:");

        for (int j = 0; j < 3; j++) {
            System.out.print("Product " + (j + 1) + " Total Sales: " + totalSales[j] + " -> ");

            if (totalSales[j] >= 500) {
                System.out.println("Target Achieved");
            } else if (totalSales[j] >= 300) {
                System.out.println("Average Performance");
            } else {
                System.out.println("Needs Improvement");
            }
        }

        sc.close();
    }
}