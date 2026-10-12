import java.util.Random;

// Generate random numbers until one is divisible by both 7 and 13.
// Sample output (random, so your numbers will differ):
// 14
// 67
// 91
// Found 91, which is divisible by both 7 and 13.
public class Question29 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;

        while (true) {
            number = random.nextInt(100) + 1;
            System.out.println(number);

            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Found " + number + ", which is divisible by both 7 and 13.");
                break;
            }
        }
    }
}