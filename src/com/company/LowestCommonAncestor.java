package com.company;/*
 * k0r02ds
 * created on 28/11/20
 */

import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Tree11 t1 = new Tree11(1);
        Tree11 t2 = new Tree11(2);
        Tree11 t3 = new Tree11(3);
        Tree11 t4 = new Tree11(4);
        Tree11 t5 = new Tree11(5);
        Tree11 t6 = new Tree11(6);
        Tree11 t7 = new Tree11(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        Tree11 root = t1;
        leveOrder(root);

       /* Tree11 res = find(root, 10, 9);

        if(res != null)
        System.out.println("res " + res.data);*/
    }

    private static void leveOrder(Tree11 root) {
        Queue<Tree11> queue = new LinkedList<>();

        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                size--;
                Tree11 curr = queue.poll();
                System.out.print(curr.data);
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
            System.out.println();
        }
    }


    private static Tree11 find(Tree11 root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Tree11 left_t = find(root.left, n1, n2);
        Tree11 right_t = find(root.right, n1, n2);
        if (left_t != null && right_t != null)
            return root;

        return (left_t != null ? left_t : right_t);

    }
}

class Tree11 {
    Tree11 left;
    Tree11 right;
    int data;

    Tree11(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
