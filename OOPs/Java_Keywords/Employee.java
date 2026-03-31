class Employee {
    static String companyName = "TechIT";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    // Constructor using 'this'
    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details after instanceof check
    void printDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("ID: " + e.id);
            System.out.println("Name: " + e.name);
            System.out.println("Designation: " + e.designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("Not an Employee object.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Jakes", "Web Developer");
        Employee emp2 = new Employee(102, "Bob", "Manager");

        emp1.printDetails(emp1);
        emp2.printDetails(emp2);

        Employee.displayTotalEmployees();
    }
}
