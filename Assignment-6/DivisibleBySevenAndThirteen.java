public class DivisibleBySevenAndThirteen {

    public static void main(String[] args) {
        int number = 91; // Change this number to test different scenarios

        boolean divisibleBySeven = number % 7 == 0;
        boolean divisibleByThirteen = number % 13 == 0;

        if (divisibleBySeven && divisibleByThirteen) {
            int quotientBySeven = number / 7;
            int remainderBySeven = number % 7;
            int quotientByThirteen = number / 13;
            int remainderByThirteen = number % 13;
            System.out.println("The number is divisible by both 7 and 13.");
            System.out.println("Quotient when divided by 7: " + quotientBySeven);
            System.out.println("Remainder when divided by 7: " + remainderBySeven);
            System.out.println("Quotient when divided by 13: " + quotientByThirteen);
            System.out.println("Remainder when divided by 13: " + remainderByThirteen);
        } else {
            System.out.println("The number is not divisible by both 7 and 13.");
        }
    }
}
