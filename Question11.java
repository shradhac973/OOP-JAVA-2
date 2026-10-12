import java.util.Scanner;

// A student passes with theory >= 40 and practical >= 50, or overall >= 50.
// Enter theory and practical percentages; overall is their average.
// Sample input: 80 20
// Sample output: Overall: 50.0%
// Result: Pass
public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter theory and practical percentages: ");
        double theory = input.nextDouble();
        double practical = input.nextDouble();
        double overall = (theory + practical) / 2;

        System.out.println("Overall: " + overall + "%");
        if ((theory >= 40 && practical >= 50) || overall >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}