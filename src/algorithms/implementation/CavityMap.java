package algorithms.implementation;

import java.util.Scanner;

/**
 * @author Pablo Johnson pablo.88j@gmail.com
 * exercise: https://www.hackerrank.com/challenges/cavity-map
 * testCase: 4 1112 1912 1892 1234
 */
public class CavityMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] matrix = new int[n][n];
        for(int grid_i=0; grid_i < n; grid_i++){
            String row = in.next();
            for (int i=0; i<n;i++){
                matrix[grid_i][i]=row.charAt(i)-'0';
            }
        }

        for(int i=1;i<n-1;i++){
            for (int j=1; j<n-1; j++){
                int value = matrix[i][j];
                if (value>matrix[i-1][j] && value>matrix[i+1][j] && value>matrix[i][j-1] && value>matrix[i][j+1]){
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for(int i=0;i<n;i++){
            for (int j=0; j<n; j++){
                if (matrix[i][j]==Integer.MAX_VALUE){
                    System.out.print("X");
                }else{
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
