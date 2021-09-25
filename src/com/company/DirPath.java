package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class Gp {
	public Gp(int i, List<Gp> ll, Gp object) {
		vertix = i;
		kids = ll;
		parent = object;
	}

	int vertix;
	List<Gp> kids;
	Gp parent;

	public Gp getParent() {
		return parent;
	}

	public void setParent(Gp parent) {
		this.parent = parent;
	}

	public int getVertix() {
		return vertix;
	}

	public void setVertix(int vertix) {
		this.vertix = vertix;
	}

	public List<Gp> getKids() {
		return kids;
	}

	public void setKids(List<Gp> kids) {
		this.kids = kids;
	}

}

public class DirPath {

	public static void main(String[] args) {

		Map<Integer, Gp> graph = new HashMap<>();
		Gp root = null;
		DirPath dir = new DirPath();

		root = new Gp(1, null, null);
		graph.put(root.getVertix(), root);

		Gp node = new Gp(2, null, null);
		dir.addNode(graph, root, node);

		node = new Gp(3, null, null);
		dir.addNode(graph, root, node);

		node = new Gp(4, null, null);
		dir.addNode(graph, graph.get(2), node);

		node = new Gp(5, null, null);
		dir.addNode(graph, graph.get(2), node);

		node = new Gp(6, null, null);
		dir.addNode(graph, graph.get(5), node);

		node = new Gp(7, null, null);
		dir.addNode(graph, root, node);

		printPath(root);

	}

	private void addNode(Map<Integer, Gp> graph, Gp node, Gp node2) {
		if (node.getKids() == null) {
			List<Gp> ll = new ArrayList<Gp>();
			ll.add(node2);
			node.setKids(ll);
			node2.setParent(node);
		} else {
			node.getKids().add(node2);
			node2.setParent(node);
		}
		graph.put(node2.getVertix(), node2);

	}

	private static void printPath(Gp root) {
		Stack<Gp> stk = new Stack<Gp>();

		stk.push(root);
		while (!stk.isEmpty()) {

			Gp curr = stk.pop();
			if (leafNode(curr)) {
				printNodes(curr);
			}

			List<Gp> childs = curr.getKids();
			if (childs != null) {
				for (int i = 0; i < childs.size(); i++) {
					Gp kid = childs.get(i);
					stk.push(kid);
				}
			}

		}

	}

	private static void printNodes(Gp curr) {
		while (curr != null) {
			System.out.print(curr.vertix);
			curr = curr.parent;
		}
		System.out.println("\n");

	}

	private static boolean leafNode(Gp curr) {
		if (curr.kids == null)
			return true;
		return false;

	}
}
