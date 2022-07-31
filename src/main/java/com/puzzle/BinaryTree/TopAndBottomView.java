package com.puzzle.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopAndBottomView {

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		BinaryTreeNode headNode = bTree.createBinaryTree();
		System.out.println("=============Recursion Vertical Travel.===============");
		int nodePos = 0;
		
		Map<Integer, List<Integer>> distanceVsVerticalNodes = new TreeMap<>();
		verticalTravelIterative(headNode, nodePos, distanceVsVerticalNodes);
		
		// for top view print only 1st element from each row
		printTopView(distanceVsVerticalNodes);
		
		// for bottom view print only last element from each row
		printBottomView(distanceVsVerticalNodes);

	}

	// for bottom view print only last element from each row
	private static void printBottomView(Map<Integer, List<Integer>> distanceVsVerticalNodes) {
		System.out.println("===========bottom view===============");
		for(int key : distanceVsVerticalNodes.keySet()) {
			List<Integer> values = distanceVsVerticalNodes.get(key);
			System.out.print(values.get(values.size()-1)+"   ");
		}
		System.out.println();
	}
	
	// for top view print only 1st element from each row
	private static void printTopView(Map<Integer, List<Integer>> distanceVsVerticalNodes) {
		System.out.println("===========Top view===============");
		for(int key : distanceVsVerticalNodes.keySet()) {
			List<Integer> values = distanceVsVerticalNodes.get(key);
			System.out.print(values.get(0)+"   ");
		}
		System.out.println();
	}

	/**
	 * Level order traversal
	 * In this approach the oder is preserved from top to bottom
	 * So for both top and bottom view this order preserve is main 
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
	
}

