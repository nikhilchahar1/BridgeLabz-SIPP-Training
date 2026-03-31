// Superclass representing a person
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface representing a worker with duties
interface Worker {
    void performDuties();
}

// Subclass representing a chef, inheriting from Person and implementing Worker
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        displayBasicInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Preparing meals and managing the kitchen.");
    }
}

// Subclass representing a waiter, inheriting from Person and implementing Worker
class Waiter extends Person implements Worker {
    String section;

    Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    public void performDuties() {
        displayBasicInfo();
        System.out.println("Role: Waiter");
        System.out.println("Section: " + section);
        System.out.println("Duties: Taking orders and serving customers.");
    }
}

// Main class to test the hybrid inheritance system
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Raj", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Simran", 202, "Outdoor Seating");

        System.out.println("---- Chef Details ----");
        chef.performDuties();

        System.out.println("\n---- Waiter Details ----");
        waiter.performDuties();
    }
}
