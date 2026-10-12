import java.util.Scanner;

// Find the distance between two points in a 2D plane.
// Sample input: 1 2 4 6
// Sample output: Distance: 5.00
public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, and y2: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double xDifference = x2 - x1;
        double yDifference = y2 - y1;
        double distance = Math.sqrt(xDifference * xDifference + yDifference * yDifference);
        System.out.printf("Distance: %.2f%n", distance);
    }
}