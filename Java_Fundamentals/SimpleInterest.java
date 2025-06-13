package program;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount : ");
		double p = sc.nextInt();
		System.out.print("Enter the Rate : ");
		double r = sc.nextInt();
		System.out.print("Enter the time in years : ");
		double t = sc.nextInt();
		double si = (p*r*t)/100;
		System.out.print("Simple Interest : " +si);
	}

}
