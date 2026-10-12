import java.util.Scanner;

// Display all positive factors of a number using a do-while loop.
// Sample input: 12
// Sample output: Factors: 1 2 3 4 6 12
public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("Factors: ");
        int possibleFactor = 1;
        do {
            if (number % possibleFactor == 0) {
                System.out.print(possibleFactor + " ");
            }
            possibleFactor++;
        } while (possibleFactor <= number);
        System.out.println();
    }
}