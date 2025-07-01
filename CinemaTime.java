import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Custom exception for invalid time format
class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String message) {
        super(message);
    }
}

public class CinemaTime {
    private List<String> movieTitles;
    private List<String> showTimes;

    public CinemaTime() {
        movieTitles = new ArrayList<>();
        showTimes = new ArrayList<>();
    }

    // Method to add a movie with a showtime
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTimeFormat(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time + ". Please use HH:mm format.");
        }
        movieTitles.add(title);
        showTimes.add(time);
    }

    // Search for movies containing a keyword
    public void searchMovie(String keyword) {
        boolean found = false;
        System.out.println("Search results for \"" + keyword + "\":");
        for (int i = 0; i < movieTitles.size(); i++) {
            if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(String.format("%d. %s - %s", i + 1, movieTitles.get(i), showTimes.get(i)));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching movies found.");
        }
    }

    // Display all movies
    public void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }
        System.out.println("All Movies:");
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(String.format("%d. %s - %s", i + 1, movieTitles.get(i), showTimes.get(i)));
        }

        // Report: Convert lists to arrays
        String[] titleArray = movieTitles.toArray(new String[0]);
        String[] timeArray = showTimes.toArray(new String[0]);
        System.out.println("\n--- Printable Report (Arrays) ---");
        for (int i = 0; i < titleArray.length; i++) {
            System.out.println((i + 1) + ". " + titleArray[i] + " - " + timeArray[i]);
        }
    }

    // Validate time in HH:mm format
    private boolean isValidTimeFormat(String time) {
        if (!time.matches("\\d{2}:\\d{2}")) return false;
        try {
            int hours = Integer.parseInt(time.substring(0, 2));
            int minutes = Integer.parseInt(time.substring(3, 5));
            return hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        CinemaTime manager = new CinemaTime();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCinemaTime - Menu");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    try {
                        System.out.print("Enter movie title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter showtime (HH:mm): ");
                        String time = scanner.nextLine();
                        manager.addMovie(title, time);
                        System.out.println("Movie added successfully!");
                    } catch (InvalidTimeFormatException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "2":
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    manager.searchMovie(keyword);
                    break;
                case "3":
                    manager.displayAllMovies();
                    break;
                case "4":
                    System.out.println("Exiting CinemaTime. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}