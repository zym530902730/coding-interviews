package main;

/**
 * Title: Q10_1_斐波那契数列
 * ProjectName: 剑指offer
 * Function:  斐波那契数列
 * author     Yiming Zhao
 * Date:      2019-09-10 11:29
 */
public class Q10_1_斐波那契数列 {
    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int pre2 = 0, pre1 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }
}
