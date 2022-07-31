package com.puzzle.stacks;

import java.util.Stack;

public class StackReverseRecursion {

	public static void main(String[] args) {

		Stack<Integer> inputStack = new Stack<>();
		inputStack.add(1);
		inputStack.add(2);
		inputStack.add(3);
		inputStack.add(4);
		inputStack.add(5);
		System.out.println("Original Stack:  " + inputStack);
		stackReverseRecursion(inputStack);
		System.out.println("Reverse  Stack:  " + inputStack);
	}

	private static void stackReverseRecursion(Stack<Integer> inputStack) {
		if (inputStack.isEmpty()) {
			return;
		} else {
			int ele = inputStack.pop();
			stackReverseRecursion(inputStack);
			placeAtbottom(ele, inputStack);
		}
	}

	private static void placeAtbottom(int ele, Stack<Integer> inputStack) {
		if(inputStack.isEmpty()) {
			inputStack.push(ele);
			return;
		}
		int x = inputStack.pop();
		placeAtbottom(ele,inputStack);
		inputStack.push(x);
	}

}
