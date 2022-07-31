package com.puzzle.FastAndSlowPointer;

public class DetechCycleInLL {

	public static void main(String[] args) {
		LinkList  head =  new LinkList(1);
		head.next = new LinkList(2);
		head.next.next = new LinkList(3);
		head.next.next.next = new LinkList(4);
		head.next.next.next.next = new LinkList(5);
		head.next.next.next.next.next = new LinkList(6);
		
		System.out.println("Link list has cycle: " + DetechCycleInLL.hasCycle(head));
		
        head.next.next.next.next.next.next = head.next;
		System.out.println("Link list has cycle: " + DetechCycleInLL.hasCycle(head));
	}

	private static boolean hasCycle(LinkList head) {
		if(head == null || head.next ==null) {
			return false;
		}
		LinkList slow = head;
		LinkList fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow  == fast ) {
				return true;
			}
		}
		return false;
	}

	
}


class LinkList{
	
	int value =0;
	LinkList next;
	
	public LinkList(int value) {
		this.value = value;
	}
	
}