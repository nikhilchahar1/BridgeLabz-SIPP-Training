public class StudentReport {
    static class Student {
        String name;
        int rollNumber;
        int marks;

        Student(String name, int rollNumber, int marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        char getGrade() {
            if (marks >= 90) return 'A';
            else if (marks >= 80) return 'B';
            else if (marks >= 70) return 'C';
            else if (marks >= 60) return 'D';
            else return 'F';
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Nikhil", 101, 76);

        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNumber);
        System.out.println("Marks: " + s.marks);
        System.out.println("Grade: " + s.getGrade());
    }
}
