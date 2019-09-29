package main;

/**
 * Title: 位图法查找数组中重复或缺失
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-19 22:29
 */
public class 位图法查找数组中重复或缺失 {
    /**
     * 位图法判断整形数组中的重复数字，时间复杂度为O(n)
     * @param a
     */
    public static void WeiTuFindDuplicatedItem(int[] a){
        // 找出数组中的最大值
        int max=a[0];
        int n = a.length;
        for(int i=1; i<n; i++){
            if(a[i] > max){
                max = a[i];
            }
        }//
        // 创建长度为max+1的数组
        int bit[] = new int[max+1];
        // 按值向新数组中添值
        for(int val : a){
            if(bit[val] != 0){
                System.out.print(val+" ");
            }else{
                bit[val] = 1;
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        WeiTuFindDuplicatedItem(a);
    }
}
