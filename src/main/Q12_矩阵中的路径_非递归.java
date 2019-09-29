package main;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Title: Q12_矩阵中的路径_非递归
 * ProjectName: 剑指offer
 * Function:  TODO
 * author     Yiming Zhao
 * Date:      2019-09-23 16:34
 */
public class Q12_矩阵中的路径_非递归 {
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int[] marks = new int[rows*cols];

        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                Arrays.setAll(marks, i->0);
                if(isHasPath( matrix,  marks, rows, cols,  row, col,  str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isHasPath(char[] matrix,int[] marks,  int rows, int cols, int row, int col, char[] str) {
        int currentIndex = 0;
        int count = 0;
        // LinkedList<Integer> visitedStack = new LinkedList<>();
        LinkedList<Integer> rowStack = new LinkedList<>();
        LinkedList<Integer> colStack = new LinkedList<>();
        rowStack.push(row);
        colStack.push(col);
        int[][] newIndexes = new int[][]{
                {1, 0},  {-1, 0},  {0, 1}, {0, -1}
        };
        while (!rowStack.isEmpty()){
            count ++;
            int topX = colStack.peek();
            int topY = rowStack.peek();
            int topIndex = topY*cols + topX;
            if(currentIndex == str.length) {
                return true;
            }
            if(marks[topIndex] ==0) {
                if(matrix[topIndex]==str[currentIndex]) {
                    for(int j =0; j <newIndexes.length; ++ j){
                        int newX = topX + newIndexes[j][0];
                        int newY = topY + newIndexes[j][1];
                        if(newX>=0&&newX<cols && newY>=0 && newY<rows){
                            int newIndex = newY*cols+newX;
                            if(marks[newIndex] !=1){//not visited.
                                colStack.push(newX);
                                rowStack.push(newY);
                            }
                        }
                    }
                    marks[topIndex] = 1;
                    //visitedStack.push(topIndex);
                    currentIndex ++;
                }else {
                    colStack.pop();
                    rowStack.pop();
                }
            } else {
                //back to the visited
                marks[topIndex] = 0;
                colStack.pop();
                rowStack.pop();
//               if(visitedStack.size()>0)
//               visitedStack.pop();
                currentIndex --;
            }
        }
        String strlog = String.format("%d x %d: %d", cols, rows, count);
        System.out.println(strlog);
        return false;
    }
}
