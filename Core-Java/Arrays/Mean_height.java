import java.util.*;
public class Mean_height{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 
        double[] heights = new double[11];
        for(int i=0; i<heights.length; i++){
            heights[i]=sc.nextDouble();
        }
        double sum = 0;
        for(int i=0; i<heights.length; i++){
            sum+=heights[i];
        }
        double mean = sum/heights.length;
        System.out.println(mean);
    }
}