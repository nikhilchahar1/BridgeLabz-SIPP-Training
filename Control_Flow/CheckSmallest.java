import java.util.Scanner;
public class CheckSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input by user for 3 numbers
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the third number : ");
		int num3 = sc.nextInt();
		
		// now check if the num1 is smallest
		String result = "";
		if(num1 < num2 && num1 < num3) {
			result = "Yes";
		}else {
			result = "No";
		}
		System.out.print("Is the first number is smallest? " +result);
	}

}
