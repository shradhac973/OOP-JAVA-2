import java.util.Scanner;

// Find the maximum and minimum array values using a for-each loop.
// Sample input: 5 8 -2 11 4 6
// (The first number is the array size.)
// Sample output: Minimum: -2, Maximum: 11
public class Question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] numbers = new int[size];
        System.out.print("Enter " + size + " integers: ");
        for (int index = 0; index < size; index++) {
            numbers[index] = input.nextInt();
        }

        int minimum = numbers[0];
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
            if (number > maximum) {
                maximum = number;
            }
        }

        System.out.println("Minimum: " + minimum + ", Maximum: " + maximum);
    }
}