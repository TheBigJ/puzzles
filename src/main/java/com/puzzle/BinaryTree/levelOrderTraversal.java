package com.puzzle.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {

	public static void main(String[] args) {
		BinaryTree  bTree = new BinaryTree();
		BinaryTreeNode headNode = bTree.createBinaryTree();
		System.out.println("=============Level order Travel.===============");
		LevelOrderIteration(headNode);
	}

	private static void LevelOrderIteration(BinaryTreeNode headNode) {
		Queue<BinaryTreeNode> levelOrderQueue = new LinkedList<>();
		levelOrderQueue.add(headNode);
		while (!levelOrderQueue.isEmpty()) {
			BinaryTreeNode peekedNode = levelOrderQueue.poll();
			if(peekedNode.left != null) {
				levelOrderQueue.add(peekedNode.left);
			}
			if(peekedNode.right != null) {
				levelOrderQueue.add(peekedNode.right);
			}
			System.out.print(peekedNode.value + "  ");
		}
	}

}
