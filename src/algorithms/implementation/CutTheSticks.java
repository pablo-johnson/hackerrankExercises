package algorithms.implementation;

import java.util.Scanner;

/**
 * @author Pablo Johnson pablo.88j@gmail.com
 * exercise: https://www.hackerrank.com/challenges/cut-the-sticks
 * testCase: 6 5 4 4 2 2 8
 */
public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            min = Math.min(min, arr[arr_i]);
        }
        int counter = arr.length;
        while(counter>0){
            counter = 0;
            int newMin = arr.length;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>0){
                    arr[i]=arr[i]-min;
                    if (arr[i]>0){
                        newMin=Math.min(newMin, arr[i]);
                    }
                    counter++;
                }
            }
            min = newMin;
            if(counter>0){
                System.out.println(counter);
            }
        }
    }
}
