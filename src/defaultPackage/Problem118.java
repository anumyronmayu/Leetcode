package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem118 {

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> results = new ArrayList<List<Integer>>();

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);

		results.add(list);

		for (int i = 1; i < numRows; i++) {

			List<Integer> list2 = new ArrayList<Integer>();

			List<Integer> last = new ArrayList<Integer>();

			last = results.get(results.size() - 1);

			list2.add(1);

			for (int j = 0; j <= last.size() - 2; j++) {

				list2.add(last.get(j) + last.get(j + 1));

			}

			list2.add(1);

			results.add(list2);

		}

		return results;

	}

	public static void main(String[] args) {
		System.out.println(generate(5));

	}

}
