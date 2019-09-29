package main;

/**
 * Title: Q14_剪绳子_贪心算法
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-23 21:48
 */
public class Q14_剪绳子_贪心算法 {
    public static int maxProductAfterCutting_solution2(int length) {
        if (length < 2) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        // 尽可能多地剪去长度为3的绳子段
        int timesOf3 = length / 3;

        // 当绳子最后剩下的长度为4时候，不能再剪去长度为3的绳子段，剪成2 X 2 的两段
        if (length - timesOf3 * 3 == 1) {
            timesOf3 --;
        }
        int timesOf2 = (length - timesOf3 * 3) / 2;
        return (int) (Math.pow(3, timesOf3) * Math.pow(2, timesOf2));
    }

    public static void main(String[] args) {
        System.out.println(maxProductAfterCutting_solution2(4));
    }


}
