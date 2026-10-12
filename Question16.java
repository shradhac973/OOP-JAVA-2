import java.util.Scanner;

// Multiply and divide an integer by 2^shift using shift operators.
// Use a non-negative integer and a shift amount from 0 to 30.
// Sample input: 12 2
// Sample output: After multiplication: 48
// After division: 3
public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer and shift amount (0-30): ");
        int number = input.nextInt();
        int shiftAmount = input.nextInt();

        if (number < 0 || shiftAmount < 0 || shiftAmount > 30) {
            System.out.println("Use a non-negative number and a shift amount from 0 to 30.");
        } else {
            int multiplied = number << shiftAmount;
            int divided = number >> shiftAmount;
            System.out.println("After multiplication: " + multiplied);
            System.out.println("After division: " + divided);
        }
    }
}