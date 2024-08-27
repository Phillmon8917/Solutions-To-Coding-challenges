public class Fibonnacy {
    public static void main(String[] args) {
        // Initialize the first two numbers of the Fibonacci sequence
        int num1 = 0, num2 = 1, sum = 0;

        // Print the first two numbers of the Fibonacci sequence
        System.out.print(num1 + " " + num2);

        // Loop to calculate and print the next numbers in the Fibonacci sequence
        for (int i = 2; i < 10; i++) {
            // Calculate the next number in the sequence
            sum = num1 + num2;

            // Update num1 and num2 to the next numbers in the sequence
            num1 = num2;
            num2 = sum;

            // Print the calculated number
            System.out.print(" " + sum);
        }
    }
}
