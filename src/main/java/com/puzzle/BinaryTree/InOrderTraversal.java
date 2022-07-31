package com.puzzle.BinaryTree;

import java.util.Stack;

public class InOrderTraversal {

	public static void main(String[] args) {
		BinaryTree  bTree = new BinaryTree();
		BinaryTreeNode headNode = bTree.createBinaryTree();
		System.out.println("=============Recursion Inorder Travel.===============");
		InOrderRecursion(headNode);
		System.out.println("\n");
		System.out.println("=============Iterative Inorder Travel.===============");
		InOrderIteration(headNode);
	}
	
	private static void InOrderRecursion(BinaryTreeNode headNode) {
		if(headNode == null)
			return;
		InOrderRecursion(headNode.left);
		System.out.print(headNode.getValue() + "  ");
		InOrderRecursion(headNode.right);
	}
	
	private static void InOrderIteration(BinaryTreeNode headNode) {
		Stack<BinaryTreeNode> inOrderStack = new Stack<>();
		inOrderStack.add(headNode);
		while (!inOrderStack.isEmpty()) {
			
			BinaryTreeNode peekedNode = inOrderStack.pop();
			
			if(peekedNode.right != null) {
				inOrderStack.add(peekedNode.right);
			}
			inOrderStack.add(peekedNode);
			if(peekedNode.left != null) {
				inOrderStack.add(peekedNode.left);
			}
			if(peekedNode.left == null && peekedNode.right == null) {
				System.out.print(inOrderStack.pop().value+"  ");
			} else {
			peekedNode.left = null;
			peekedNode.right = null;
			}
		}
	}

}
