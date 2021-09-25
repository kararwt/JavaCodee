package com.company;

public class BTIsBST {
	// Root of the Binary Tree
	Node root;

	// To keep tract of previous node in Inorder Traversal
	Node prev;

	boolean isBST() {
		prev = null;
		return isBST(root);
	}

	/*
	 * Returns true if given search tree is binary search tree (efficient version)
	 */
	boolean isBST(Node node) {
		if (node == null)
			return true;
		// traverse the tree in inorder fashion and
		// keep a track of previous node

		if (isBST(node.left) == false)
			return false;

		// allows only distinct values node
		// prev means node at lower level
		if (prev != null && node.data <= prev.data)
			return false;
		prev = node;
		return isBST(node.right);
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		BTIsBST tree = new BTIsBST();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);

		if (tree.isBST())
			System.out.println("IS BST");
		else
			System.out.println("Not a BST");
	}
}
