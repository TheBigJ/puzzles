package com.puzzle.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalTraversal {

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		BinaryTreeNode headNode = bTree.createBinaryTree();
		System.out.println("=============Recursion Vertical Travel.===============");
		int nodePos = 0;
		Map<Integer, List<Integer>> distanceVsVerticalNodes = new TreeMap<>();
		verticalTraversalRecursion(headNode, nodePos, distanceVsVerticalNodes);
		System.out.println("Vertical Travel Recursion: " + distanceVsVerticalNodes);

		Map<Integer, Integer> distanceVsVerticalNodeSum = new TreeMap<>();
		verticalSumRecursion(headNode, nodePos, distanceVsVerticalNodeSum);
		System.out.println("Vertical Sum Recursion: " + distanceVsVerticalNodeSum);

		/**
		 * with below changes the order of vertical travel will be preserved.
		 */
		Map<Integer, List<Integer>> distanceVsVerticalNodes3 = new TreeMap<>();
		verticalTravelIterative(headNode, nodePos, distanceVsVerticalNodes3);
		System.out.println("Vertical Level Order Path: " + distanceVsVerticalNodes3);

	}

	/**
	 * Level order traversal
	 * 
	 * In this approach the oder is preserved from top to bottom
	 * 
	 */
	private static void verticalTravelIterative(BinaryTreeNode headNode, int nodePos,
			Map<Integer, List<Integer>> levelOrderMap) {
		if (headNode == null) {
			return;
		}
		PairNode pair = new PairNode(0, headNode);
		Queue<PairNode> levelOrderQ = new LinkedList<>();
		levelOrderQ.add(pair);

		while (!levelOrderQ.isEmpty()) {
			PairNode pairNode = levelOrderQ.poll();
			if (levelOrderMap.containsKey(pairNode.pos)) {
				List<Integer> items = levelOrderMap.get(pairNode.pos);
				items.add(pairNode.node.value);
				levelOrderMap.put(pairNode.pos, items);
			} else {
				List<Integer> items = new LinkedList<>();
				items.add(pairNode.node.value);
				levelOrderMap.put(pairNode.pos, items);
			}

			if (pairNode.node.left != null) {
				levelOrderQ.add(new PairNode(pairNode.pos - 1, pairNode.node.left));
			}
			if (pairNode.node.right != null) {
				levelOrderQ.add(new PairNode(pairNode.pos + 1, pairNode.node.right));
			}

		}

	}

	/*
	 * pre-order traversal approach in recursion approach the order is not
	 * maintained though but the traversal is correct. This approach comes handy
	 * when we want to print vertical sum. Example.
	 */
	private static void verticalTraversalRecursion(BinaryTreeNode headNode, int nodePos,
			Map<Integer, List<Integer>> verticalMap) {
		if (headNode == null)
			return;

		if (verticalMap.containsKey(nodePos)) {
			List<Integer> values = verticalMap.get(nodePos);
			values.add(headNode.value);
			verticalMap.put(nodePos, values);
		} else {
			List<Integer> values = new LinkedList<>();
			values.add(headNode.value);
			verticalMap.put(nodePos, values);
		}

		verticalTraversalRecursion(headNode.left, nodePos - 1, verticalMap);
		verticalTraversalRecursion(headNode.right, nodePos + 1, verticalMap);
	}

	private static void verticalSumRecursion(BinaryTreeNode headNode, int nodePos, Map<Integer, Integer> verticalMap) {
		if (headNode == null)
			return;

		if (verticalMap.containsKey(nodePos)) {
			Integer value = verticalMap.get(nodePos);
			value = value + headNode.value;
			verticalMap.put(nodePos, value);
		} else {
			Integer value = headNode.value;
			verticalMap.put(nodePos, value);
		}

		verticalSumRecursion(headNode.left, nodePos - 1, verticalMap);
		verticalSumRecursion(headNode.right, nodePos + 1, verticalMap);
	}

}

class PairNode {
	int pos;
	BinaryTreeNode node;

	public PairNode() {
	}

	public PairNode(int pos, BinaryTreeNode node) {
		this.pos = pos;
		this.node = node;
	}

}
