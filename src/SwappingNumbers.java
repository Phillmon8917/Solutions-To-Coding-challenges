public class SwappingNumbers {
    public static void main(String[] args){
        // Initialize two integers a and b, and display their values before swapping.
        int a = 10, b = 2;
        System.out.println("Before swapping: ");
        System.out.println("a is " + a + " and b is " + b);

        // Swap the values of a and b without using a third variable.
        a = a + b;
        b = a - b;
        a = a - b;

        // Display the values of a and b after swapping.
        System.out.println("The numbers after swapping them:");
        System.out.println("a is " + a + " and b is " + b);
    }
}
