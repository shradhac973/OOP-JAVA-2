import java.util.Scanner;

// Compare two words lexicographically using relational operators on characters.
// Comparison is case-sensitive.
// Sample input: apple banana
// Sample output: apple comes before banana.
public class Question09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two words: ");
        String first = input.next();
        String second = input.next();
        int shorterLength = Math.min(first.length(), second.length());
        int order = 0;

        for (int index = 0; index < shorterLength && order == 0; index++) {
            char firstCharacter = first.charAt(index);
            char secondCharacter = second.charAt(index);
            if (firstCharacter < secondCharacter) {
                order = -1;
            } else if (firstCharacter > secondCharacter) {
                order = 1;
            }
        }

        if (order == 0) {
            if (first.length() < second.length()) {
                order = -1;
            } else if (first.length() > second.length()) {
                order = 1;
            }
        }

        if (order < 0) {
            System.out.println(first + " comes before " + second + ".");
        } else if (order > 0) {
            System.out.println(first + " comes after " + second + ".");
        } else {
            System.out.println("The words are equal.");
        }
    }
}