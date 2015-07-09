package defaultPackage;

public class Problem64 {

	public static int minPathSum(int[][] grid) {

		int m = grid.length;
		int n = grid[0].length;

		int[][] matrix = new int[m][n];

		matrix[0][0] = grid[0][0];

		for (int i = 1; i < n; i++) {
			matrix[0][i] = matrix[0][i - 1] + grid[0][i];
		}

		for (int j = 1; j < m; j++) {
			matrix[j][0] = matrix[j - 1][0] + grid[j][0];
		}

		for (int j = 1; j < m; j++) {
			for (int i = 1; i < n; i++) {

				if (matrix[j - 1][i] < matrix[j][i - 1]) {
					matrix[j][i] = matrix[j - 1][i] + grid[j][i];
				} else {
					matrix[j][i] = matrix[j][i - 1] + grid[j][i];
				}

			}
		}

		return matrix[m - 1][n - 1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
