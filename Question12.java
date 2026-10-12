import java.util.Scanner;

// Find the smallest of four integers using ternary operators.
// Sample input: 8 3 12 5
// Sample output: Smallest number: 3
public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four integers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int fourth = input.nextInt();

        int smallest = first < second
            ? (first < third
                ? (first < fourth ? first : fourth)
                : (third < fourth ? third : fourth))
            : (second < third
                ? (second < fourth ? second : fourth)
                : (third < fourth ? third : fourth));

        System.out.println("Smallest number: " + smallest);
    }
}