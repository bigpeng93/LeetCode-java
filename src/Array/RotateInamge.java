package Array;

import java.util.Arrays;

public class RotateInamge {
    public void solution(int[][] matrix){
        int n = matrix.length-1;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j][n-i];
                matrix[n-j][n-i] = temp;
            }
        }
        for (int[] num:matrix){
            System.out.println(Arrays.toString(num));
        }
        for(int i = 0; i<matrix.length/2;i++){
            for (int j = 0;j<=n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-i][j];
                matrix[n-i][j] = temp;
            }
        }
        System.out.println();
        for (int[] num:matrix){
            System.out.println(Arrays.toString(num));
        }
    }
}
