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
        Results r;
        long startTime, endTime, elapsedTime;

        // brute results
        r = p001.bruteMultiples(10);
        verifyInitialResult(r);
        System.out.println("Initial sum is " + r.getSum());

        startTime = System.nanoTime();
        r = p001.bruteMultiples(1000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        printResults(r, elapsedTime);

        // Project Euler's better solution
        r = p001.solution2(10);
        verifyInitialResult(r);
        System.out.println("Initial sum is " + r.getSum());

        startTime = System.nanoTime();
        r = p001.solution2(1000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        printResults(r, elapsedTime);
    }

    private static void verifyInitialResult(Results r) {
        if(r.getSum() != 23) {
            System.out.println("Initial sum should equal 23 but does not.");
            exit(1);
        }
    }

    private static void printResults(Results r, long elapsedTime) {
        System.out.println("Challenge sum is " + r.getSum());
        System.out.println("Challenge number of calculations is " + r.getOperations());
        System.out.println("Challenge took " + elapsedTime + "ns");
    }
}
