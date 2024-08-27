import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Hello please enter the size of the array: ");
        int value = scanner.nextInt(); // Read the size of the array

        // Initialize the array with the specified size
        int[] array = new int[value];

        // Loop to read array elements from the user
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the elements of your array: ");
            array[i] = scanner.nextInt(); // Read each element and store it in the array
        }

        // Print the created array
        System.out.println("The array created is :");
        for (int j = 0; j < array.length; j++) {
            System.out.print(" " + array[j]); // Print each element of the array
        }

        // Close the scanner
        scanner.close();
    }
}
