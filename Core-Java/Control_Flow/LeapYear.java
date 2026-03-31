import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // to get the year from the user
        int year = input.nextInt();

        // if block to check if the input year is greater or equal to 1582
        if (year >= 1582) {

            // condition to check if the input year is a leap year or not
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {

            // print if the input year is invalid
            System.out.println("Enter a valid year!");
        }

        input.close();
    }
}