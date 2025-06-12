package program;
import java.util.Scanner;
public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temp in celsius : ");
		double c = sc.nextInt();
		double t = (c*(9.0/5.0))+32.0;
		System.out.print("temp in Fahrenheit is : "+t);
	}

}
