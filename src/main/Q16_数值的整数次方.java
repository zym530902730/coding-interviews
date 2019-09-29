package main;

/**
 * Title: Q16_数值的整数次方
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-24 22:01
 */
public class Q16_数值的整数次方 {
    boolean g_InvaildInput = false;
    public double Power(double base, int exponent) {

        if (Double.doubleToLongBits(base) == Double.doubleToLongBits(0.0)  && exponent < 0) {
            g_InvaildInput = true;
            return 0.0;
        }

        int absExponent = exponent;
        if (exponent < 0) {
            absExponent = -exponent;
        }
        double result = PowerWithUnsignedExponent(base, absExponent);
        if (exponent < 0) {
            result = 1.0 / result;
        }
        return result;
    }

    double PowerWithUnsignedExponent(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent == 1) {
            return base;
        }
        // 右移运算符代替除以2，
        double result = PowerWithUnsignedExponent(base, (exponent >> 1));
        result *= result;
        // 用位于运算符代替求余运算
        if ((exponent & 1) == 1) {
            result *= base;
        }
        return result;
    }

}
