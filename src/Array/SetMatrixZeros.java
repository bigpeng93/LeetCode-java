package Array;

import java.util.Arrays;

public class SetMatrixZeros {
    public void solution(int[][] matrix){
        boolean fr = false,fc = false;
        int n = matrix.length-1;
        int m = matrix[0].length-1;
        for (int i = 0;i<=n;i++){
            for (int j = 0; j <= m;j++){
                if(matrix[i][j] == 0){
                    if (i == 0) fr = true;
                    if (j == 0) fc = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i= 1;i <=n;i++){
            for(int j=1;j<=m;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }
        if(fr){
            for(int j= 0; j<= m;j++)
                matrix[0][j] = 0;
        }
        if(fc){
            for(int i= 0; i<= n;i++)
                matrix[i][0] = 0;
        }
        for(int[] ma :matrix)
            System.out.println(Arrays.toString(ma));
    }
}
