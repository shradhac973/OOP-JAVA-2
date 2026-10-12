package lab_sheet_2;

import java.util.Scanner;

// Check whether a year is a leap year and lies inside a given range.
// Sample input: 2024 2000 2030
// Sample output: The year is a leap year within the range.
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year, range start, and range end: ");
        int year = input.nextInt();
        int rangeStart = input.nextInt();
        int rangeEnd = input.nextInt();

        boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        boolean isInRange = year >= rangeStart && year <= rangeEnd;

        if (isLeapYear && isInRange) {
            System.out.println("The year is a leap year within the range.");
        } else {
            System.out.println("The year does not meet both conditions.");
        }
    }
}