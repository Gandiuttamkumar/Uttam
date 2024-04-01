import java.util.Scanner;

public class QuantityDiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get quantity and price per item
        System.out.print("Enter the quantity of items purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the price per item (in rupees): ");
        double pricePerItem = scanner.nextDouble();

        // Calculate total price before discount
        double totalPrice = quantity * pricePerItem;

        // Apply discount based on quantity
        double discount = 0.0;
        if (quantity > 50) {
            discount = totalPrice * 0.1;  // 10% discount
        } else if (quantity >= 25) {
            discount = totalPrice * 0.05;  // 5% discount
        }

        // Calculate final price after discount
        double finalPrice = totalPrice - discount;

        // Display results
        System.out.println("Total price before discount: Rs. " + totalPrice);
        if (discount > 0) {
            System.out.println("Discount applied: Rs. " + discount);
        }
        System.out.println("Total expense: Rs. " + finalPrice);

        scanner.close();
    }
}
