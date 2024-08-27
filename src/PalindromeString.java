
public class PalindromeString {
    public static void main(String[] args) {

        // Array of strings to check if they are palindrome
        String[] array = {"kook", "cow", "kick", "wow", "lab", "non"};

        // Iterate through each string in the array
        for (int i = 0; i < array.length; i++) {
            String temp = array[i];  // Store the current string in a temporary variable
            String reverse = "";     // Initialize an empty string to store the reversed string

            // Reverse the string by iterating from the end to the beginning
            for (int j = temp.length() - 1; j >= 0; j--) {
                reverse += temp.charAt(j);  // Add each character to the reverse string
            }

            // Check if the reversed string is equal to the original string
            if (reverse.equals(temp)) {
                System.out.println(temp + " is a palindrome word");  // If true, it's a palindrome
            } else {
                System.out.println(temp + " is not a palindrome word");  // If false, it's not a palindrome
            }
        }
    }
}
