import java.util.Scanner;

// Keep asking for a password until the correct password is entered.
// The password for this example is java123.
// Sample input: hello java123
// Sample output:
// Incorrect password. Try again.
// Correct password. Access granted.
public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctPassword = "java123";
        String enteredPassword;

        do {
            System.out.print("Enter the password: ");
            enteredPassword = input.next();
            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }
        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Correct password. Access granted.");
    }
}