package program;
import java.util.Scanner;
public class KmToMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the kilometers : ");
        int km = sc.nextInt();
        double miles = km * 0.621371;
        

        System.out.println("Miles : "+miles); 
	}

}
