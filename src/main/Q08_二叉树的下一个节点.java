package main;

import common.TreeLinkNode;

/**
 * Title: Q08_二叉树的下一个节点
 * ProjectName: 剑指offer
 * Function:  二叉树的下一个节点
 * author     Yiming Zhao
 * Date:      2019-09-09 22:34
 */
public class Q08_二叉树的下一个节点 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        } else {
            while (pNode.next != null) {
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode) {
                    return parent;
                }
                pNode = pNode.next;
            }
            return null;
        }

    }
}

