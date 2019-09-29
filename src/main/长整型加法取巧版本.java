package main;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Title: 长整型加法取巧版本
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-17 10:49
 */
public class 长整型加法取巧版本 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        BigInteger a1 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);
        System.out.println(a1.add(b2));
    }
}
