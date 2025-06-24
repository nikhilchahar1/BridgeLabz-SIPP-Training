import java.util.Scanner;
public class PrimeNumberCheck {
    
    public static void main(String[] args) {

        // Taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Checking for prime number
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("Is the number prime? " + isPrime);
        sc.close();
    }
}
