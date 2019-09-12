package main;

/**
 * Title: Q10_3_变态跳台阶
 * ProjectName: 剑指offer
 * Function:  变态跳台阶 DP算法
 * author     Yiming Zhao
 * Date:      2019-09-10 12:14
 */
public class Q10_3_变态跳台阶 {
    public int JumpFloorII(int target) {
        if (target < 1) {
            return 0;
        }
        if (target == 1 || target == 2) {
            return target;
        }
        int dp[] = new int[target + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 2; i <= target; i++) {
            dp[i] = 0;
            for (int j = 1; j < i; j++) {
                dp[i] += dp[j];
            }
            dp[i] += 1;
        }
        return dp[target];
    }
}
