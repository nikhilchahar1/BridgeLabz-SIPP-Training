package program;
import java.util.Scanner;
public class PeriOfRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length : ");
		double l = sc.nextInt();
		System.out.print("Enter the breadth : ");
		double b = sc.nextInt();
		double p = 2*(l+b);
		System.out.print("Perimeter is : " +p);
	}

}
