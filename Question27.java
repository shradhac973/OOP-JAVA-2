import java.util.Scanner;

// Print the meaning of a grade using switch-case.
// Sample input: B
// Sample output: Good
public class Question27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grade (A-F): ");
        char grade = Character.toUpperCase(input.next().charAt(0));

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}