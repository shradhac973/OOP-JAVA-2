import java.util.Scanner;

// Swap two integers using XOR without a temporary variable.
// Sample input: 5 9
// Sample output: After swapping: 9 5
public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swapping: " + first + " " + second);
    }
}