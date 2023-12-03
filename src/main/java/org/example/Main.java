package org.example;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
        int[] a = {10, 6, 12, 5, 13};

//        System.out.println("Calculator.add(1,2) = " + Calculator.add(1, 2));
//        System.out.println("Calculator.add(1,3,4,7,4,9,3,7,8) = " + Calculator.add(1, 3, 4, 7, 4, 9, 3, 7, 8,Integer.MAX_VALUE));
//        System.out.println("Calculator.minus(9,4) = " + Calculator.minus(9, 4));
//        System.out.println("Calculator.multiply(5,9) = " + Calculator.multiply(5, 9));
//        System.out.println("Calculator.divide(65,6) = " + Calculator.divide(65, 6));
//        System.out.println("Calculator.findFirstPrime(31,5, 4, 3, 8, 6, 7, 21, 23) = " + Calculator.findFirstPrime(31, 5, 4, 3, 8, 6, 7, 21, 23));
//        System.out.println("Calculator.findAllPrimes(a) = " + Arrays.toString(Calculator.findAllPrimes2(a)));
//        System.out.println("Calculator.indexOf(a,12) = " + Calculator.indexOf(a, 12));
//        System.out.println("Calculator.contains(a,12) = " + Calculator.contains(a, 12));
//        System.out.println("Calculator.reverse(a) = " + Arrays.toString(Calculator.reverse(a)));
//        System.out.println("Calculator.isEqual(Calculator.reverse(a),Calculator.reverse2(a)) = " + Calculator.isEqual(Calculator.reverse(a), Calculator.reverse2(a)));
        long l = currentTimeMillis();
//        System.out.println(l / (1000L * 60 * 60 * 24 * 365));
        System.out.println("Calculator.subArray(a, 1, 3) = " + Calculator.toString(Calculator.subArray(a, 1, 3)));
        long l2 = currentTimeMillis();
        System.out.println(l2 - l);
    }

}
