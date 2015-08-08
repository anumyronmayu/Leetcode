package defaultPackage;

public class Problem231 {

	public boolean isPowerOfTwo(int n) {

		if (n <= 0) {
			return false;
		}

		int count = 0;

		for (int i = 0; i < 32; i++) {

			count += n & 1;
			n = n >> 1;

		}

		if (count == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
