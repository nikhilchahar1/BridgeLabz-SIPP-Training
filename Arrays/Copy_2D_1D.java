import java.util.Scanner;

public class Copy_2D_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int[] ans = new int[row*col];
        int idx=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ans[idx++]=mat[i][j];
            }
        }

        // Output
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
