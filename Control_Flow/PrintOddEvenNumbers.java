import java.util.Scanner;

public class PrintOddEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // to get the number from the user
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // condition to check if the number entered is a natutal number
        if (number > 0) {
            for (int i = 1; i <= number; i++){
                if (i % 2 == 0) {
                    System.out.println(i + " is even number.");     // print if the number is an even number
                }
                else {
                    System.out.println(i + " is odd number.");      // print if the number is a odd number
                }
            }
        }

        sc.close();
    }    
}
