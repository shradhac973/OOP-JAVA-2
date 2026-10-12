import java.util.Scanner;

// Count the set bits (1s) in the 32-bit representation of an integer.
// Sample input: 13
// Sample output: Number of set bits: 3
public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int remainingBits = number;
        int setBitCount = 0;

        while (remainingBits != 0) {
            setBitCount += remainingBits & 1;
            remainingBits >>>= 1;
        }

        System.out.println("Number of set bits: " + setBitCount);
    }
}