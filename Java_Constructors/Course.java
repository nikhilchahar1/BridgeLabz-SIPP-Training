public class Course {
    String courseName;
    int duration; // in weeks or months
    double fee;
    static String instituteName = "ABC Institute";  // Default value for all courses

    // Constructor to initialize course details
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        // Create course objects
        Course c1 = new Course("Java Programming", 8, 5000);
        Course c2 = new Course("Web Development", 12, 8000);

        // Display details before changing institute name
        System.out.println("Courses before updating institute name:\n");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("TechVerse Academy");

        // Display details after changing institute name
        System.out.println("\nCourses after updating institute name:\n");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
