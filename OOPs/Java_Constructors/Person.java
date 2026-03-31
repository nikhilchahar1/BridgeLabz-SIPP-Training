public class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Original person
        Person original = new Person("Nikhil", 25);
        System.out.println("Original Person:");
        original.display();

        // Cloned person using copy constructor
        Person clone = new Person(original);
        System.out.println("\nCloned Person:");
        clone.display();
    }
}
