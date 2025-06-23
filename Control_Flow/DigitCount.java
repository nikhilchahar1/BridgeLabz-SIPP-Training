import java.util.Scanner;

public class DigitCount {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;
        int n = Math.abs(number);
        if (n == 0) count = 1;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}
