package main;

/**
 * Title: Q14_剪绳子_动态规划
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-23 21:28
 */
public class Q14_剪绳子_动态规划 {
    public static int maxProductAfterCutting_solution(int length) {
        if (length < 2) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }
        int[] products = new int[length + 1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;
        
        int max = 0;
        
        for (int i = 4; i <= length; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int product = products[j] * products[i - j];
                if (max < product) {
                    max = product;
                }
                products[i] = max;
            }
        }
        max = products[length];
        
        for (int i : products) {
            System.out.println(i);
        }
        System.out.println();
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(maxProductAfterCutting_solution(4));
    }
    
}
