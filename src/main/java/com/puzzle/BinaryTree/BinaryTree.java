package com.puzzle.BinaryTree;

public class BinaryTree {
	
	BinaryTreeNode createBinaryTree(){
		BinaryTreeNode rootNode = new BinaryTreeNode(40);
		BinaryTreeNode node20=new BinaryTreeNode(20);
		BinaryTreeNode node10=new BinaryTreeNode(10);
		BinaryTreeNode node30=new BinaryTreeNode(30);
		BinaryTreeNode node60=new BinaryTreeNode(60);
		BinaryTreeNode node50=new BinaryTreeNode(50);
		BinaryTreeNode node70=new BinaryTreeNode(70);
		BinaryTreeNode node55=new BinaryTreeNode(55);
		BinaryTreeNode node5=new BinaryTreeNode(5);
		
		
		
		BinaryTreeNode node45=new BinaryTreeNode(45);
		BinaryTreeNode node90 = new BinaryTreeNode(90);
		/*
		BinaryTreeNode node95 = new BinaryTreeNode(95);
		BinaryTreeNode node96 = new BinaryTreeNode(96);
		*/
		rootNode.left = node20;
        rootNode.right=node60;
        node20.left=node10;
        node20.right=node30;
        node60.left=node50;
        node60.right=node70; 
        node50.right=node55;
        node30.left=node5;
        
        node5.left=node45;
        node45.left=node90;
        
        
        
        
		/*
		 * node30.right = node90; node90.left = node95; node95.right = node96;
		 */	
		return rootNode;
		
	}
}

 class BinaryTreeNode {

	BinaryTreeNode left;
	BinaryTreeNode right;
	int value;
	
	public BinaryTreeNode() {
		
	}
	
	public BinaryTreeNode(int value) {
		this.left = null;
		this.right = null;
		this.value = value;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
