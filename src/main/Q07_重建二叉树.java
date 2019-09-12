package main;

import common.TreeNode;

import java.util.Arrays;

/**
 * Title: Q07_重建二叉树
 * ProjectName: 剑指offer
 * Function:  重建二叉树
 * author     Yiming Zhao
 * Date:      2019-09-09 21:52
 */
public class Q07_重建二叉树 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        // 在中序遍历中找到前序遍历的根节点
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                // 左子树，注意copyOfRange 函数，左闭右开
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i +1), Arrays.copyOfRange(in, 0,  i));
                // 右子树，注意copyOfRange 函数，左闭右开
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length),Arrays.copyOfRange(in, i + 1, in.length));
                break;
            }
        }
        return root;
    }
}
