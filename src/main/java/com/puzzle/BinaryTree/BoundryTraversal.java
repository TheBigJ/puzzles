package com.puzzle.BinaryTree;

import java.util.Stack;

public class BoundryTraversal {

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		BinaryTreeNode headNode = bTree.createBinaryTree();
		System.out.println("=============Boundary order Travel.===============");
		BoundryTraversalForTree(headNode);
	}

	private static void BoundryTraversalForTree(BinaryTreeNode headNode) {
		printLeftEdge(headNode);
		printLeafNodes(headNode);
		printRightEdgeBottomUps(headNode, true);
	}

	private static void printRightEdgeBottomUps(BinaryTreeNode headNode, boolean ignoreHead) {
		Stack<Integer> values =new Stack<>();
		if (headNode.left == null && headNode.right == null) {
			return;
		}	
		if(!ignoreHead) {
		 values.add(headNode.value);
		}
		if (headNode.right != null) {
			printRightEdgeBottomUps(headNode.right, false);
		} else {
			printRightEdgeBottomUps(headNode.left, false);
		}
		
	
		while(!values.isEmpty()) {
			System.out.print(values.pop() + "  ");
		}
	}

	private static void printLeafNodes(BinaryTreeNode headNode) {
		if (headNode == null) {
			return;
		}
		printLeafNodes(headNode.left);
		if (headNode.right == null && headNode.left == null) {
			System.out.print(headNode.value + "  ");
		}
		printLeafNodes(headNode.right);
	}

	private static void printLeftEdge(BinaryTreeNode headNode) {
		if (headNode.left == null && headNode.right == null) {
			return;
		}
		System.out.print(headNode.value + "  ");
		if (headNode.left != null) {
			printLeftEdge(headNode.left);
		} else {
			printLeftEdge(headNode.right);
		}
	}

}
