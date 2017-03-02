package algorithms.implementation;

import java.util.Scanner;

/**
 * @author Pablo Johnson pablo.88j@gmail.com
 * exercise: https://www.hackerrank.com/challenges/manasa-and-stones
 * testCase: 2 3 1 2 4 10 100
 */
public class ManasaAndStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0; i<t;i++){
            int n = scanner.nextInt()-1;
            int int1 = scanner.nextInt();
            int int2 = scanner.nextInt();
            int a= Math.min(int1,int2);
            int b= Math.max(int1,int2);
            int max = b*n;
            int difference = b-a;
            int current = a*n;
            if (a==b){
                System.out.println(current);
            }else{
                StringBuffer sb = new StringBuffer();
                while(current<=max){
                    sb.append(current + " ");
                    current+=difference;
                }
                System.out.println(sb.toString().trim());
            }

        }

    }
}
