package main;

/**
 * Title: 最长不含重复字符子串
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-20 13:43
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 最长不含重复字符子串 {

    public static int lengthOfLongestSubstring(String s) {
        //对传入参数进行校验
        if (s == null || s.length() <= 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        //将结果放进一个可排序的集合中
        List list = new ArrayList<Integer>();
        String expectResult = "";
        char[] array = s.toCharArray();

        //循环，将不重复的子串的长度全部放入集合中
        for (int i=0; i<array.length; i++) {
            for (int j=i; j<array.length; j++) {
                if (!expectResult.contains(String.valueOf(array[j]))) {
                    expectResult += array[j];
                } else {
                    list.add(expectResult.length());
                    expectResult = "";
                    break;
                }
            }
        }

        //对集合进行排序(升序)
        Collections.sort(list);

        //返回集合中的最后一个元素
        return (Integer) list.get(list.size() - 1);

    }


    public static void main(String[] args) {
        String params = "abcadcdb";
        int value = lengthOfLongestSubstring(params);
        System.out.println(value);
    }
}