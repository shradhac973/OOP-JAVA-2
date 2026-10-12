import java.util.Scanner;

// Check for a power of 4, toggle bit 3, and demonstrate continue and break.
// The table is for the original number, from 1 to 20.
// Sample input: 4
// Sample output:
// Is a power of 4: true
// Value after toggling bit 3: 0
// 4 x 1 = 4
// 4 x 2 = 8
// 4 x 4 = 16
// 4 x 5 = 20
// 4 x 7 = 28
// 4 x 8 = 32
// 4 x 10 = 40
// 4 x 11 = 44
// Reached a multiple of 48; stopping.
public class Question30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int shiftedNumber = number;
        while (shiftedNumber > 1 && (shiftedNumber & 3) == 0) {
            shiftedNumber >>= 2;
        }
        boolean isPowerOfFour = number > 0 && shiftedNumber == 1;
        System.out.println("Is a power of 4: " + isPowerOfFour);

        int toggledNumber = number ^ (1 << 2);
        System.out.println("Value after toggling bit 3: " + toggledNumber);

        for (int multiplier = 1; multiplier <= 20; multiplier++) {
            long product = (long) number * multiplier;
            if (product % 48 == 0) {
                System.out.println("Reached a multiple of 48; stopping.");
                break;
            }
            if (product % 6 == 0) {
                continue;
            }
            System.out.println(number + " x " + multiplier + " = " + product);
        }
    }
}