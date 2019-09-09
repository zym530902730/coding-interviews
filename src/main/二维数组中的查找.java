package main;

/**
 * Title: 二维数组中的查找
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-07-11 23:50
 */
public class 二维数组中的查找 {

    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        // 初始化 行 列，定义为右上角
        int rows = 0;
        int columns = array[0].length - 1;
        while (rows <= array.length - 1 && columns >= 0) {
            if (array[rows][columns] == target) {
                return true;
            } else if (array[rows][columns] < target) {
                rows++;
            } else {
                columns--;
            }
        }

        return false;
    }

}
