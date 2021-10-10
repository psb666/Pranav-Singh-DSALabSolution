package com.greatlearning.dsa;

import java.util.Stack;

public class balancedBrackets {
	private static boolean isBalanced(String bracketExpression) {
		Stack stack = new Stack();
		
		for (char c : bracketExpression.toCharArray()) {
			
			if( c == '(' || c == '{' || c == '[' ) {
				stack.push(c);
			}
			else {
				
				if (stack.isEmpty()) {
					return false;
				}
				
				Character d = (Character) stack.pop();
				
				if (c == '}' && d != '{' || ( c == ')' && d != '(' ) || (c == ']' && d != '[' ) ) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}
	public static void main ( String[] args) {
		String bracketExpression = "([[{}]])";
		
		if (isBalanced (bracketExpression)) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}

}
