import java.util.Scanner;

// Calculate compound interest, compounded once per year.
// Sample input: 1000 10 2
// Sample output: Compound interest: 210.00
public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal, annual rate (%), and years: ");
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        double amount = principal * Math.pow(1 + rate / 100, time);
        double compoundInterest = amount - principal;
        System.out.printf("Compound interest: %.2f%n", compoundInterest);
        System.out.printf("Final amount: %.2f%n", amount);
    }
}