/**
 * The Student class represents a student with a name and marks in 3 subjects.
 * It demonstrates how classes bundle data (attributes) and behaviors (methods) together.
 */
public class Student {
    // Attributes (Instance Variables)
    private String name;
    
    // An array to store marks in 3 subjects.
    // Demonstrates the use of arrays to group related data of the same type.
    private double[] marks;

    // Subject names for descriptive report printing
    private static final String[] SUBJECTS = {"Mathematics", "Science", "English"};

    /**
     * Constructor to initialize a Student object.
     * 
     * @param name  The name of the student.
     * @param marks An array of double containing marks for 3 subjects.
     */
    public Student(String name, double[] marks) {
        this.name = name;
        // Assign the array reference.
        // In a real-world scenario, we might want to make a copy to prevent external modification, e.g.:
        // this.marks = java.util.Arrays.copyOf(marks, marks.length);
        this.marks = marks;
    }

    // Getters and Setters (Demonstrates encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    /**
     * Calculates the average of the marks.
     * Demonstrates traversing an array and basic arithmetic logic.
     * 
     * @return The average marks.
     */
    public double calculateAverage() {
        double sum = 0;
        
        // Loop through the array to sum the marks.
        // Demonstrates the enhanced for-loop (for-each) in Java.
        for (double mark : marks) {
            sum += mark;
        }
        
        // Return average (sum divided by the number of elements in the array).
        return sum / marks.length;
    }

    /**
     * Determines the grade based on the average marks.
     * Demonstrates conditional logic (if-else-if statements).
     * 
     * @return The grade as a String.
     */
    public String calculateGrade() {
        double average = calculateAverage();
        
        // Conditional logic to determine grade
        if (average >= 85.0) {
            return "A";
        } else if (average >= 70.0) {
            return "B";
        } else if (average >= 50.0) {
            return "C";
        } else {
            return "Fail";
        }
    }

    /**
     * Displays a formatted report card for the student.
     * Demonstrates combining data and formatting output.
     */
    public void displayReport() {
        System.out.println("\n============================================");
        System.out.println("             STUDENT REPORT CARD            ");
        System.out.println("============================================");
        System.out.printf("  Student Name: %s\n", name);
        System.out.println("--------------------------------------------");
        System.out.printf("  %-15s : %-6s\n", "Subject", "Marks");
        System.out.println("--------------------------------------------");
        
        // Loop using standard index to align subject names with their marks.
        for (int i = 0; i < marks.length; i++) {
            // Check if we have subject name available, otherwise use a generic subject index
            String subjectName = (i < SUBJECTS.length) ? SUBJECTS[i] : ("Subject " + (i + 1));
            System.out.printf("  %-15s : %6.2f\n", subjectName, marks[i]);
        }
        
        System.out.println("--------------------------------------------");
        double average = calculateAverage();
        String grade = calculateGrade();
        
        System.out.printf("  %-15s : %6.2f%%\n", "Average Mark", average);
        System.out.printf("  %-15s : %-6s\n", "Final Grade", grade);
        System.out.println("============================================");
    }
}
