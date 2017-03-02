package algorithms.implementation;

import java.util.Scanner;

/**
 * @author Pablo Johnson pablo.88j@gmail.com
 * exercise: https://www.hackerrank.com/challenges/kaprekar-numbers
 * testCase: 1 99999
 */
public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.close();
        boolean kaprekarsFound = false;
        StringBuffer sb = new StringBuffer();
        for (long i = p; i <= q; i++) {
            if (i==77778){
                System.out.print("HI");
            }
            String square = String.valueOf(i * i);
            int length = square.length();
            if (length == 1) {
                if (Integer.valueOf(square) == i) {
                    sb.append(i + " ");
                    kaprekarsFound = true;
                }
            } else if (length % 2 == 0) {
                Long left = Long.valueOf(square.substring(0, length / 2));
                Long right = Long.valueOf(square.substring(length / 2, length));
                if (left + right == i) {
                    sb.append(i + " ");
                    kaprekarsFound = true;
                }
            } else {
                Long left = Long.valueOf(square.substring(0, (length-1) / 2 ));
                Long right = Long.valueOf(square.substring((length-1) / 2, length));
                if (left + right == i) {
                    sb.append(i + " ");
                    kaprekarsFound = true;
                }
            }
        }
        if (kaprekarsFound) {
            System.out.println(sb.toString().trim());
        } else {
            System.out.println("INVALID RANGE");
        }
    }
}
