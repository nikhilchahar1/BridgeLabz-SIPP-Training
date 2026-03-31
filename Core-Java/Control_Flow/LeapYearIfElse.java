import java.util.Scanner;

public class LeapYearIfElse {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking input 
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // output
        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is Not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }
        } else {
            System.out.println("Year must be 1582 or later.");
        }
        scanner.close();
    }
}
