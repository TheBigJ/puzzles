package com.puzzle.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagOrderTraversal {

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		BinaryTreeNode headNode = bTree.createBinaryTree();
		System.out.println("=============Level order Travel.===============");
		LevelOrderIteration(headNode);
	}

	private static void LevelOrderIteration(BinaryTreeNode headNode) {
		Stack<BinaryTreeNode> spiralOrderStack = new Stack<>();
		Queue<BinaryTreeNode> spiralOrderQueue = new LinkedList<>();
		spiralOrderStack.add(headNode);
		while (!spiralOrderQueue.isEmpty() || !spiralOrderStack.isEmpty()) {
			while (!spiralOrderStack.isEmpty()) {
				BinaryTreeNode peekedNode = spiralOrderStack.pop();
				if (peekedNode.left != null) {
					spiralOrderQueue.add(peekedNode.left);
				}
				if (peekedNode.right != null) {
					spiralOrderQueue.add(peekedNode.right);
				}
				System.out.print(peekedNode.value + "  ");
			}
			
			while (!spiralOrderQueue.isEmpty()) {
				BinaryTreeNode peekedNode = spiralOrderQueue.poll();
				if (peekedNode.left != null) {
					spiralOrderStack.add(peekedNode.left);
				}
				if (peekedNode.right != null) {
					spiralOrderStack.add(peekedNode.right);
				}
				System.out.print(peekedNode.value + "  ");
			}
		}
	}
}
