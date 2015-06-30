package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem19 {

	public static List<Integer> getRow(int rowIndex) {

		int numRows = rowIndex + 1;

		List<List<Integer>> results = new ArrayList<List<Integer>>();

		List<Integer> list = new ArrayList<Integer>();

		if (numRows == 0) {
			return list;
		}

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

		return results.get(rowIndex);
	}

	public static void main(String[] args) {
		
		System.out.println(getRow(1));

	}

}
