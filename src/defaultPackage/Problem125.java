package defaultPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem125 {

	public static boolean isPalindrome(String s) {

		boolean isPalindrome = true;

		List<Character> list = new ArrayList<Character>();

		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < 26; i++) {
			set.add((char) ('a' + i));
			set.add((char) ('A' + i));
		}

		for (int i = 0; i < 10; i++) {

			set.add((char) ('0' + i));

		}

		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {

				if ((s.charAt(i) - 'A') >= 0 && (s.charAt(i) - 'A') <= 26) {
					list.add((char) ('a' + s.charAt(i) - 'A'));
				} else {
					list.add(s.charAt(i));
				}

			}
		}

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) != list.get(list.size() - i - 1)) {
				
				isPalindrome = false;

			}

		}

		return isPalindrome;
	}

	public static void main(String args[]) {

		String s = "man, a plan, a canal: Panam";
		String b = "1a2";
		System.out.println(isPalindrome(b));
	}

}
