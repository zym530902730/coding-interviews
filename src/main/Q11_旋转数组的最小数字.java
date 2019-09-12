package main;

/**
 * Title: Q11_旋转数组的最小数字
 * ProjectName: 剑指offer
 * Function:  旋转数组的最小数字 二分查找
 * author     Yiming Zhao
 * Date:      2019-09-10 22:17
 */
public class Q11_旋转数组的最小数字 {
    // 暴力法
    // 时间复杂度：O(n)
    // 空间复杂度：O(1)
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]) {
                return array[i];
            }
        }
        return array[0];
    }

    // 二分查找法
    public int minNumberInRotateArray2(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        int low = 0, high = array.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[low] == array[mid] && array[mid] == array[high]) {
                return minNumber(array,low,high);
            }
            else if (array[mid] <= array[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return array[low];
    }


    private int minNumber(int[] nums, int l, int h) {
        for (int i = l; i < h; i++) {
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }
        return nums[l];
    }
}
