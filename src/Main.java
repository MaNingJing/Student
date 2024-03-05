import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage: Creating a student01
        System.out.println("Enter student ID:");
        String studentID = scanner.nextLine();

        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

        System.out.println("Enter the number of extra activities:");
        int numExtraActivities = scanner.nextInt();

        Student student = new Student(studentID, studentName, numExtraActivities);

        // Adding extra activities
        for (int i = 0; i < numExtraActivities; i++) {
            System.out.println("Enter extra activity " + (i + 1) + ":");
            scanner.nextLine(); // Consume the newline character left by nextInt()
            String activity = scanner.nextLine();
            student.addExtraActivity(activity, i);
        }

        // Displaying student details
        System.out.println("\nStudent Details:\n" + student.toString());

        scanner.close();
    }
}