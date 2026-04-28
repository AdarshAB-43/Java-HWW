import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter username code (A/S/G): ");
        char username = sc.next().charAt(0);

        System.out.print("Enter password (integer): ");
        int password = sc.nextInt();

        System.out.print("Enter role ID (1-Admin, 2-Student, 3-Guest): ");
        int roleId = sc.nextInt();

        // Check credentials
        if (username == 'A' && password == 1234 && roleId == 1) {
            System.out.println("Welcome Admin. Full access granted.");
        }
        else if (username == 'S' && password == 1111 && roleId == 2) {
            System.out.println("Welcome Student. Limited access granted.");
        }
        else if (roleId == 3) {
            System.out.println("Welcome Guest. View-only access.");
        }
        else {
            System.out.println("Invalid credentials or role.");
        }

        // Close scanner
        sc.close();
    }
}