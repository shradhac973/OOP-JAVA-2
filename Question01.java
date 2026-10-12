import java.util.Scanner;

// Find a triangle's area using Heron's formula.
// Sample input: 3 4 5
// Sample output: Area: 6.00
public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three side lengths: ");
        double firstSide = input.nextDouble();
        double secondSide = input.nextDouble();
        double thirdSide = input.nextDouble();

        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0
                || firstSide + secondSide <= thirdSide
                || firstSide + thirdSide <= secondSide
                || secondSide + thirdSide <= firstSide) {
            System.out.println("These side lengths do not form a triangle.");
        } else {
            double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;
            double area = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide)
                    * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
            System.out.printf("Area: %.2f%n", area);
        }
    }
}