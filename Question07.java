import java.util.Scanner;

// Add the rainfall from seven days using the += assignment operator.
// Sample input: 1 2 3 4 5 6 7
// Sample output: Total rainfall: 28.0
public class Question07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalRainfall = 0;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall for day " + day + ": ");
            double dailyRainfall = input.nextDouble();
            totalRainfall += dailyRainfall;
        }

        System.out.println("Total rainfall: " + totalRainfall);
    }
}