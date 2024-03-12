public class FindMaxElement {
    
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 15, 7, 20, 3};

        int maxElement = findMax(numbers);
        
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}
