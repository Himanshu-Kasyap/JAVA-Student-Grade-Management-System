import java.util.Scanner;

/**
 * StudentReportApp contains the main method to run the program.
 * It handles terminal-based user input, implements validation loops,
 * uses arrays, and interacts with the Student class.
 */
public class StudentReportApp {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("============================================");
        System.out.println("        Student Grade Reporting System       ");
        System.out.println("============================================");
        
        // 1. Input Student Name
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty()) {
            System.out.print("Name cannot be empty. Please enter Student Name: ");
            name = scanner.nextLine().trim();
        }
        
        // 2. Input Marks for 3 subjects
        // Demonstrates array declaration, initialization, and populating data.
        double[] marks = new double[3];
        String[] subjects = {"Mathematics", "Science", "English"};
        
        System.out.println("\nPlease enter marks for the following subjects (0 to 100):");
        
        for (int i = 0; i < marks.length; i++) {
            boolean isValidInput = false;
            double mark = 0.0;
            
            // Loop until valid marks are provided (Input validation logic)
            while (!isValidInput) {
                System.out.print("Enter marks for " + subjects[i] + ": ");
                if (scanner.hasNextDouble()) {
                    mark = scanner.nextDouble();
                    
                    // Basic validation logic: check if marks are between 0 and 100
                    if (mark >= 0.0 && mark <= 100.0) {
                        isValidInput = true;
                    } else {
                        System.out.println("Error: Marks must be between 0 and 100. Try again.");
                    }
                } else {
                    System.out.println("Error: Invalid input. Please enter a valid number.");
                    scanner.next(); // Consume the invalid token to prevent an infinite loop
                }
            }
            // Store the valid mark in the array
            marks[i] = mark;
        }
        
        // 3. Create Student object (Demonstrates instantiation and OOP concept)
        Student student = new Student(name, marks);
        
        // 4. Calculate and Display report
        student.displayReport();
        
        // Close the scanner resource
        scanner.close();
        System.out.println("\nThank you for using the Student Grade Reporting System!");
    }
}
