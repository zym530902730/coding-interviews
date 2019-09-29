package main;

import java.util.Arrays;

/**
 * Title: Q_17_打印从1到最大的n位数
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-29 22:48
 */
public class Q_17_打印从1到最大的n位数 {
    public void print1ToMaxOfNDigits(int n) {
        if (n < 0) {
            return;
        }
        char[] number = new char[n];
        Arrays.fill(number, '0');

        while (!Increment(number)) {
            printNumber(number);
        }
    }

    private void printNumber(char[] number) {
        boolean isBeginning0 = true;
        int nLength = number.length;
        
        for (int i = 0; i < nLength; i++) {
            if (isBeginning0 && number[i] != '0') {
                isBeginning0 = false;
            }
            if (!isBeginning0) {
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }

    private boolean Increment(char[] number) {
        boolean isOverflow = false;
        int nTakeOver = 0;
        int nLength = number.length;

        for (int i = nLength - 1; i >= 0; i--) {
            int nSum = number[i] - '0' + nTakeOver;
            if (i == nLength - 1) {
                nSum++;
            }
            if (nSum >= 10) {
                if (i == 0) {
                    isOverflow = true;
                } else {
                    nSum -= 10;
                    nTakeOver = 1;
                    number[i] = (char)('0' + nSum);
                }
            } else {
                number[i] = (char)('0' + nSum);
                break;
            }
        }
        return isOverflow;
    }
}
