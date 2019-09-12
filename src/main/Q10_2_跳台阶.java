package main;

/**
 * Title: Q10_2_跳台阶
 * ProjectName: 剑指offer
 * Function:  跳台阶 斐波那契
 * author     Yiming Zhao
 * Date:      2019-09-10 11:35
 */
public class Q10_2_跳台阶 {
    public int JumpFloor(int target) {
        if (target <= 2) {
            return target;
        }
        int pre2 = 1, pre1 = 2;
        int fib = 0;
        for (int i = 2; i < target; i++) {
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }
}
