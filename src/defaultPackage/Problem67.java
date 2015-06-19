package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem67 {

	public static String addBinary(String a, String b) {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "1";

		String b = "101";

		System.out.println(addBinary(a, b));

	}

}
