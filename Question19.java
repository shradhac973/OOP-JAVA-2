// Print all Armstrong numbers from 1 to 1000 using for loops.
// Sample output: 1 2 3 4 5 6 7 8 9 153 370 371 407
public class Question19 {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            int digitCount = String.valueOf(number).length();
            int remaining = number;
            int sum = 0;

            while (remaining > 0) {
                int digit = remaining % 10;
                sum += (int) Math.pow(digit, digitCount);
                remaining /= 10;
            }

            if (sum == number) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}