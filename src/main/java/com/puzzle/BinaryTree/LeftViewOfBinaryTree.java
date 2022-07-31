package com.puzzle.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/***
 * same for the right view
 * @author abhijeets
 *
 */
public class LeftViewOfBinaryTree {

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		BinaryTreeNode headNode = bTree.createBinaryTree();
		System.out.println("=============Print left View of Binary Tree.===============");
		PrintLeftViewOfTree(headNode);
	}

	private static void PrintLeftViewOfTree(BinaryTreeNode headNode) {
		if (headNode == null) {
			return;
		}
		Queue<BinaryTreeNode> firstQ = new LinkedList<>();
		Queue<BinaryTreeNode> secondQ = new LinkedList<>();

		firstQ.add(headNode);

		while (!firstQ.isEmpty() || !secondQ.isEmpty()) {

			printArray(firstQ);
			while (!firstQ.isEmpty()) {
				BinaryTreeNode node = firstQ.poll();
				if (node.left != null) {
					secondQ.add(node.left);
				}
				if (node.right != null) {
					secondQ.add(node.right);
				}
			}

			printArray(secondQ);
			while (!secondQ.isEmpty()) {

				BinaryTreeNode node = secondQ.poll();
				if (node.left != null) {
					firstQ.add(node.left);
				}
				if (node.right != null) {
					firstQ.add(node.right);
				}

			}

		}
	}

	private static void printArray(Queue<BinaryTreeNode> qToPrint) {
		while (!qToPrint.isEmpty()) {
			System.out.print(qToPrint.peek().value + "  ");
			break;
		}
		System.out.println();
	}
}
