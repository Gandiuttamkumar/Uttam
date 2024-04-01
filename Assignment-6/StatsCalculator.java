import java.util.Scanner;

public class StatsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int number, count = 0;
        double sum = 0.0;
        boolean isFirstNumber = true;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        // Get numbers until user quits
        do {
            System.out.print("Enter a number (or 0 to quit): ");
            number = scanner.nextInt();

            // Check for valid input (non-zero to quit)
            if (number == 0) {
                break;
            }

            // Update stats for the first number entered
            if (isFirstNumber) {
                min = number;
                max = number;
                isFirstNumber = false;
            }

            // Update min and max
            min = Math.min(min, number);
            max = Math.max(max, number);

            // Update sum for average calculation
            sum += number;
            count++;

        } while (true);

        // Check if any numbers were entered
        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            // Calculate and display average
            double average = sum / count;
            System.out.println("The largest number entered is: " + max);
            System.out.println("The smallest number entered is: " + min);
            System.out.println("The average of all numbers entered is: " + average);
        }

        scanner.close();
    }
}
