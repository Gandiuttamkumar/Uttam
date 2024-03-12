public class ArraySortingAndOccurrences {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static int findOccurrences(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 5, 8, 2, 5, 1, 5};
        int numberToFind = 5;
        System.out.print("Before sorting: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        bubbleSort(numbers);


        int occurrences = findOccurrences(numbers, numberToFind);

        System.out.print("Sorted array: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        System.out.println("Number of occurrences of " + numberToFind + " is: " + occurrences);
    }
}
