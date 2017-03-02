package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Pablo Johnson pablo.88j@gmail.com
 * exercise: https://www.hackerrank.com/challenges/strange-code
 * testCase: 4
 */

public class StrangeCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long h = in.nextLong();
        BigInteger t = BigInteger.valueOf(h);
        in.close();
        BigInteger factor = BigInteger.valueOf(0L);
        BigInteger sum =BigInteger.valueOf(3L);
        BigInteger lastSum =BigInteger.valueOf(3L);
        BigInteger two =BigInteger.valueOf(2L);

        while (sum.compareTo(t)<0){
            factor = factor.add(BigInteger.valueOf(1L));
            lastSum = two.pow(factor.intValue()).multiply(BigInteger.valueOf(3L));
            sum = sum.add(lastSum);
        }
//        sum = sum.subtract(lastSum).add(BigInteger.valueOf(1L));
        BigInteger pivot = lastSum.subtract(BigInteger.valueOf(2L));
        BigInteger difference = t.subtract(pivot);
        BigInteger result = lastSum.subtract(difference);
        System.out.println(result.toString());
    }
}
