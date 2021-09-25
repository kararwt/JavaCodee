package com.company;/*
 * k0r02ds
 * created on 27/11/20
 */


import java.util.LinkedList;
import java.util.Queue;

class Tree14 {
    Tree14 left;
    Tree14 right;
    int data;

    public Tree14(int data) {
        this.data = data;
    }

    public static void print(Tree14 root) {
        Tree14 curr = root;
        Queue<Tree14> tt = new LinkedList<>();
        tt.add(curr);
        while (tt.size() > 0) {
            Tree14 temp = tt.remove();

            System.out.println(temp.data);
            if (temp.left != null)
                tt.add(temp.left);
            if (temp.right != null)
                tt.add(temp.right);
        }

    }

}


public class LevelOrderTraversal {
    public static void main(String[] args) {
        Tree14 t1 = new Tree14(1);
        Tree14 t2 = new Tree14(2);
        Tree14 t3 = new Tree14(3);
        Tree14 t4 = new Tree14(4);
        Tree14 t5 = new Tree14(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        Tree14 root = t1;
        Tree14.print(root);
    }

}
