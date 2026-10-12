import java.util.Scanner;

// Find the negative value of an integer using the unary minus operator.
// Sample input: 8
// Sample output: Negative value: -8
public class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int negativeValue = -number;
        System.out.println("Negative value: " + negativeValue);
    }
}