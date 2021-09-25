package com.company;

public class ReverseList {
	class Node1 {
		int data;
		Node1 next;

		public Node1(int d) {
			data = d;
			next = null;
		}
	}

	Node1 root;

	public static void main(String... args) {
		ReverseList rv = new ReverseList();
		rv.push(1);
		rv.push(2);
		rv.push(3);
		rv.push(4);
		rv.push(5);
		rv.push(6);
		rv.push(7);
		rv.push(8);
		rv.push(9);
		rv.push(10);
		rv.printNode();
		int n = 3;
		rv.root = rv.reverseInGroup(rv.root, n);
		System.out.println("========");
		rv.printNode();
	}

	private Node1 reverseInGroup(Node1 root2, int n) {
		Node1 prev, next;
		prev = next = null;
		Node1 curr = root2;
		int count = 0;
		while (count < n && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}

		if (next != null) {
			root2.next = reverseInGroup(next, n);
		}
		return prev;

	}

	private void printNode() {
		Node1 temp = root;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	private void push(int i) {
		Node1 n = new Node1(i);
		n.next = root;
		root = n;

	}

}