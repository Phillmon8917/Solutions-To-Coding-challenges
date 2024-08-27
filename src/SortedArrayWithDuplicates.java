public class SortedArrayWithDuplicates {

    public static void main(String[] args) {
        // Initialize an array with duplicate elements
        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 10};

        // 'j' will be used as a pointer to keep track of unique elements in the array
        int j = 0;

        // Loop through the array to identify unique elements
        for (int i = 0; i < array.length - 1; i++) {
            // If the current element is different from the next element, it's unique
            if (array[i] != array[i + 1]) {
                // Store the unique element at the 'j' position and increment 'j'
                array[j] = array[i];
                j++;
            }
        }

        // Add the last element to the array as it is unique by default
        array[j++] = array[array.length - 1];

        // Print the unique elements of the array
        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
