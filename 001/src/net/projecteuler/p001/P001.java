package net.projecteuler.p001;

/**
 * Created by Mike on 1/2/17.
 *
 * Multiples of 3 and 5
 * Problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class P001 {

    int findMultiples(int maxValue) {
        int sum = 0;

        for(int i = 0; i < maxValue; i++) {
            if (isMultipleOfThree(i) || isMultipleOfFive(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private boolean isMultipleOfFive(int i) {
        return i % 5 == 0;
    }

    private boolean isMultipleOfThree(int i) {
        return i % 3 == 0;
    }
}
