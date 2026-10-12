import java.util.Scanner;

// Rotate all 32 bits of an integer to the left by two positions.
// Sample input: 1
// Sample output: Rotated value: 4
public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int rotated = (number << 2) | (number >>> 30);
        System.out.println("Rotated value: " + rotated);
        System.out.println("Binary: " + Integer.toBinaryString(rotated));
    }
}