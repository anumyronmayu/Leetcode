package javaLanguage;

import java.util.Stack;

public class JavaStack {

	public static String isEmpty(Stack<String> stack) {
		return stack.empty() ? "empty" : "not empty";
	}

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		System.out.println("now the stack is " + isEmpty(stack));
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		
		System.out.println("now the stack is " + isEmpty(stack));
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.search("2"));
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("now the stack is " + isEmpty(stack));

	}

}
