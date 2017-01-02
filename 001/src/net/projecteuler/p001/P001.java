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
    private int operations;

    Results bruteMultiples(int targetValue) {
        Results r = new Results();
        operations = 0;
        int sum = 0;

        for(int i = 0; i < targetValue; i++) {
            if (isMultipleOfThree(i) || isMultipleOfFive(i)) {
                sum += i;
            }
        }

        r.setSum(sum);
        r.setOperations(operations);
        return r;
    }

    // multiple operations occur: mod, equality.
    private boolean isMultipleOfFive(int i) {
        operations +=2;
        return i % 5 == 0;
    }

    // multiple operations occur: mod, equality
    private boolean isMultipleOfThree(int i) {
        operations +=2;
        return i % 3 == 0;
    }

    // more efficient solution
    Results solution2(int targetValue) {
        Results r = new Results();
        operations = 0;
        int sum = 0;

        for(int i = 0; i < targetValue; i += 3) {
            operations++;
            sum += i;
        }

        for (int i = 0; i < targetValue; i += 5) {
            operations++;
            sum += i;
        }

        for (int i = 0; i < targetValue; i += 15) {
            operations++;
            sum -= i;
        }

        r.setSum(sum);
        r.setOperations(operations);
        return r;

    }
}
