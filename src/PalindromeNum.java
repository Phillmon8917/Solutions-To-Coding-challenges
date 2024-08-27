//The program s about testing palindrome number

public class PalindromeNum {
    public static void main(String[] args) {
        // Array of integers to check for palindromes
        int[] nums = {165561, 53263, 567765, 6778, 899, 999, 987, 765, 989, 878, 765, 44, 336, 788, 535};

        // Iterate through each integer in the array
        for (int i = 0; i < nums.length; i++) {
            // Convert the integer to a string for palindrome checking
            String val = String.valueOf(nums[i]);
            String rev = ""; // Initialize an empty string to build the reversed string

            // Reverse the string representation of the integer
            for (int j = val.length() - 1; j >= 0; j--) {
                rev += val.charAt(j); // Append each character to the reversed string
            }

            // Check if the reversed string is equal to the original string
            if (val.equals(rev)) {
                System.out.println(nums[i] + " is a palindrome"); // Output if it's a palindrome
            } else {
                System.out.println(nums[i] + " is not a palindrome"); // Output if it's not a palindrome
            }
        }
    }
}
