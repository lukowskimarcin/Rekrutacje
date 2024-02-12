package taskintegers;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> evaluate(int n) {
        var result = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add("" + i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FizzBuzz fizz = new FizzBuzz();
        System.out.println("FizzBuzz: " + fizz.evaluate(15));
    }
}