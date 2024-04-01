import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of days late
        System.out.print("Enter the number of days the book is late: ");
        int daysLate = scanner.nextInt();

        // Calculate and display fine or message
        if (daysLate <= 0) {
            System.out.println("No fine for books returned on or before due date.");
        } else if (daysLate <= 7) {
            double fine = daysLate * 0.5; // 50 paise per day
            System.out.println(f"Fine for {daysLate} days late: Rs. {fine:.2f}");
        } else if (daysLate <= 14) {
            System.out.println(f"Fine for {daysLate} days late: Rs. 1.00");
        } else if (daysLate <= 21) {
            System.out.println(f"Fine for {daysLate} days late: Rs. 5.00");
        } else {
            System.out.println(f"Membership cancelled for {daysLate} days late.");
        }

        scanner.close();
    }
}
