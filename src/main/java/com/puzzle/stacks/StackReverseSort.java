package com.puzzle.stacks;

import java.util.Stack;

public class StackReverseSort {

	public static void main(String[] args) {

		Stack<Integer> inputStack = new Stack<>();
		inputStack.add(5);
		inputStack.add(2);
		inputStack.add(1);
		inputStack.add(3);
		inputStack.add(4);
		System.out.println("Original Stack:  " + inputStack);
		stackSortRecursion(inputStack);
		System.out.println("Sort  Stack:  " + inputStack);
	}

	private static void stackSortRecursion(Stack<Integer> inputStack) {
		if (inputStack.isEmpty()) {
			return;
		} else {
			int ele = inputStack.pop();
			stackSortRecursion(inputStack);
			sortedInsert(ele, inputStack);
		}
	}

	private static void sortedInsert(int ele, Stack<Integer> inputStack) {
		if(inputStack.isEmpty() || ele > inputStack.peek()) {
			inputStack.push(ele);
			return;
		}
		
		int x = inputStack.pop();
		sortedInsert(ele, inputStack);
		inputStack.push(x);
	}

}
