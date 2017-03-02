package algorithms.implementation;

import java.util.Scanner;

/**
 * @author Pablo Johnson pablo.88j@gmail.com
 * exercise: https://www.hackerrank.com/challenges/find-digits
 * testCase: 11 123456789 114108089 110110015 121 33 44 55 66 77 88 106108048
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int div = 10;
            int counter=0;
            int number = n;
            do{
                int res = n%div;
                if (res>0 && number%res==0){
                    counter++;
                }
                n = n/10;
            } while (n>0);
            System.out.println(counter);
        }
    }
}
