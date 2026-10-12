// Print numbers from 1 to 50, skipping perfect squares with continue.
// Sample output:
// 2 3 5 6 7 8 10 11 12 13 14 15 17 18 19 20 21 22 23 24 26 27 28 29 30 31 32 33 34 35 37 38 39 40 41 42 43 44 45 46 47 48 50
public class Question28 {
    public static void main(String[] args) {
        for (int number = 1; number <= 50; number++) {
            boolean isPerfectSquare = false;
            for (int root = 1; root * root <= number; root++) {
                if (root * root == number) {
                    isPerfectSquare = true;
                    break;
                }
            }

            if (isPerfectSquare) {
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
}