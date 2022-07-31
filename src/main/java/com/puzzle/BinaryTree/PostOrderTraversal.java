package com.puzzle.BinaryTree;

import java.util.Stack;

public class PostOrderTraversal {

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		BinaryTreeNode headNode = bTree.createBinaryTree();
		System.out.println("=============Recursion Postorder Travel===============");
		postOrderRecursion(headNode);
		System.out.println("\n");
		System.out.println("=============Iterative Postorder Travel===============");
		postOrderIteration(headNode);

	}

	private static void postOrderRecursion(BinaryTreeNode headNode) {
		if (headNode == null)
			return;
		postOrderRecursion(headNode.left);
		postOrderRecursion(headNode.right);
		System.out.print(headNode.getValue() + "  ");
	}

	private static void postOrderIteration(BinaryTreeNode headNode) {
		Stack<BinaryTreeNode> postOrderStack = new Stack<>();
		postOrderStack.add(headNode);
		while (!postOrderStack.isEmpty()) {
			BinaryTreeNode peekedNode = postOrderStack.peek();
			if (peekedNode.right != null) {
				postOrderStack.add(peekedNode.right);
			}
			if (peekedNode.left != null) {
				postOrderStack.add(peekedNode.left);
			}
			if (peekedNode.left == null && peekedNode.right == null) {
				System.out.print(postOrderStack.pop().value + "  ");
			} else {
				peekedNode.left = null;
				peekedNode.right = null;
			}

		}
	}
}
