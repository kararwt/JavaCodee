package com.company;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

// class of binary tree 
public class TopView {
	Node root;

	public TopView() {
		root = null;
	}

	// function should print the topView of
	// the binary tree
	private void TopView(Node root) {
		class QueueObj {
			Node node;
			int hd;

			QueueObj(Node node, int hd) {
				this.node = node;
				this.hd = hd;
			}
		}
		Queue<QueueObj> q = new LinkedList<QueueObj>();
		Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();

		if (root == null) {
			return;
		} else {
			q.add(new QueueObj(root, 0));
		}

		System.out.println("The top view of the tree is : ");

		// count function returns 1 if the container
		// contains an element whose key is equivalent
		// to hd, or returns zero otherwise.
		while (!q.isEmpty()) {
			QueueObj tmpNode = q.poll();
			// if (!topViewMap.containsKey(tmpNode.hd)) {
			topViewMap.put(tmpNode.hd, tmpNode.node);
			// }

			if (tmpNode.node.left != null) {
				q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1));
			}
			if (tmpNode.node.right != null) {
				q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1));
			}

		}
		for (Entry<Integer, Node> entry : topViewMap.entrySet()) {
			System.out.print(entry.getValue().data + " ");
		}
	}

	// Driver Program to test above functions
	public static void main(String[] args) {
		/*
		 * Create following Binary Tree 1 / \ 2 3 \ 4 \ 5 \ 6
		 */
		TopView tree = new TopView();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(3);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(25);
		System.out.println("Following are nodes in top view of Binary Tree");
		tree.TopView(tree.root);
	}

}