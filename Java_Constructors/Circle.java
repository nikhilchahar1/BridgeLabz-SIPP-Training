public class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);  // Default radius is 1.0
    }

    // Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle with default radius:");
        c1.displayRadius();

        Circle c2 = new Circle(5.5);
        System.out.println("Circle with user-defined radius:");
        c2.displayRadius();
    }
}
