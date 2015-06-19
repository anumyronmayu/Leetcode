package defaultPackage;

import java.util.Stack;

public class Problem20 {

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {

				stack.push(s.charAt(i));

			} else if (s.charAt(i) == ')' || s.charAt(i) == ']'
					|| s.charAt(i) == '}') {

				if(stack.isEmpty()){
					return false;
				}
				char c = stack.pop();

				if (c == '(' && s.charAt(i) == ')' || c == '{'
						&& s.charAt(i) == '}' || c == '[' && s.charAt(i) == ']') {

				} else {
					return false;
				}

			}

		}

		if (stack.isEmpty()) {

			return true;

		} else {

			return false;

		}

	}

	public static void main(String[] args) {

		String s = "{}";

		System.out.println(isValid(s));

	}

}
