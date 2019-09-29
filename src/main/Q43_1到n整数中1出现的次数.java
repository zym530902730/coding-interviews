package main;

/**
 * Title: Q43_1到n整数中1出现的次数
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-28 10:05
 */
public class Q43_1到n整数中1出现的次数 {
    // 暴力法
    public int NumberIf1Between1AndN(int n) {
          int number = 0;

          for (int i = 0; i <= n; i++) {
              number += NumberOf1(i);
          }
          return number;
    }
    public static int NumberOf1(int n) {
        int number = 0;
        while (n != 0) {
            if (n % 10 == 1) {
                number++;
            }
            n = n / 10;
        }
        return number;
    }
}