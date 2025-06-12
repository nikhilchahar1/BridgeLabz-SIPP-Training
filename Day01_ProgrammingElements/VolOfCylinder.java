package program;
import java.util.Scanner;
public class VolOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the radius : ");
		double r = sc.nextInt();
		System.out.print("enter the height : ");
		double h = sc.nextInt();
		double v = 3.14*r*r*h;
		System.out.println("Volume is : " +v);
	}

}
