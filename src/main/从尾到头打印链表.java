package main;


import common.ListNode;

import java.util.ArrayList;

/**
 * Title: 从尾到头打印链表
 * ProjectName: 剑指offer
 * Function:  从尾到头打印链表
 * author     Yiming Zhao
 * Date:      2019-09-09 21:29
 */
public class 从尾到头打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tmp = listNode;
        while (tmp != null) {
            list.add(0, tmp.val);
            tmp = tmp.next;
        }
         return list;
    }
}
