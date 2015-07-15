package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem48 {

	public void rotate(int[][] matrix) {

		int n = matrix.length;

		List<List<Integer>> listOfList = new ArrayList<List<Integer>>();

		for (int i = 0; i < n; i++) {

			List<Integer> list = new ArrayList<Integer>();

			for (int j = 0; j < n; j++) {
				list.add(matrix[j][i]);
			}

			listOfList.add(list);

		}

		int a = 0;

		for (List<Integer> list : listOfList) {

			int b = n - 1;

			for (int i : list) {
				matrix[a][b] = i;
				b--;
			}

			a++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
