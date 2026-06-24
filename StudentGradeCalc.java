import java.util.Scanner;

public class StudentGradeCalc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Grade Calculator ===");

        // Step 1: Ask for the total number of subjects
        System.out.print("Enter total number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Step 2 & 3: Take marks for each subject and calculate total
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // Validate that marks are within the 0-100 range
            while (marks < 0 || marks > 100) {
                System.out.print("Invalid input! Please enter marks between 0 and 100: ");
                marks = scanner.nextInt();
            }

            totalMarks += marks; // Summing up the marks
        }

        // Step 4: Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Step 5: Grade Calculation
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Step 6: Display Results
        System.out.println("\n--- Final Results ---");
        System.out.println("Total Marks:        " + totalMarks + " / " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade:              " + grade);

        scanner.close();
    }
}