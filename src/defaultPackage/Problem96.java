package defaultPackage;

public class Problem96 {

	public int numTrees(int n) {

		int[] results = new int[n + 1];

		results[0] = 1;
		results[1] = 1;

		for (int i = 2; i <= n; i++) {

			int sum = 0;

			for (int j = 0; j < i; j++) {

				sum += results[j] * results[i - j - 1];

			}

			results[i] = sum;

		}

		return results[n];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
