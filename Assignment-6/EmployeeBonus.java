import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get current year and year joined
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter the year the employee joined: ");
        int yearJoined = scanner.nextInt();

        // Calculate years of service
        int yearsOfService = currentYear - yearJoined;

        // Determine bonus based on years of service
        if (yearsOfService > 5) {
            System.out.println("Employee is awarded a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("Employee is awarded a bonus of Rs. 3000/-");
        } else {
            System.out.println("Employee is not awarded any bonus.");
        }

        scanner.close();
    }
}
