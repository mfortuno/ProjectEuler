package net.projecteuler.p001;

import static java.lang.System.exit;

/**
 * Created by Mike on 1/2/17.
 *
 * Multiples of 3 and 5
 * Problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class P001_test {
    public static void main(String[] args) {
        P001 p001 = new P001();

        int sum = p001.findMultiples(10);
        if(sum != 23) {
            System.out.println("Initial sum should equal 23 but does not.");
            exit(1);
        }
        System.out.println("Initial sum is " + sum);

        sum = p001.findMultiples(1000);
        System.out.println("Challenge sum is " + sum);
    }
}
