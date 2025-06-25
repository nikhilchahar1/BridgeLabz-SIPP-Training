// Base class: Student
public class Student {
    public int rollNumber;        // Public
    protected String name;        // Protected
    private double cgpa;          // Private

    // Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public method to set CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // Method to display student info
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
