package defaultPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem17 {

	public static List<String> letterCombinations(String digits) {

		if (digits.equals("")) {
			return new ArrayList<String>();
		}

		// Construct Map
		HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();

		map.put(0, null);
		map.put(1, null);

		// 2-6
		for (int i = 2; i <= 6; i++) {

			List<String> list = new ArrayList<String>();

			for (int j = 0; j < 3; j++) {
				list.add(String.valueOf((char) ('a' + (i - 2) * 3 + j)));
			}

			map.put(i, list);

		}

		// 7
		List<String> list1 = new ArrayList<String>();

		for (int j = 0; j < 4; j++) {
			list1.add(String.valueOf((char)('p' + j)));
		}

		map.put(7, list1);

		// 8
		List<String> list2 = new ArrayList<String>();

		for (int j = 0; j < 3; j++) {
			list2.add(String.valueOf((char)('t' + j)));
		}

		map.put(8, list2);

		// 9
		List<String> list3 = new ArrayList<String>();

		for (int j = 0; j < 4; j++) {
			list3.add(String.valueOf((char)('w' + j)));
		}

		map.put(9, list3);

		// Get results
		List<String> results = new ArrayList<String>();
		results.add("");

		List<String> resultsCopy = new ArrayList<String>();

		for (int k = 0; k < digits.length(); k++) {

			int foo = Integer.parseInt(String.valueOf(digits.charAt(k)));

			for (String s : map.get(foo)) {

				for (String r : results) {

					resultsCopy.add(r.concat(s));

				}

			}

			results.clear();

			for (String s : resultsCopy) {
				results.add(s);
			}

			resultsCopy.clear();

		}

		return results;

	}

	public static void main(String[] args) {

		String s = "23";

		List<String> letter = new ArrayList<String>();

		letter = letterCombinations(s);

		for (String l : letter) {
			System.out.println(l);
		}

	}

}
