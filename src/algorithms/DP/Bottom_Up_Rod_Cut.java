package algorithms.DP;

public class Bottom_Up_Rod_Cut {

	public static int bottomUpRodCut(int p[], int n) {

		int r[] = new int[n + 1];

		r[0] = 0;

		for (int j = 1; j <= n; j++) {
			int q = Integer.MIN_VALUE;

			for (int i = 1; i <= j; i++) {
				q = Math.max(q, p[i] + r[j - i]);
			}

			r[j] = q;
		}

		return r[n];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
