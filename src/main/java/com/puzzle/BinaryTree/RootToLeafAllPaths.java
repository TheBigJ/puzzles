package com.puzzle.BinaryTree;


/*
 * same logic for the sum, just instead of printing add all array values.
 * 
 */
public class RootToLeafAllPaths {

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		BinaryTreeNode headNode = bTree.createBinaryTree();
		System.out.println("=============Print All path from root to leaf node.===============");
		int[] values = new int[1000];
		int len = 0;
		PrintRootToLeafAllPaths(headNode, values, len);
	}

	private static void PrintRootToLeafAllPaths(BinaryTreeNode headNode, int[] values, int len) {
		if (headNode == null) {
			return;
		}
		values[len] = headNode.value;
		len++;
		if (headNode.left == null && headNode.right == null) {
			printArray(values, len);
			return;
		}
		PrintRootToLeafAllPaths(headNode.left, values, len);
		PrintRootToLeafAllPaths(headNode.right, values, len);
		
	}

	private static void printArray(int[] values, int len) {
		if (values.length >= 1) {
			for (int i = 0; i < len; i++) {
				System.out.print(values[i] + "   ");
			}
			System.out.println();
		}
	}
}
