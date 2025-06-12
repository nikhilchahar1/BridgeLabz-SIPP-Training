package day02;
import java.util.Scanner;
public class ConvertDistanceToYards {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        //Read distance in feet from user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        //Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        //Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        //Output
        System.out.println("The distance in yards is " + distanceInYards + 
                           " while the distance in miles is " + distanceInMiles);

	}

}
