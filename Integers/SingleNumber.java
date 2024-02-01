package Integers;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a non-empty array of integers num every element apperas twice except for
 * one that is single occurance - find it
 */

public class SingleNumber {

    public int evaluate(int[] input) {
        Set<Integer> result = new HashSet<Integer>();
        for (var num : input) {
            if (result.contains(num)) {
                result.remove(num);
            } else {
                result.add(num);
            }
        }
        // return result.stream().findFirst().get();
        return result.iterator().next();
    }

    public int evaluateXOR(int[] input) {
        int singleNum = 0;
        for (var num : input) {
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }

    public static void main(String[] args) {
        var s = new SingleNumber();
        int[] input = { 3, 2, 7, 2, 3 };
        System.out.println("Result is: " + s.evaluate(input));

        System.out.println("XOR Result is: " + s.evaluateXOR(input));
    }
}
