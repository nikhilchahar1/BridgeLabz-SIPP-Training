package day02;

public class Pens {

	public static void main(String[] args) {
		
		int totalPens = 14;
        int students = 3;

        // Pens per student using division operator
        int pensPerStudent = totalPens / students;

        // Remaining pens using modulus operator
        int remainingPens = totalPens % students;

        // Output the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
   
	}

}
