import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n];

        dp[0] = 0;
        dp[1] = 1;

        System.out.println("First" + n + "Fibonacci Numbers");

        System.out.println(dp[0] + " ");
    }
}