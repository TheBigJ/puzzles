package com.puzzle.BinaryTree;

import java.util.Stack;

public class PreOrderTraversal {

	public static void main(String[] args) {
		BinaryTree  bTree = new BinaryTree();
		BinaryTreeNode headNode = bTree.createBinaryTree();
		System.out.println("=============Recursion Preorder Travel===============");
		preOrderRecursion(headNode);
		System.out.println("\n");
		System.out.println("=============Iterative Preorder Travel===============");
		preOrderIteration(headNode);
		System.out.println("\n");
		System.out.println("=====Final Head Value========:   "+ headNode.value);

	}
	
	private static void preOrderRecursion(BinaryTreeNode headNode) {
		if(headNode == null)
			return;
		System.out.print(headNode.getValue() + "  ");
		preOrderRecursion(headNode.left);
		preOrderRecursion(headNode.right);
	}
	
	private static void preOrderIteration(BinaryTreeNode headNode) {
		Stack<BinaryTreeNode> preOrderStack = new Stack<>();
		preOrderStack.add(headNode);
		while(!preOrderStack.isEmpty()) {
			BinaryTreeNode poppedNode =  preOrderStack.pop();
			System.out.print(poppedNode.value + "  ");
			
			if(poppedNode.right != null) {
				preOrderStack.add(poppedNode.right);
			}
			if(poppedNode.left != null) {
				preOrderStack.add(poppedNode.left);
			}
		}
	}

}
