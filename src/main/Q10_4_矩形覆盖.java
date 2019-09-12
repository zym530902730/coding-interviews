package main;

/**
 * Title: Q10_4_矩形覆盖
 * ProjectName: 剑指offer
 * Function:  矩形覆盖 斐波那契
 * author     Yiming Zhao
 * Date:      2019-09-10 22:09
 */
public class Q10_4_矩形覆盖 {
    public int RectCover(int target) {
        if (target <= 2){
            return target;
        }
        int pre2 = 1, pre1 = 2;
        int result = 0;
        for (int i = 3; i <= target; i++) {
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
