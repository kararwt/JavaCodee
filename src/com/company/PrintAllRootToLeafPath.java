package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class PrintAllRootToLeafPath

{
	NodeA root;

	/*
	 * Given a binary tree, print out all of its root-to-leaf paths, one per line.
	 * Uses a recursive helper to do the work.
	 */
	void printPaths(NodeA node) {
		int path[] = new int[1000];
		printPathsRecur(node, path, 0);
	}

	/*
	 * Recursive helper function -- given a node, and an array containing the path
	 * from the root node up to but not including this node, print out all the
	 * root-leaf paths.
	 */
	void printPathsRecur(NodeA node, int path[], int pathLen) {
		if (node == null)
			return;

		path[pathLen] = node.data;
		pathLen++;

		/* it's a leaf, so print the path that led to here */
		if (node.left == null && node.right == null)
			printArray(path, pathLen);
		else {
			/* otherwise try both subtrees */
			printPathsRecur(node.left, path, pathLen);
			printPathsRecur(node.right, path, pathLen);
		}
	}

	/* Utility function that prints out an array on a line. */
	void printArray(int ints[], int len) {
		int i;
		for (i = 0; i < len; i++) {
			System.out.print(ints[i] + " ");
		}
		System.out.println("");
	}

// driver program to test above functions 
	public static void main(String args[]) {
		PrintAllRootToLeafPath tree = new PrintAllRootToLeafPath();
		tree.root = new NodeA(10);
		tree.root.left = new NodeA(8);
		tree.root.right = new NodeA(2);
		tree.root.left.left = new NodeA(3);
		tree.root.left.right = new NodeA(5);
		tree.root.right.left = new NodeA(2);

		/* Let us test the built tree by printing Insorder traversal */
		tree.printPaths(tree.root);
	}
}
