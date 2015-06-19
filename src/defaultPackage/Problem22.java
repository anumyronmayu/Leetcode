package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {

	public static List<String> generateParenthesis(int n) {

		List<String> list = new ArrayList<String>();
		List<String> tempList = new ArrayList<String>();

		String a = "";
		String b = "";
		String c = "";

		// n = 0
		list.add("");

		// n = 1

		for (int i = 0; i < n; i++) {
			tempList.clear();
			for (String s : list) {
				tempList.add(s);
			}

			for (String s : tempList) {
				a = "(".concat(s).concat(")");
				b = "()".concat(s);
				c = s.concat("()");

				list.add(a);

				if (!b.equals(a)) {
					list.add(b);
				}

				if (!c.equals(b)) {
					list.add(c);
				}

				list.remove(s);

			}
		}

		return list;

	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		int n = 2;

		list = generateParenthesis(n);

		for (String s : list) {
			System.out.println(s);
		}

	}

}
