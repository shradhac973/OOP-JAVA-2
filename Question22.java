import java.util.Scanner;

// Reverse the digits of an integer using a while loop.
// Sample input: -204
// Sample output: Reversed number: -402
public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        long remaining = Math.abs((long) number);
        long reversed = 0;

        while (remaining > 0) {
            long digit = remaining % 10;
            reversed = reversed * 10 + digit;
            remaining /= 10;
        }

        if (number < 0) {
            reversed = -reversed;
        }
        System.out.println("Reversed number: " + reversed);
    }
}