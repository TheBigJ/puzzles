package com.puzzle.linklist;

public class LinkListImpl {

	public LinkNode InsertAtBeginning(LinkNode headNode, int value) {
		LinkNode newHead = new LinkNode(value);
		newHead.next = headNode;
		return newHead;
	}

	public LinkNode InsertAtEnd(LinkNode headNode, int value) {
		LinkNode travelNode = headNode;
		LinkNode newHead = new LinkNode(value);
		if (headNode == null) {
			return newHead;
		}
		while (travelNode != null) {
			if (travelNode.next == null) {
				travelNode.next = newHead;
                break;
			}
			travelNode = travelNode.next;
		}
		return headNode;
	}

	public void PrintLinklist(LinkNode linkNode) {
		if (linkNode == null) {
			System.out.println("List is empty.");
			return;
		}
		while (linkNode != null) {
			System.out.println(linkNode.value);
			linkNode = linkNode.next;
		}
	}
	
	public LinkNode ReverseLinkList(LinkNode headNode) {
		if (headNode == null) {
			System.out.println("List is empty.");
			return null;
		}else if(headNode.next == null) {
			return headNode;
		}
		LinkNode previous =  null;
		LinkNode nextNode ;
		while (headNode != null) {
			nextNode = headNode.next;
			headNode.next = previous;
			previous =  headNode;
			headNode = nextNode;
		}
		return previous;
	}
	
	public LinkNode reverseLinkListRecursion(LinkNode headNode) {
		if(headNode == null || headNode.next ==null) {
			return headNode;
		}
		LinkNode node = reverseLinkListRecursion(headNode.next);
		headNode.next.next = headNode;
		headNode.next = null;
		return node;
	}
	
	
public int findMidElementOfLinkList(LinkNode headNode) {
		if(headNode == null || headNode.next ==null) {
			return -1;
		} else if(headNode.next == null) {
			return headNode.value;
		}
		LinkNode slow = headNode;
		LinkNode fast = headNode;
		
		while(fast.next != null && fast.next.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.value;
	}

public int findNthEleFromEndLinkList(LinkNode headNode, int n) {
	if(headNode == null) {
		return -1;
	} 
	LinkNode slow = headNode;
	LinkNode fast = headNode;
	
	while(n>0) {
		n--;
		fast = fast.next;
	}
	while(fast.next != null) {
		slow = slow.next;
		fast = fast.next;
	}
	return slow.value;
}

}
