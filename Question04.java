// Demonstrate prefix and postfix increment with a store visitor counter.
// Sample output:
// Visitors after prefix increment: 1
// Value returned by postfix increment: 1
// Visitors after postfix increment: 2
// Visitor count when one leaves: 2
// Visitors remaining: 1
public class Question04 {
    public static void main(String[] args) {
        int visitors = 0;

        System.out.println("Visitors after prefix increment: " + (++visitors));
        System.out.println("Value returned by postfix increment: " + (visitors++));
        System.out.println("Visitors after postfix increment: " + visitors);
        System.out.println("Visitor count when one leaves: " + (visitors--));
        System.out.println("Visitors remaining: " + visitors);
    }
}