public class SortArrayAscending {
    public static void main(String[] args) {
        // Initialize an integer array and print its elements before sorting.
        int[] array = {10, 23, 23, 45, 65, 23, 10, 15, 15, 10, 2, 45, 23};

        System.out.println("The unsorted array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        // Sort the array in ascending order using a nested loop and print the sorted array.
        System.out.println("The sorted array is: ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}
