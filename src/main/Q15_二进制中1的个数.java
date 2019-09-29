package main;

/**
 * Title: Q15_二进制中1的个数
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-24 10:37
 */
public class Q15_二进制中1的个数 {
    public static int numberOf1(int n) {
        int count = 0;
        
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(numberOf1(3));
    }
    
    
}
