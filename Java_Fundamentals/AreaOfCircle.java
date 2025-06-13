package program;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of circle : ");
		double r = sc.nextInt();
		double ar = 3.14*r*r;
		System.out.println("area is : " +ar);
	}

}