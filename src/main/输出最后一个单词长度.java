package main;

import java.util.Scanner;

/**
 * Title: 输出最后一个单词长度
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-17 10:13
 */
public class 输出最后一个单词长度 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        int len = 0;

        for (int i = s.length() -1 ; i >= 0; i--) {
            if (len == 0 && s.charAt(i) == ' ') {
                continue;
            } else if (len > 0 && s.charAt(i) == ' ') {
                break;
            } else {
                len++;
            }
        }
        System.out.println(len);
    }
}
