package defaultPackage;

public class Problem66 {

	public static int[] plusOne(int[] digits) {

		int n = digits.length;

		int add = 1;

		for (int i = n - 1; i >= 0; i--) {

			if (digits[i] == 9) {

				if (add == 1) {
					digits[i] = 0;
					add = 1;
				} else {
					digits[i] = 9;
					add = 0;
				}

			} else {

				if (add == 1) {
					digits[i] = digits[i] + 1;
					add = 0;
				}

			}

		}

		if (add == 0) {

			return digits;

		} else {

			int[] results = new int[n + 1];

			results[0] = 1;

			for (int j = 0; j < n; j++) {
				results[j + 1] = digits[j];
			}

			return results;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
