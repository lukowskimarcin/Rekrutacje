package taskintegers;

/*
 * Given an integer n, return the number of trailing zeros in n!
 * 
 * n! -> 1*2....n-1*n
 */
public class FactorialTrailingZeros {

    public int solution(int n) {
        int count = 0;
        int currentPowerOfFive = 5;
        while (currentPowerOfFive <= n) {
            count += (n / currentPowerOfFive);
            currentPowerOfFive *= 5;
        }
        return count;
    }

    public static void main(String[] args) {
        var obj = new FactorialTrailingZeros();
        System.out.println("5!: " + obj.solution(5)); // (1) 120
        System.out.println("25!: " + obj.solution(25)); // (6) 15511210043330985984000000
        System.out.println("125!: " + obj.solution(125)); // (31)
                                                          // 188267717688892609974376770249160085759540364871492425887598231508353156331613598866882932889495923133646405445930057740630161919341380597818883457558547055524326375565007131770880000000000000000000000000000000
    }
}
