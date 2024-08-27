public class PrimeNumbers {

    public static void main(String[] args) {
        // Loop through numbers from 0 to 14
        for (int i = 0; i < 15; i++) {
            // Initialize a counter to track the number of divisors
            int count = 0;

            // Only check for prime numbers greater than 1
            if (i > 1) {
                // Check how many numbers can divide 'i' evenly
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }

                // If 'i' has exactly 2 divisors (1 and itself), it's a prime number
                if (count == 2) {
                    System.out.println(i + " is a prime number");
                }
            }
        }
    }
}
