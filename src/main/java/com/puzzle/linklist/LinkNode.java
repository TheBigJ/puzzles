package com.puzzle.linklist;

public class LinkNode {

	int value;
	LinkNode next;
	
	public LinkNode() {
		
	}
	public LinkNode(int value) {
		this.value = value;
		this.next = null;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}


