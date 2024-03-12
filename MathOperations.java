public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }


    public double add(double a, double b, double c) {
        return a + b + c;
    }

 
    public String add(String a, String b) {
        return a + b;
    }


    public static void main(String[] args) {
        MathOperations math = new MathOperations();

  
        int sumIntegers = math.add(10, 20);
        System.out.println("Sum of integers: " + sumIntegers);

        double sumDoubles = math.add(10.5, 20.7, 30.9);
        System.out.println("Sum of doubles: " + sumDoubles);

        
        String concatenatedString = math.add("Hello, ", "world!");
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
