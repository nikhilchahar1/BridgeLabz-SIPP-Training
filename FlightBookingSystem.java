import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Flight {
    String flightNumber;
    String origin;
    String destination;

    Flight(String flightNumber, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return String.format("Flight %s: %s to %s", flightNumber, origin, destination);
    }
}

class Booking {
    String passengerName;
    Flight flight;

    Booking(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return String.format("Passenger: %s | %s", passengerName, flight.toString());
    }
}

public class FlightBookingSystem {
    static Flight[] flights = {
        new Flight("AI101", "Delhi", "Mumbai"),
        new Flight("AI102", "Mumbai", "Chennai"),
        new Flight("AI103", "Delhi", "Bangalore"),
        new Flight("AI104", "Kolkata", "Delhi")
    };

    static List<Booking> bookings = new ArrayList<>();

    public static void searchFlights(String keyword) {
        System.out.println("Search Results:");
        boolean found = false;
        for (Flight flight : flights) {
            if (flight.origin.toLowerCase().contains(keyword.toLowerCase()) ||
                flight.destination.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(flight);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found matching your search.");
        }
    }

    public static void bookFlight(String flightNumber, String passengerName) {
        for (Flight flight : flights) {
            if (flight.flightNumber.equalsIgnoreCase(flightNumber)) {
                bookings.add(new Booking(passengerName, flight));
                System.out.println("Booking successful for " + passengerName);
                return;
            }
        }
        System.out.println("Flight number not found.");
    }

    public static void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            System.out.println("Booking Details:");
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter origin or destination to search: ");
                    String keyword = scanner.nextLine();
                    searchFlights(keyword);
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter flight number to book: ");
                    String flightNum = scanner.nextLine();
                    bookFlight(flightNum, name);
                    break;
                case 3:
                    displayBookings();
                    break;
                case 4:
                    System.out.println("Thank you for using the Flight Booking System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
