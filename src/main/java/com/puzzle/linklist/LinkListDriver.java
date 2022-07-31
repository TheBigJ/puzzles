package com.puzzle.linklist;

public class LinkListDriver {

	public static void main(String[] args) {
		
		LinkListImpl linkListImpl = new LinkListImpl();
		
		LinkNode headNode = linkListImpl.InsertAtBeginning(null, 2);
		LinkNode headNode1 = linkListImpl.InsertAtBeginning(headNode, 1);
		LinkNode headNode2 = linkListImpl.InsertAtEnd(headNode1, 3);
		LinkNode headNode3 = linkListImpl.InsertAtEnd(headNode2, 4);
		LinkNode headNode4 = linkListImpl.InsertAtEnd(headNode3, 5);
		LinkNode headNode5 = linkListImpl.InsertAtEnd(headNode4, 6);
		//LinkNode headNode6 = linkListImpl.InsertAtEnd(headNode5, 7);
		linkListImpl.PrintLinklist(headNode5);
		System.out.println("==========================================");
		System.out.println("Mid element of LL: "+ linkListImpl.findMidElementOfLinkList(headNode5));
		System.out.println("Nth element from last of LL: "+ linkListImpl.findNthEleFromEndLinkList(headNode5, 0));
		/*
		 * LinkNode headNode6 = linkListImpl.reverseLinkListRecursion(headNode5);
		 * linkListImpl.PrintLinklist(headNode6);
		 */
		
	}

}
