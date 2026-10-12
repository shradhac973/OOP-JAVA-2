import java.util.Scanner;

// Classify a character using nested ternary operators.
// Sample input: e
// Sample output: Vowel
public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one character: ");
        char character = input.next().charAt(0);
        char lowerCaseCharacter = Character.toLowerCase(character);

        String kind = Character.isLetter(character)
                ? ("aeiou".indexOf(lowerCaseCharacter) >= 0 ? "Vowel" : "Consonant")
                : (Character.isDigit(character) ? "Digit" : "Special symbol");

        System.out.println(kind);
    }
}