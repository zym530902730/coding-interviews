package main;

import java.util.Scanner;

/**
 * 来源：招商银行信用卡笔试题
 *
 * 数轴上N个点，N为2到10^5，每个点都是L或者R，每个点上有个机器人，每个机器人执行以下操作10^100次，
 * 若当前点上是L则左移一位。是R则右移一位。
 * 点1是R，点N是L，输出最后每个点上有几个机器人。
 * 输入：一个只包含L和R的字符串。
 */


public class 机器人{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next().trim();

        int n = s.length();
        int[] res = new int[n];

        String t = "";
        int index;
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == 'L') {
                for(index = i - 1; index >= 0; index--) {
                    if(s.charAt(index) == 'R') {
                        break;
                    }
                }
                if((i-index) % 2 == 0) {
                    res[index]++;
                }
                else {
                    res[index+1]++;
                }
            }
            else if(c == 'R') {
                for(index = i+1; index < n; index++) {
                    if(s.charAt(index) == 'L') {
                        break;
                    }
                }
                if((index - i) % 2 == 0) {
                    res[index]++;
                }
                else {
                    res[index-1]++;
                }
            }
        }

        for(int i = 0; i < n - 1; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println(res[n-1]);
    }

}