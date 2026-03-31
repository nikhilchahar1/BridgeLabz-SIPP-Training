import java.util.Scanner;
public class DivisibleBy5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// input by user of a number
		System.out.print("Enter the number you want to check : ");
		int num = sc.nextInt();
		// now check if number is divisible by 5 or not
		String result = (num%5==0)? "Yes" : "No" ;
		// output
		System.out.print("Is the number "+num+ " divisible by 5? "+result);
	}

}
