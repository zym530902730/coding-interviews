package main;

/**
 * Title: Q03_数组中重复的数字
 * ProjectName: 剑指offer
 * Function:  数组中重复的数字
 * author     Yiming Zhao
 * Date:      2019-06-06 00:21
 */
public class Q03_数组中重复的数字 {
    public boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private void swap ( int[] nums, int i, int j){
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }

}
