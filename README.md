# Student Grade Reporting System (Java)

This simple Java program reads a student's name and marks for 3 subjects, calculates their average and final grade (A/B/C/Fail), and displays a formatted report card. 

It is designed to demonstrate key programming concepts: **classes (OOP)**, **arrays**, and **basic logic**.

---

## 📚 Core Learning Concepts

### 1. Classes & Object-Oriented Programming (OOP)
A **Class** is a blueprint or template for creating objects. In this project:
- [Student.java](file:///C:/Users/panka/.gemini/antigravity/scratch/student-report-java/Student.java) defines the `Student` class.
- It encapsulates **attributes** (data):
  - `name` (String)
  - `marks` (an array of doubles)
- It encapsulates **methods** (behaviors):
  - `calculateAverage()`: computes the mean of the marks.
  - `calculateGrade()`: assigns a letter grade based on the average.
  - `displayReport()`: outputs a formatted report card.
- Instantiation happens in [StudentReportApp.java](file:///C:/Users/panka/.gemini/antigravity/scratch/student-report-java/StudentReportApp.java) with `new Student(name, marks)`.

### 2. Arrays
An **Array** is a container object that holds a fixed number of values of a single type.
- We declare and initialize a double array for subject marks:
  ```java
  double[] marks = new double[3];
  ```
- We iterate through the array using loops to populate and print marks:
  ```java
  for (int i = 0; i < marks.length; i++) { ... }
  ```
- We sum the array elements using an **enhanced for-loop (for-each)**:
  ```java
  for (double mark : marks) { sum += mark; }
  ```

### 3. Basic Logic
- **Loops (`while`) & Validation**: Ensures we keep prompting the user if they input invalid numbers (e.g., negative numbers, marks > 100, or non-numeric strings).
- **Conditionals (`if-else-if`)**: Grade determination logic in `calculateGrade()`:
  - **Grade A**: Average $\ge 85$
  - **Grade B**: Average $\ge 70$ and $< 85$
  - **Grade C**: Average $\ge 50$ and $< 70$
  - **Fail**: Average $< 50$

---

## 🚀 How to Run the Program

1. Open your terminal in the `student-report-java` directory.
2. Compile both Java files:
   ```bash
   javac Student.java StudentReportApp.java
   ```
3. Run the compiled application:
   ```bash
   java StudentReportApp
   ```

---

## 📝 Example Output

```text
============================================
        Student Grade Reporting System       
============================================
Enter Student Name: Pankaj Kumar

Please enter marks for the following subjects (0 to 100):
Enter marks for Mathematics: 92.5
Enter marks for Science: 87.0
Enter marks for English: 81.5

============================================
             STUDENT REPORT CARD            
============================================
  Student Name: Pankaj Kumar
--------------------------------------------
  Subject         : Marks 
--------------------------------------------
  Mathematics     :  92.50
  Science         :  87.00
  English         :  81.50
--------------------------------------------
  Average Mark    :  87.00%
  Final Grade     : A     
============================================

Thank you for using the Student Grade Reporting System!
```
