package defaultPackage;

public class Problem191 {

	public int hammingWeight(int n) {

		int sum = 0;

		for (int i = 0; i < 32; i++) {

			sum += (n & 1);
			n = n >>> 1;

		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
