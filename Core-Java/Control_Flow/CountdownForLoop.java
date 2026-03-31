import java.util.Scanner;

public class CountdownForLoop {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // User input for counter
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();
        
        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Print current counter value
        }
        System.out.println("Rocket Launched!");
        
        // Close the scanner
        scanner.close();
    }
}
