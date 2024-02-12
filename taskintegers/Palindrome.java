package taskintegers;

/*
 * Given an integer x retun true if is a palindrome, and otherwise false
 * 
 * - do it without convert to string
 * 
 *  12321 - true
 *  1221  - true
 * 
 * -121 - false
 */

public class Palindrome {

    public boolean evaluate(int x) {
        if (x < 0)
            return false;
        if (x != 0 && x % 10 == 0)
            return false;

        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return x == reverse || (x == reverse / 10);
    }
    // TC: O(log n), SC: O(1)

    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        System.out.println("Result: " + p.evaluate(12321));
    }
}
