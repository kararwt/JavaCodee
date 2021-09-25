package com.company;

import java.lang.*;
 class SolutionK {

    public static Tree first;
     public static  Tree last;
     public static Tree middle;
     public static Tree prev ;

    public static void main(String[] args) {
        Tree root = new Tree(20);
        root.left = new Tree(10);
        root.right = new Tree(15);
        root.left.left = new Tree(4);
        root.left.right = new Tree(36);
        printAncestors(root, 376);


    }

     private static void preTrav(Tree root) {
        if(root == null)
            return;
        preTrav(root.left);
        System.out.println(root.data);
        preTrav(root.right);
     }


     public static boolean printAncestors(Tree root, int target)
     {
         /* base cases */
         if (root == null)
             return false;

         if (root.data == target)
             return true;

        /* If target is present in either left or right subtree
           of this root, then print this root */
         if (printAncestors(root.left, target)
                 || printAncestors(root.right, target))
         {
             System.out.print(root.data + " ");
             return true;
         }

         /* Else return false */
         return false;
     }
 }

class Tree {
    Tree left;
    Tree right;
    int data;
    public Tree(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}