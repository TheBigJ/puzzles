package com.puzzle.FastAndSlowPointer;

public class StartOfCycle {

	public static void main(String[] args) {
		LinkList head = new LinkList(1);
		head.next = new LinkList(2);
		head.next.next = new LinkList(3);
		head.next.next.next = new LinkList(4);
		head.next.next.next.next = new LinkList(5);
		head.next.next.next.next.next = new LinkList(6);
		head.next.next.next.next.next.next = head.next;
		int length = StartOfCycle.cycleLength(head);
		System.out.println(length);
		System.out.println("Start of link list cycle node: " + getStartNode(length, head));
	}

	private static int getStartNode(int cycleLength, LinkList head) {
		System.out.println("Inside get start node.");
		int i = 0;
		LinkList slow = head;
		LinkList fast = head;
		while(i < cycleLength) {
			fast = fast.next;
			i++;
		}
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
			if(slow == fast) {
				return slow.value;
			}
		}
		return 0;
	}

	private static int cycleLength(LinkList head) {
		if (head == null || head.next == null) {
			return 0;
		}
		LinkList slow = head;
		LinkList fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return getCycleLength(slow);
			}
		}
		return 0;
	}

	private static int getCycleLength(LinkList slow) {
		LinkList cyclePointer = slow;
		int cycleLength = 0;
		 do{
			cycleLength++;
			cyclePointer = cyclePointer.next;
		}while (cyclePointer != slow);
		return cycleLength;
	}

}
