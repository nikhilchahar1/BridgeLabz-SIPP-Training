import java.util.Scanner;
public class SumofNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input of number from user
		System.out.print("Eneter the number : ");
		int n = sc.nextInt();
		
		// sum of n natural numbers
		double sum = (n*(n+1))/2;
		if(n>0) {
			System.out.print("The sum of "  +n+ " natural numbers is " +sum);
		}else {
			System.out.print("The number " +n+ "is not a natural numbers");
		}

	}

}
