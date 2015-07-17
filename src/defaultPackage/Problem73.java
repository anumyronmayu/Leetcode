package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem73 {

	public void setZeroes(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					list.add(i);
					list.add(j);
				}
			}
		}

		for (int k = 0; k < list.size();) {
			int i = list.get(k);
			int j = list.get(k + 1);

			for (int s = 0; s < m; s++) {
				matrix[s][j] = 0;
			}

			for (int t = 0; t < n; t++) {
				matrix[i][t] = 0;
			}

			k = k + 2;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
