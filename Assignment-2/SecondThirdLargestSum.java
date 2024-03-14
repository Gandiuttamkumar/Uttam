Java
public class SecondThirdLargestSum {

  public static int findSecondThirdLargestSum(int[] values) {
    if (values.length < 3) {
      return -1; // Or throw an exception if desired
    }

    // Initialize variables to track largest values
    int firstLargest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    // Iterate through the array
    for (int value : values) {
      // Update firstLargest if a larger value is found
      if (value > firstLargest) {
        firstLargest = value;
      } else if (value > secondLargest && value != firstLargest) {
        // Update secondLargest if a value is larger than current but not the largest
        secondLargest = value;
      }
    }

    // Return sum of second and third largest (or -1 if no second largest)
    return secondLargest != Integer.MIN_VALUE ? firstLargest + secondLargest : -1;
  }

  public static void main(String[] args) {
    int[] values = {10, 51, 53, 39, 47, 44, 21};
    int sum = findSecondThirdLargestSum(values);

    if (sum != -1) {
      System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
    } else {
      System.out.println("Array has less than 3 elements.");
    }
  }
}
