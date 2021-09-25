package com.company;

class NodeA {
	int data;
	NodeA left, right;

	public NodeA(int item) {
		data = item;
		left = right = null;
	}
}

public class CommonAncestor {
	// Root of the Binary Tree
	NodeA root;

	NodeA findLCA(int n1, int n2) {
		return findLCA(root, n1, n2);
	}

	// This function returns pointer to LCA of two given
	// values n1 and n2. This function assumes that n1 and
	// n2 are present in Binary Tree
	NodeA findLCA(NodeA node, int n1, int n2) {
		// Base case
		if (node == null)
			return null;

		// If either n1 or n2 matches with root's key, report
		// the presence by returning root (Note that if a key is
		// ancestor of other, then the ancestor key becomes LCA
		if (node.data == n1 || node.data == n2)
			return node;

		// Look for keys in left and right subtrees
		NodeA left_lca = findLCA(node.left, n1, n2);
		NodeA right_lca = findLCA(node.right, n1, n2);

		// If both of the above calls return Non-NULL, then one key
		// is present in once subtree and other is present in other,
		// So this node is the LCA
		if (left_lca != null && right_lca != null)
			return node;

		// Otherwise check if left subtree or right subtree is LCA
		return (left_lca != null) ? left_lca : right_lca;
	}

	/* Driver program to test above functions */
	public static void main(String args[]) {
		CommonAncestor tree = new CommonAncestor();
		tree.root = new NodeA(1);
		tree.root.left = new NodeA(2);
		tree.root.right = new NodeA(3);
		tree.root.left.left = new NodeA(4);
		tree.root.left.right = new NodeA(5);
		tree.root.right.left = new NodeA(6);
		tree.root.right.right = new NodeA(7);
		// System.out.println("LCA(4, 5) = " + tree.findLCA(4, 5).data);
		System.out.println("LCA(4, 6) = " + tree.findLCA(4, 8).data);
		System.out.println("LCA(3, 4) = " + tree.findLCA(3, 4).data);
		System.out.println("LCA(2, 4) = " + tree.findLCA(2, 4).data);
	}
}
