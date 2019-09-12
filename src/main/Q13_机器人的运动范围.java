package main;

/**
 * Title: Q13_机器人的运动范围
 * ProjectName: 剑指offer
 * Function:  机器人的运动范围
 * author     Yiming Zhao
 * Date:      2019-09-12 10:41
 */
public class Q13_机器人的运动范围 {
    /**
     * @name: movingCount
     * @description: 计算能达到的格子数 使用回溯法
     *     从坐标(0, 0) 开始移动，当它准备进入坐标(i, j)，判断是否能进入，
     *     如果能，再判断它能否进入 4 个相邻的格子 (i-1, j), (i+1, j), (i, j-1), (i, j+1)。
     * @param threshold 限定的数字
     * @param rows 行数
     * @param cols 列数
     * @return: int
     * @date: 2019-09-12 10:44
     * @auther: yimingzhao
     *
    */
    public int movingCount(int threshold, int rows, int cols) {
        if (threshold < 0 || rows < 1 || cols < 1) {
            return 0;
        }
        boolean[] visited = new boolean[rows * cols];
        return getCount(threshold, 0, 0, rows, cols, visited);
    }

    private int getCount(int threshold, int i, int j, int rows, int cols, boolean[] visited) {
        if (check(threshold, i, j, rows, cols, visited)) {
            visited[i * cols + j] = true;
            return 1 + getCount(threshold, i - 1, j, rows, cols, visited)
                    + getCount(threshold, i + 1, j, rows, cols, visited)
                    + getCount(threshold, i, j - 1, rows, cols, visited)
                    + getCount(threshold, i, j + 1, rows, cols, visited);
        }
        return 0;
    }

    private boolean check(int threshold, int i, int j, int rows, int cols, boolean[] visited) {
        return i >= 0 && i < rows && j >= 0 && j < cols && !visited[i * cols + j]
                && getDigitSum(i) + getDigitSum(j) <= threshold;
    }

    private int getDigitSum(int i) {
        int res = 0;
        while (i > 0) {
            res += i % 10;
            i /= 10;
        }
        return res;
    }
}
