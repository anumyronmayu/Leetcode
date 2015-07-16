package defaultPackage;

public class Problem69 {

	public int mySqrt(int x) {

		int i = 0;

		while (Math.pow(i, 2) <= x) {
			i++;
		}

		return i - 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
