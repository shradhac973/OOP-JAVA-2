import java.util.Scanner;

// Keep dividing a number by 2 with the /= assignment operator.
// Sample input: 20
// Sample output: Steps: 5
// Final value: 0.625
public class Question06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        int steps = 0;

        while (number >= 1) {
            number /= 2;
            steps++;
        }

        System.out.println("Steps: " + steps);
        System.out.println("Final value: " + number);
    }
}