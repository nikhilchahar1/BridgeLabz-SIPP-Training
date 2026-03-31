// Base class: Employee
public class Employee {
    public int employeeID;         // Public: accessible everywhere
    protected String department;   // Protected: accessible in subclass
    private double salary;         // Private: only accessible within Employee

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee info
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    String projectName;

    // Constructor
    Manager(int employeeID, String department, double salary, String projectName) {
        super(employeeID, department, salary);
        this.projectName = projectName;
    }

    // Method to display manager details
    void displayManager() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID (public): " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Salary (private via getter): ₹" + getSalary());
        System.out.println("Project Name: " + projectName);
    }

    public static void main(String[] args) {
        // Create Employee object
        Employee e1 = new Employee(1001, "IT", 50000);
        System.out.println("Employee:");
        e1.displayEmployee();

        // Create Manager object
        Manager m1 = new Manager(2001, "HR", 75000, "Recruitment Drive");
        System.out.println("\n");
        m1.displayManager();

        // Modify salary using public method
        m1.setSalary(80000);
        System.out.println("\nAfter Salary Update:");
        System.out.println("Updated Salary: ₹" + m1.getSalary());
    }
}
