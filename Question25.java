import java.util.Scanner;

// Calculate the average of student marks stored in a 2D array using for-each loops.
// Sample input: 2 3 80 90 70 60 75 85
// (Two students, three marks per student, followed by the marks.)
// Sample output: Average marks: 76.67
public class Question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students and marks per student: ");
        int studentCount = input.nextInt();
        int marksPerStudent = input.nextInt();

        if (studentCount <= 0 || marksPerStudent <= 0) {
            System.out.println("Both counts must be positive.");
            return;
        }

        int[][] marks = new int[studentCount][marksPerStudent];
        for (int student = 0; student < studentCount; student++) {
            System.out.print("Enter marks for student " + (student + 1) + ": ");
            for (int subject = 0; subject < marksPerStudent; subject++) {
                marks[student][subject] = input.nextInt();
            }
        }

        int totalMarks = 0;
        int totalCount = 0;
        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                totalMarks += mark;
                totalCount++;
            }
        }

        double average = (double) totalMarks / totalCount;
        System.out.printf("Average marks: %.2f%n", average);
    }
}