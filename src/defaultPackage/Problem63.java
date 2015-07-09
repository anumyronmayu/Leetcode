package defaultPackage;

public class Problem63 {

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] matrix = new int[m][n];

		if (obstacleGrid[0][0] == 1) {
			matrix[0][0] = -1;
		} else {
			matrix[0][0] = 1;
		}

		for (int i = 1; i < m; i++) {

			if (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 0) {
				matrix[i][0] = 1;
			} else {
				matrix[i][0] = -1;
			}

		}

		for (int j = 1; j < n; j++) {

			if (obstacleGrid[0][j] == 0 && obstacleGrid[0][j - 1] == 0) {
				matrix[0][j] = 1;
			} else {
				matrix[0][j] = -1;
			}

		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {

				if (obstacleGrid[i - 1][j] == 0 && obstacleGrid[i][j - 1] == 0) {
					matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
				} else if (obstacleGrid[i - 1][j] == 0 && obstacleGrid[i][j - 1] == -1) {
					matrix[i][j] = matrix[i - 1][j];
				} else if (obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] == 0) {
					matrix[i][j] = matrix[i][j - 1];
				} else {
					matrix[i][j] = -1;
				}

			}
		}

		System.out.println(matrix[0][0]);
		System.out.println(matrix[0][1]);
		System.out.println(matrix[1][0]);
		System.out.println(matrix[1][1]);
		
		if (matrix[m - 1][n - 1] == -1) {
			return 0;
		} else {
			return matrix[m - 1][n - 1];
		}

	}

	public static void main(String[] args) {
		
		int[][] obstacleGrid = {{0,0},{0,1}};
		
		System.out.println(uniquePathsWithObstacles(obstacleGrid));

	}

}
