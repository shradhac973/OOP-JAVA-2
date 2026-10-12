// Print the first 20 terms of the Fibonacci sequence using a for loop.
// Sample output:
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
public class Question18 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        for (int term = 1; term <= 20; term++) {
            System.out.print(first);
            if (term < 20) {
                System.out.print(" ");
            }

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}