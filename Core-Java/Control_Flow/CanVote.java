import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // to get the age from the user
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // condition for the eligible age
        if (age >= 18) {
            System.out.println("The person can vote."); // if the age is 18 or older
        } else {
            System.out.println("The person cannot vote."); // if the age is less than 18
        }

        input.close();
    }
}