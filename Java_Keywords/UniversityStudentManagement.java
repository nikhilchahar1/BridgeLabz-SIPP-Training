class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    // Constructor using 'this'
    Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details after instanceof check
    void displayStudent(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Name: " + s.name);
            System.out.println("Grade: " + s.grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    // Method to update grade after instanceof check
    void updateGrade(Object obj, char newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated for Roll Number " + s.rollNumber);
        } else {
            System.out.println("Invalid student object. Grade not updated.");
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ananya", 'A');
        Student s2 = new Student(102, "Ravi", 'B');

        s1.displayStudent(s1);
        s2.displayStudent(s2);

        Student.displayTotalStudents();

        // Update grade of a student
        s1.updateGrade(s1, 'A');

        System.out.println("\nAfter grade update:");
        s1.displayStudent(s1);
    }
}
