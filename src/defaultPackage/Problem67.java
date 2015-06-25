package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem67 {

	public static String addBinary1(String a, String b) {

		int add = 0;

		List<Character> list = new ArrayList<Character>();

		if (a.charAt(0) == '0' && b.charAt(0) == '0') {

			if (add == 0) {
				list.add('0');
				add = 0;
			} else {
				list.add('1');
				add = 0;
			}

		} else if (a.charAt(0) == '0' && b.charAt(0) == '1') {

			if (add == 0) {
				list.add('1');
				add = 0;
			} else {
				list.add('0');
				add = 1;
			}

		} else if (a.charAt(0) == '1' && b.charAt(0) == '0') {

			if (add == 0) {
				list.add('1');
				add = 0;
			} else {
				list.add('0');
				add = 1;
			}

		} else {

			if (add == 0) {
				list.add('0');
				add = 1;
			} else {
				list.add('1');
				add = 1;
			}

		}

		return null;

	}

	public static String addBinary(String a, String b) {

		int minAB = Math.min(a.length(), b.length());

		List<Character> list = new ArrayList<Character>();

		int add = 0;

		for (int i = 0; i < minAB; i++) {

			if (a.charAt(a.length() - 1 - i) == '0'
					&& b.charAt(b.length() - 1 - i) == '0') {

				if (add == 0) {
					list.add('0');
					add = 0;
				} else {
					list.add('1');
					add = 0;
				}

			} else if (a.charAt(a.length() - 1 - i) == '1'
					&& b.charAt(b.length() - 1 - i) == '1') {

				if (add == 0) {
					list.add('0');
					add = 1;
				} else {
					list.add('1');
					add = 1;
				}

			} else {

				if (add == 0) {
					list.add('1');
					add = 0;
				} else {
					list.add('0');
					add = 1;
				}

			}
		}

		if (a.length() >= b.length()) {

			for (int j = 0; j < a.length() - b.length(); j++) {

				if (a.charAt(a.length() - minAB - 1 - j) == '0') {
					if (add == 0) {

						list.add('0');
						add = 0;

					} else {
						list.add('1');
						add = 0;
					}
				} else {

					if (add == 0) {

						list.add('1');
						add = 0;

					} else {
						list.add('0');
						add = 1;
					}

				}

			}

		} else {

			for (int j = 0; j < b.length() - a.length(); j++) {

				if (b.charAt(b.length() - minAB - 1 - j) == '0') {
					if (add == 0) {

						list.add('0');
						add = 0;

					} else {
						list.add('1');
						add = 0;
					}
				} else {
					if (add == 0) {

						list.add('1');
						add = 0;

					} else {
						list.add('0');
						add = 1;
					}
				}

			}
		}

		if (add == 1) {
			list.add('1');
		}

		int resultLength;
		if (add == 1) {
			resultLength = Math.max(a.length(), b.length()) + 1;

		} else {

			resultLength = Math.max(a.length(), b.length());

		}

		char result[] = new char[resultLength];
		int index = resultLength - 1;

		for (char c : list) {

			result[index--] = c;

		}

		return String.valueOf(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "11";

		String b = "1";

		System.out.println(addBinary(a, b));

	}

}
