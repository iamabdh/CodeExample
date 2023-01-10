package io.code;

import java.util.Stack;

public class CodeExample {
	
	public static void main(String[] arg) {
		System.out.println(checkingValidStatementBalance(null));
		
	}
	
	public static boolean checkingValidStatementBalance(String str) {
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		try {
			while (i < str.length()) {
				if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
					stack.push(str.charAt(i));
				} else if (str.charAt(i) == '}') {
					if (!stack.isEmpty() && stack.peek() == '{') {
						stack.pop();	
					}
					else {
						stack.push(str.charAt(i));
					}
				} else if (str.charAt(i) == ')') {	
					if (!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();	
					}
					else {
						stack.push(str.charAt(i));
					}
				} else if (str.charAt(i) == ']') {	
						if (!stack.isEmpty() && stack.peek() == '[') {
							stack.pop();	
						}
						else {
							stack.push(str.charAt(i));
						}
					} 
				i ++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return stack.isEmpty();
	}
}
