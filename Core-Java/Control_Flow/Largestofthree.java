import java.util.Scanner;
public class Largestofthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// input for three numbers
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the third number : ");
		int num3 = sc.nextInt();
		
		// Output
		System.out.println("Is the first number is largest? " +((num1>num2 && num1>num3)? "Yes" : "No"));
		System.out.println("Is the second number is largest? " +((num1<num2 && num2>num3)? "Yes" : "No"));
		System.out.println("Is the first number is largest? " +((num3>num2 && num1<num3)? "Yes" : "No"));
		
	}

}
