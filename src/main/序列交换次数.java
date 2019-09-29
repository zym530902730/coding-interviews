package main;

import java.util.Scanner;

/**
 * Title: 序列交换次数
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-17 11:01
 */
public class 序列交换次数 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] s = str.split(" ");

        int[] list = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            list[i] = Integer.parseInt(s[i]);
        }
        
        if (list.length < 1) {
            System.out.println(0);
        }
        int count = 0;
        for (int i = 0;i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
