import java.util.Scanner;

// Check whether three angles can form a triangle.
// Sample input: 60 60 60
// Sample output: The angles form a valid triangle.
public class Question08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three angles in degrees: ");
        int firstAngle = input.nextInt();
        int secondAngle = input.nextInt();
        int thirdAngle = input.nextInt();

        if (firstAngle > 0 && secondAngle > 0 && thirdAngle > 0
                && firstAngle + secondAngle + thirdAngle == 180) {
            System.out.println("The angles form a valid triangle.");
        } else {
            System.out.println("The angles do not form a valid triangle.");
        }
    }
}